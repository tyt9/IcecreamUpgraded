package com.parfait.icecreamupgraded.controller;

import com.parfait.icecreamupgraded.dao.IcecreamDao;
import com.parfait.icecreamupgraded.dto.Order;
import com.parfait.icecreamupgraded.dto.Orders;
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
    @PostMapping("/orders")
    @ResponseBody
    public void orders(@RequestBody List<Order> orders){
        System.out.println(orders);
        // create order
        // create orderDetail
        // create toppingDetail

    }

    @GetMapping("/orderSuccess")
    public void orderSuccess(Model model){
        System.out.println("주문 성공");
    }

}
