package com.parfait.icecreamupgraded.controller;

import com.parfait.icecreamupgraded.dao.IcecreamDao;
import com.parfait.icecreamupgraded.dto.*;
import com.parfait.icecreamupgraded.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2
public class IcecreamController {

    @Autowired
    private IcecreamDao icecreamDao;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("product", icecreamDao.selectProduct());
        model.addAttribute("topping", icecreamDao.selectTopping());
        return "index";
    }

    @PostMapping("/createOrder")
    @ResponseBody
    public void createOrder(@RequestBody int totalPrice){
        System.out.println(totalPrice);
        // create order
        icecreamDao.insertOrder(totalPrice);
    }

    @PostMapping("/orders")
    @ResponseBody
    public void orders(@RequestBody List<Order> orders){
        System.out.println(orders);
        int key = icecreamDao.selectOrderId();
        // create orderDetail and toppingDetail
        for (Order order : orders) {
            OrderDetail orderDetail = new OrderDetail(0, key, order.getProducts().get(0).getProductId(), order.getProducts().get(0).getQuantity());
            icecreamDao.insertOrderDetail(orderDetail);
            int orderDetailKey = icecreamDao.selectOrderDetailId();
            for (int i = 0; i < order.getToppings().size(); i++) {
                ToppingDetail toppingDetail = new ToppingDetail(0, orderDetailKey, order.getToppings().get(i).getToppingId(), order.getToppings().get(i).getQuantity());
                icecreamDao.insertToppingDetail(toppingDetail);
            }
        }
    }

    @GetMapping("/orderSuccess")
    public void orderSuccess(Model model){
        System.out.println("최종 주문 성공");
        model.addAttribute("orderInfo", icecreamDao.selectOrderInfo(icecreamDao.selectOrderId()));
        List<OrderDetailPlusName> test = icecreamDao.selectOrderInfoToOrderId(icecreamDao.selectOrderId());
        model.addAttribute("test", test);
        List<List<ToppingDetailPlusName>> toppingDetail = new ArrayList<>();
        for (OrderDetailPlusName orderInfo : test) {
            toppingDetail.add(icecreamDao.selectToppingDetailToDetailId(orderInfo.getDetailId()));

        }
        model.addAttribute("test2", toppingDetail);

    }

    @GetMapping("/orderHistory")
    public void orderHistory(Model model){
        model.addAttribute("orders", icecreamDao.selectOrders());
        model.addAttribute("orderDetails", icecreamDao.selectOrderInfoToOrderId(0)); // 파라미터가 없을 때 0을 넣어주세요
        model.addAttribute("toppingDetails", icecreamDao.selectToppingDetailToDetailId(0)); // 파라미터가 없을 때 0을 넣어주세요

    }

}
