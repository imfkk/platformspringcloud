package com.kunluntop.carsystem.service;

import com.kunluntop.carsystem.pojo.TbCar;
import com.kunluntop.response.Result;


public interface CarManagerService {

    Result list();

    Result insert(TbCar car);

    Result remove(TbCar car);

    Result update(TbCar car);
}
