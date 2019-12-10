package com.tayo.medic.service;

import com.tayo.medic.dao.AdminDao;
import com.tayo.medic.model.Hospital;
import com.tayo.medic.model.Patient;
import com.tayo.medic.model.Response;
import com.tayo.medic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("adminService")
public class AdminService {


    @Autowired
    AdminDao dao;

    @Autowired
    Environment environment;



    public Response signUp(User request) {

        return dao.signUp(request);
    }

    public Response addPatient(Patient request) {

        return dao.addPatient(request);
    }

    public List<Hospital> getHospital(Hospital request) {
        return dao.getHospital(request);
    }
}
