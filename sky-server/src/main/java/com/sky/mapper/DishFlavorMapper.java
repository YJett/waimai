package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: DishFlavorMapper
 * @Date: 2024/10/29/下午5:16
 * @Description: TODO
 */
@Mapper
public interface DishFlavorMapper {

    void insertBatch(List<DishFlavor> flavors);
}
