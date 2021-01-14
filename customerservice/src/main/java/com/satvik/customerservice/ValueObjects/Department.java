package com.satvik.customerservice.ValueObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int did;
    private String dname;
    private String dcode;
    private String daddress;
}
