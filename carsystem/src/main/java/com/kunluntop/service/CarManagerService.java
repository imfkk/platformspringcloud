package com.kunluntop.service;

import com.kunluntop.pojo.TbCar;
import com.kunluntop.response.Result;


public interface CarManagerService {

    Result list();

    Result insert(TbCar car);

    Result remove(TbCar car);

    Result update(TbCar car);
}
