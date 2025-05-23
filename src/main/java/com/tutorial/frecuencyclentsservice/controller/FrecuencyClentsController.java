package com.tutorial.frecuencyclentsservice.controller;

import com.tutorial.frecuencyclentsservice.entity.FrecuencyClentsEntity;
import com.tutorial.frecuencyclentsservice.service.FrecuencyClentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/frecuency")
@CrossOrigin("*")
public class FrecuencyClentsController {

    @Autowired
    FrecuencyClentsService frecuencyClentsService;

    @GetMapping("/{frecuency}")
    public double getFrecuency(@PathVariable Integer frecuency) {
        return frecuencyClentsService.getFrecuency(frecuency);
    }
}
