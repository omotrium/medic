package com.tayo.medic.controller;


import com.tayo.medic.exception.GlobalRestException;
import com.tayo.medic.model.Hospital;
import com.tayo.medic.model.Patient;

import com.tayo.medic.model.Response;
import com.tayo.medic.model.User;
import com.tayo.medic.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/api")
public class AdminController {


    @Autowired
    private ServletContext servletContext;

    @Autowired
    HttpServletRequest request;

    @Autowired
    AdminService adminService;



    final static Logger LOGGER = LoggerFactory.getLogger(AdminController.class);


    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }



        @SuppressWarnings("all")
    @RequestMapping(value = "/signUp", method = RequestMethod.POST, consumes = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<?> signUp(@RequestBody User request) {



            Response response = adminService.signUp(request);


        LOGGER.info("info " + response);


        if (response != null)
            return new ResponseEntity<>(response, HttpStatus.OK);
        else
            throw new GlobalRestException("99", "Oops Something went wrong");





    }


    @SuppressWarnings("all")
    @RequestMapping(value = "/addPatient", method = RequestMethod.POST, consumes = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<?> addPatient(@RequestBody Patient request) {

        Response response = adminService.addPatient(request);

        LOGGER.info("patient " + response);

        if (response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else {
            throw new GlobalRestException("99", "Oops Something went wrong");


        }

    }

    @SuppressWarnings("all")
    @RequestMapping(value = "/getHospital", method = RequestMethod.POST, consumes = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<?> getHospital(@RequestBody Hospital hospital) {

        List<Hospital> response = adminService.getHospital(hospital);

        LOGGER.info("patient " + response);

        if (response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        }else {
            throw new GlobalRestException("99", "Oops Something went wrong");


        }

    }

}
