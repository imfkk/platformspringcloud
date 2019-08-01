package com.kunluntop.controller;

import com.kunluntop.feignClient.CarClientService;
import com.kunluntop.response.ResultUtil;
import com.kunluntop.service.CarManagerService;
import com.kunluntop.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping(value = "/cars")
public class CarManagerController {
    @Autowired
    private CarManagerService carManagerService;
    @Autowired
    private CarClientService carClientService;

    @RequestMapping(value = "/ListCars" ,method = RequestMethod.GET)
    public Result ListCars() {

        carClientService.add();
        return carManagerService.list();
    }

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public com.kunluntop.response.Result addCars() {
        return ResultUtil.success("");
    }

}
