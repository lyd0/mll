package com.edmar.mll.entities.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "wellgroupinfo")
public class WellGroupInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer wellgroupid;
    private String wellgroupname;
    private Integer oilfieldcompanyid;
}
