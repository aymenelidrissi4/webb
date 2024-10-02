package com.example.controllers;

import com.example.annotations.Prevalidate;
import com.example.controllers.common.AbstractCheckoutStepController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestCheckoutStepController extends AbstractCheckoutStepController {

    @Override
    @RequestMapping(value = "/test")
    @Prevalidate(step = "test")
    public String enterStep(Model model) {
        return "home";
    }

    @Override
    public String back() {
        return null;
    }

    @Override
    public String next() {
        return null;
    }
}