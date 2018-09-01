package com.nepalemr.nepalEMR.controller;

import com.nepalemr.nepalEMR.application.map.DistanceGetter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserRequestController {

    @GetMapping("/getDistance")
    public  String getDistance() {
        return DistanceGetter.getDistance();
    }
}
