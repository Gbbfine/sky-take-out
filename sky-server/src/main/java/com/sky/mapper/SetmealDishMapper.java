package com.sky.mapper;

import com.sky.entity.SetmealDish;
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

    /**
     * 向setmeal_dish插入n条数据
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
