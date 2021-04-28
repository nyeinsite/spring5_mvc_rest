package com.example.spring5_mvc_rest.repositories;

import com.example.spring5_mvc_rest.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
}
