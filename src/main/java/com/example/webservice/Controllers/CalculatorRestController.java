package com.example.webservice.Controllers;

import com.example.webservice.DTOs.Request;
import com.example.webservice.DTOs.Request;
import com.example.webservice.Service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorRestController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorRestController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/add")
    public int add(@RequestBody Request request) {
        return calculatorService.add(request.getA(), request.getB());
    }
    @PostMapping("/div")
    public int div(@RequestBody Request request)
    {
        return calculatorService.divide(request.getA(), request.getB());
    }
    @PostMapping("/multi")
    public int multi(@RequestBody Request request)
    {
        return calculatorService.multiply(request.getA(), request.getB());
    }
    @PostMapping("/sub")
    public int sub(@RequestBody Request request)
    {
        return calculatorService.subtract(request.getA(), request.getB());
    }
}
