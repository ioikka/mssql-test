package io.ikka.mssqltest;

import io.ikka.mssqltest.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Procedure(procedureName = "get_customer_by_id")
    Customer cccc(@Param("id") Long id);
}
