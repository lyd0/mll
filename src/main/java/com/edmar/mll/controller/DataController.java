package com.edmar.mll.controller;

import com.edmar.mll.entities.dto.Well;
import com.edmar.mll.repository.WellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class DataController {

    @Autowired
    WellRepository wellRepository;
    @GetMapping("/data/{wellid}")
    public String getChartsInfo(Model model, @PathVariable("wellid") String wellid) {

        Well well = new Well();
        well.setWellid(wellid);
        Example<Well> wellExample = Example.of(well);
        List<Well> wells = wellRepository.findAll(wellExample);
        model.addAttribute("hasData",true);
        model.addAttribute("couplewave", Arrays.asList(wells.get(0).getCouplewave().split("#")));
        model.addAttribute("oridata",Arrays.asList(wells.get(0).getOridata().split("#")));
        return "index";
    }

}
