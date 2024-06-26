package com.parfait.icecreamupgraded.dao;

import com.parfait.icecreamupgraded.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IcecreamDao {
    public List<Product> selectProduct();
    public List<Topping> selectTopping();
    public void insertOrder(int totalPrice);
    public int selectOrderId();
    public List<Orders> selectOrders();
    public void insertOrderDetail(OrderDetail orderDetail);
    public void insertToppingDetail(ToppingDetail toppingDetail);
    public int selectOrderDetailId();
    public List<OrderInfo> selectOrderInfo(int orderId);
    public List<OrderInfo> selectOrderInfos();
    public List<OrderDetailPlusName> selectOrderInfoToOrderId(int orderId);
    public List<ToppingDetailPlusName> selectToppingDetailToDetailId(int orderDetailId);
}
