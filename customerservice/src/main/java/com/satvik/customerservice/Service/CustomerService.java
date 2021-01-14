package com.satvik.customerservice.Service;

import com.satvik.customerservice.Entity.Customer;
import com.satvik.customerservice.Repository.CustomerRepository;
import com.satvik.customerservice.ValueObjects.Department;
import com.satvik.customerservice.ValueObjects.ResponseTemplateVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Customer saveCustomer(Customer c) {
        return customerRepository.save(c);
    }

    public ResponseTemplateVO getCustomerWithDepartment(int id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Customer c = customerRepository.findByCid(id);
        Department d = restTemplate.getForObject("http://localhost:3000/departments/" + c.getDid(), Department.class);
        vo.setCustomer(c);
        vo.setDepartment(d);
        return vo;
    }

}
