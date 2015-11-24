/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdit.eimenterprise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author suyogparajuli
 */
@Controller
public class WelcomeController {
    
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        
        return model;
    }
    
    @RequestMapping(value="/login.html", method=RequestMethod.POST)
    public ModelAndView logon() {
        ModelAndView model = new ModelAndView("home");
        
        return model;
    }
    
}
