
package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AppController {

    @GetMapping("/home")
    public ModelAndView getHome() {

        log.info("serving home ...");
        List<String> items = Arrays.asList("one", "two", "three");
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("items", items);
        return mav;
    }

    @GetMapping("/contact")
    public ModelAndView getContact() {
        ModelAndView mav = new ModelAndView("contact");
        return mav;
    }

}
