package com.kunluntop.carsystem.service.impl;

import com.kunluntop.carsystem.mapper.TbCarMapper;
import com.kunluntop.carsystem.pojo.TbCar;
import com.kunluntop.carsystem.service.CarManagerService;
import com.kunluntop.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarManagerServiceImpl implements CarManagerService {
    @Autowired
    private TbCarMapper tbCarMapper;

    @Override
    public Result list() {
       // tbCarMapper.
        return null;
    }

    @Override
    public Result insert(TbCar car) {
        return null;
    }

    @Override
    public Result remove(TbCar car) {
        return null;
    }

    @Override
    public Result update(TbCar car) {
        return null;
    }
}