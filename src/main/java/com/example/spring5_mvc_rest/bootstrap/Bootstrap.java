package com.example.spring5_mvc_rest.bootstrap;

import com.example.spring5_mvc_rest.domain.Category;
import com.example.spring5_mvc_rest.domain.Customer;
import com.example.spring5_mvc_rest.domain.Vendor;
import com.example.spring5_mvc_rest.repositories.CategoryRepository;
import com.example.spring5_mvc_rest.repositories.CustomerRepository;
import com.example.spring5_mvc_rest.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
private final CustomerRepository customerRepository;
private final VendorRepository vendorRepository;
    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadCustomers();
        loadVendors();
    }

    private void loadVendors() {
        Vendor vendor1=new Vendor();
        vendor1.setName("Nyein");
        Vendor vendor2=new Vendor();
        vendor2.setName("Nyi");
        vendorRepository.save(vendor1);
        vendorRepository.save(vendor2);
    }

    private void loadCustomers() {
        Customer customer1=new Customer();
        customer1.setFirstname("Nyein");
        customer1.setLastname("Yadanar Tun");
        customerRepository.save(customer1);
        Customer customer2=new Customer();
        customer2.setFirstname("Nyi");
        customer2.setLastname("Nyi Htun");
        customerRepository.save(customer2);
    }

    private void loadCategories() {
        Category apple=new Category();
        apple.setName("Apple");
        Category orange=new Category();
        orange.setName("Orange");
        Category grape=new Category();
        grape.setName("Grape");
        Category mango=new Category();
        mango.setName("Mango");
        Category melon=new Category();
        melon.setName("Melon");
        categoryRepository.save(apple);
        categoryRepository.save(orange);
        categoryRepository.save(grape);
        categoryRepository.save(mango);
        categoryRepository.save(melon);
    }
}
