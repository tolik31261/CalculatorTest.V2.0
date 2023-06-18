package com.example.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в колькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        try { return num1 + "+" + num2 + "=" + calculator.plus(num1,num2);

        }catch (IllegalArgumentException e){
            return "Ошибка в запросе";
        }

    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            return num1 + "-" + num2 + "=" + calculator.minus(num1, num2);

        } catch (IllegalArgumentException e) {
            return "Ошибка в запросе";
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            return num1 + "*" + num2 + "=" + calculator.multiply(num1, num2);

        } catch (IllegalArgumentException e) {
            return "Ошибка в запросе";
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            return num1 + "/" + num2 + "=" + calculator.divide(num1, num2);

        } catch (IllegalArgumentException e) {
            return "Ошибка в запросе";
        }
    }
}
