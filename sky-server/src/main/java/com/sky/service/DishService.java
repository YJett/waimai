package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;

/**
 * @Author: DishService
 * @Date: 2024/10/29/下午5:00
 * @Description: TODO
 */
public interface DishService {

    /**
     * @description: 新增菜品和对应的口味
     * @author ywootae
     * @date 2024/10/29 下午5:01
     * @version 1.0
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
