package com.satvik.customerservice.Controller;

import com.satvik.customerservice.Entity.Customer;
import com.satvik.customerservice.Service.CustomerService;
import com.satvik.customerservice.ValueObjects.ResponseTemplateVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer c) {
        log.info("inside saveCustomer method of customerController");
        return customerService.saveCustomer(c);
    }

    @GetMapping("/{customerId}")
    public ResponseTemplateVO getCustomerWithDepartment(@PathVariable("customerId") int id) {
        log.info("inside getCustomerWithDepartment method of customerController");
        return customerService.getCustomerWithDepartment(id);
    }
}
