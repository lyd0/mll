package com.edmar.mll.services;

import com.edmar.mll.repository.OilfieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListServices {
    @Autowired
    OilfieldRepository oilfieldRepository;

}
