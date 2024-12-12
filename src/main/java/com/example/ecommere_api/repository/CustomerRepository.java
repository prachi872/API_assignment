package com.example.ecommere_api.repository;
import com.example.ecommere_api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // You can add custom query methods here if needed
}
