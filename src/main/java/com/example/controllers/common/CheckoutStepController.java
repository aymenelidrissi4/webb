package com.example.controllers.common;

import org.springframework.ui.Model;

public interface CheckoutStepController {
    String enterStep(final Model model);

    String back();

    String next();
}