package com.edmar.mll.entities.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "wavedatatbl")
public class Well {
    @Id
    private Integer id;
    private String wellid;
    private String couplewave;
    private String filtereddata;
    private String oridata;
    private String lowdata;

}
