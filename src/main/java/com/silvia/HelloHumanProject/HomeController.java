package com.silvia.HelloHumanProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value="q") String searchQuery) {
    	String results = "";
    	if (searchQuery == null) {
    		results = "Hello Human!";
    	} else {
    		results = "Hello" + searchQuery;
    	}
    	return results + " Welcome to SpringBoot";
        
    }
}