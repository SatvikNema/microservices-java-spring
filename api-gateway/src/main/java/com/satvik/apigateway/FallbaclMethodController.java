package com.satvik.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbaclMethodController {

    @GetMapping("/customerServiceFallback")
    public String customerServiceFallbackMethod() {
        return "Customer Service is taking alonger than expected." + " Please try again later.";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod() {
        return "Department Service is taking alonger than expected." + " Please try again later.";
    }
}
