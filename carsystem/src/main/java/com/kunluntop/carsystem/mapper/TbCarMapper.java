package com.kunluntop.carsystem.mapper;

import com.kunluntop.carsystem.pojo.TbCar;
import com.kunluntop.carsystem.pojo.TbCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCarMapper {
    int countByExample(TbCarExample example);

    int deleteByExample(TbCarExample example);

    int insert(TbCar record);

    int insertSelective(TbCar record);

    List<TbCar> selectByExample(TbCarExample example);

    int updateByExampleSelective(@Param("record") TbCar record, @Param("example") TbCarExample example);

    int updateByExample(@Param("record") TbCar record, @Param("example") TbCarExample example);
}