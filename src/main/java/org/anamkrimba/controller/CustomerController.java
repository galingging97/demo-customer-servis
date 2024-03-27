package org.anamkrimba.controller;

import org.anamkrimba.dto.SearchEmailRequest;
import org.anamkrimba.entity.Customer;
import org.anamkrimba.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {
        return customerService.findById(id);
    }
     @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public Iterable<Customer> findAll(){
        return customerService.findAll();
    }

    @PostMapping("/search-by-email")
    public Customer findByEmail(@RequestBody SearchEmailRequest form){
        return customerService.findByEmail(form.getEmail());
    }
}
