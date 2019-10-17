package com.edmar.mll.entities.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "oilfield")
@Data
public class Oilfield {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer oilfieldid;
    private String oilfieldname;
}
