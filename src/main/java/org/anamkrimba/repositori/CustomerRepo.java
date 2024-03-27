package org.anamkrimba.repositori;

import org.anamkrimba.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
    Customer findByEmail(String email);
    
} 
