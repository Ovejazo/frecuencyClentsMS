package com.tutorial.frecuencyclentsservice.service;

import com.tutorial.frecuencyclentsservice.entity.FrecuencyClentsEntity;
//import com.tutorial.frecuencyclentsservice.repository.FrecuencyClentsRepository;
//import edu.mtisw.payrollbackend.repositories.EmployeeRepository;
//import edu.mtisw.payrollbackend.repositories.ExtraHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FrecuencyClentsService {

    public double getFrecuency(Integer frecuency){

        double descuentoFrecuencia = 0.0;

        if (frecuency >= 7) descuentoFrecuencia = 0.30;
        else if (frecuency >= 5) descuentoFrecuencia = 0.20;
        else if (frecuency >= 2) descuentoFrecuencia = 0.10;

        return descuentoFrecuencia;

    }

}
