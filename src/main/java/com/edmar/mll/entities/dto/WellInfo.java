package com.edmar.mll.entities.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "wellinfo")
public class WellInfo {
    @Id
    private String wellid;
    private String wellname;
    private Integer wellgroupid;
}
