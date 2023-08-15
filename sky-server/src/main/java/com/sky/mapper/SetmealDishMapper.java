package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据dishID查询setmealId
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdByDishId(List<Long> dishIds);
}
