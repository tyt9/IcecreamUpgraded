package com.parfait.icecreamupgraded.dao;

import com.parfait.icecreamupgraded.dto.Product;
import com.parfait.icecreamupgraded.dto.Topping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IcecreamDao {
    public List<Product> selectProduct();
    public List<Topping> selectTopping();
}
