package it.develhope.FirstAPI02;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/factorial{n}")
    public int getFactorial(@PathVariable @NumberFormat(style = NumberFormat.Style.NUMBER) int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
