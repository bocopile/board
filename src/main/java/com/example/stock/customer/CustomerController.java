package com.example.stock.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/customer")
@Controller
public class CustomerController {

    @GetMapping("/")
    public String main(){
        return "";
    }
}
