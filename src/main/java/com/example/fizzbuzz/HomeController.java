package com.example.fizzbuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {



    @GetMapping("/")
    public String loadFizzBuzz(Model model){
        model.addAttribute("fizzbuzz", new FizzBuzz());
        return "fizzbuzz";
    }

    @PostMapping("/process")
    /*validating and getting values entered by the user using @ModelAttribute*/
    public String processFizzBuzz(@Valid @ModelAttribute("fizzbuzz") FizzBuzz fizzbuzz, BindingResult resultError, Model model){
    /*if the validation error is true the error message is printed*/
        if(resultError.hasErrors()){
            return "fizzbuzz";
        }

        /*setting the array last of results from fizz buzz to pass it to html*/
        ArrayList<String> result = fizzbuzz.print(fizzbuzz.getStart(),fizzbuzz.getEnd()) ;

        /*setting print to html page*/
        model.addAttribute("print", result);

        /*returning the resultDisplay.html*/
        return "resultDisplay";

    }
}
