package com.homework.spring_dev12.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public ModelAndView getHello() {
        ModelAndView result = new ModelAndView("test");
        return result;
    }
}
