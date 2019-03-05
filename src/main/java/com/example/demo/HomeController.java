package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

@Controller
public class HomeController /*implements IGTVGController*/ {

//    public void process(
//            final HttpServletRequest request, final HttpServletResponse response,
//            final ServletContext servletContext, final ITemplateEngine templateEngine)
//            throws Exception {
//
//        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
//        ctx.setVariable("today", LocalDate.now());
//
//        templateEngine.process("home", ctx, response.getWriter());
//    }

    @RequestMapping("/")
    public String getHome(Model model){
        model.addAttribute("today", LocalDate.now());
        return "home";
    }

    @PostMapping("/")
    public String postHome(){
        return "home";
    }

}