package com.edmar.mll.controller;

import com.alibaba.fastjson.JSONObject;
import com.edmar.mll.common.AjaxResult;
import com.edmar.mll.entities.dto.OilfieldCompany;
import com.edmar.mll.entities.dto.WellGroupInfo;
import com.edmar.mll.entities.dto.WellInfo;
import com.edmar.mll.repository.OilfieldCompanyRepository;
import com.edmar.mll.repository.OilfieldRepository;
import com.edmar.mll.repository.WellGroupInfoRepository;
import com.edmar.mll.repository.WellInfoRepository;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class ListController {


    //厂
    @Autowired
    OilfieldRepository oilfieldRepository;
    @GetMapping("/oilfield")
    public AjaxResult getoilfield() {
        return AjaxResult.success(oilfieldRepository.findAll());
    }

    //作业区
    @Autowired
    OilfieldCompanyRepository oilfieldCompanyRepository;
    @GetMapping("/oilfieldCompany/{id}")
    public AjaxResult getoilfieldCompany(@PathVariable("id") Integer id) {
        OilfieldCompany oilfieldCompany = new OilfieldCompany();
        oilfieldCompany.setOilfieldid(id);
        Example<OilfieldCompany> oilfieldCompanyExample = Example.of(oilfieldCompany);
        return AjaxResult.success(oilfieldCompanyRepository.findAll(oilfieldCompanyExample));
    }

    //油井区
    @Autowired
    WellGroupInfoRepository wellGroupInfoRepository;
    @GetMapping("/wellGroupInfo/{id}")
    public AjaxResult getwellGroupInfo(@PathVariable("id") Integer id) {
        WellGroupInfo wellGroupInfo = new WellGroupInfo();
        wellGroupInfo.setOilfieldcompanyid(id);
        Example<WellGroupInfo> wellGroupInfoExample = Example.of(wellGroupInfo);
        return AjaxResult.success(wellGroupInfoRepository.findAll(wellGroupInfoExample));
    }

    //具体油井
    @Autowired
    WellInfoRepository wellInfoRepository;
    @GetMapping("/wellInfo/{id}")
    public AjaxResult getWellInfo(@PathVariable("id") Integer id) {
        WellInfo wellInfo = new WellInfo();
        wellInfo.setWellgroupid(id);
        Example<WellInfo> wellInfoExample = Example.of(wellInfo);
        return AjaxResult.success(wellInfoRepository.findAll(wellInfoExample));
    }


}
