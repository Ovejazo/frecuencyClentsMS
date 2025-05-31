package com.tutorial.frecuencyclentsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "frecuency")
@NoArgsConstructor
@AllArgsConstructor
public class FrecuencyClentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int frecuencyClient;
}


