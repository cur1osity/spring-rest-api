package com.cur1osity.springrestapi.bootstrap;

import com.cur1osity.springrestapi.domain.Customer;
import com.cur1osity.springrestapi.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Bootstrap implements CommandLineRunner{

    private final CustomerRepository customerRepository;


    public Bootstrap(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCustomers();

    }

    private void loadCustomers() {
        //given
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Michale");
        customer1.setLastname("Weston");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2l);
        customer2.setFirstname("Sam");
        customer2.setLastname("Axe");

        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setId(3l);
        customer3.setFirstname("John");
        customer3.setLastname("Doe");

        customerRepository.save(customer3);


        System.out.println("Customers Loaded: " + customerRepository.count());
    }
}
