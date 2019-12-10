package com.tayo.medic.dao;

import com.tayo.medic.model.Hospital;
import com.tayo.medic.model.Patient;
import com.tayo.medic.model.Response;
import com.tayo.medic.model.User;

import java.util.List;


public interface AdminDao {

    Response signUp(User request);

    Response addPatient(Patient request);

    List<Hospital> getHospital(Hospital request);
}
