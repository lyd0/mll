package com.edmar.mll.entities.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "oilfieldcompany")
public class OilfieldCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer oilfieldcompanyid;
    private String oilfieldcompanyname;
    private Integer oilfieldid;
}
