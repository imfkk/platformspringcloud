package com.kunluntop.mapper;

import com.kunluntop.pojo.TbCar;
import com.kunluntop.pojo.TbCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCarMapper {
    int countByExample(TbCarExample example);

    int deleteByExample(TbCarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCar record);

    int insertSelective(TbCar record);

    List<TbCar> selectByExample(TbCarExample example);

    TbCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCar record, @Param("example") TbCarExample example);

    int updateByExample(@Param("record") TbCar record, @Param("example") TbCarExample example);

    int updateByPrimaryKeySelective(TbCar record);

    int updateByPrimaryKey(TbCar record);
}
