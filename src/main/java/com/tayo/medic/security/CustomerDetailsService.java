package com.tayo.medic.security;


import com.tayo.medic.dao.CustomerRepository;
import com.tayo.medic.model.Customer;
import org.hibernate.validator.internal.constraintvalidators.hv.EmailValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Authenticate a user from the database.
 */
@Component("customerDetailsService")
public class CustomerDetailsService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(CustomerDetailsService.class);

    private final CustomerRepository customerRepository;

    public CustomerDetailsService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {
        log.debug("Authenticating user '{}'", login);

        if (new EmailValidator().isValid(login, null)) {
            return customerRepository.findOneWithAuthoritiesByEmailIgnoreCase(login)
                    .map(customer -> createSpringSecurityUser(login, customer))
                    .orElseThrow(() -> new UsernameNotFoundException("User with email " + login + " was not found in the database"));
        }

        //TODO: to be fixed
        return null;
    }


    private org.springframework.security.core.userdetails.User createSpringSecurityUser(String lowercaseLogin, Customer customer) {
//        if (!customer.isActivated()) {
//            throw new UserNotActivatedException("User " + lowercaseLogin + " was not activated");
//        }
        List<GrantedAuthority> grantedAuthorities = customer.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
                .collect(Collectors.toList());
        return new org.springframework.security.core.userdetails.User(customer.getEmail(),
                customer.getPassword(),
                grantedAuthorities);
    }


}


