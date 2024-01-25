package com.parfait.icecreamupgraded.controller;

import com.parfait.icecreamupgraded.dao.IcecreamDao;
import com.parfait.icecreamupgraded.dto.Order;
import com.parfait.icecreamupgraded.dto.OrderDetail;
import com.parfait.icecreamupgraded.dto.Orders;
import com.parfait.icecreamupgraded.dto.ToppingDetail;
import com.parfait.icecreamupgraded.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        System.out.println("주문 성공");
    }

}
