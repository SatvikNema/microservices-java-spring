package com.satvik.customerservice.ValueObjects;

import com.satvik.customerservice.Entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Customer customer;
    private Department department;
}
