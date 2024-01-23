package com.parfait.icecreamupgraded.controller;

import com.parfait.icecreamupgraded.dao.IcecreamDao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class IcecreamController {

    @Autowired
    private IcecreamDao icecreamDao;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("product", icecreamDao.selectProduct());
        model.addAttribute("topping", icecreamDao.selectTopping());
        log.info(icecreamDao.selectProduct());
        log.info(icecreamDao.selectTopping());
        return "index";
    }

}
