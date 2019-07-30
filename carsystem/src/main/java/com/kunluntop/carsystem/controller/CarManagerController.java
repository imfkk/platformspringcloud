package com.kunluntop.carsystem.controller;

import com.kunluntop.api.cars.CarClientService;
import com.kunluntop.carsystem.service.CarManagerService;
import com.kunluntop.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarManagerController {
    @Autowired
    private CarManagerService carManagerService;
    @Autowired
    private CarClientService carClientService;

    @RequestMapping(value = "/ListCars" ,method = RequestMethod.GET)
    public Result ListCars() {

        carClientService.getCarList();
        return carManagerService.list();
    }

   /* @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public com.kunluntop.response.Result addCars() {
        return carManagerService.insert();
    }*/

}
