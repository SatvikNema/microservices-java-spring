package com.satvik.customerservice.Repository;

import com.satvik.customerservice.Entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByCid(int cid);
}
