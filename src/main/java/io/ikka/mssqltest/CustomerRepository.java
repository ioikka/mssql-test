package io.ikka.mssqltest;

import io.ikka.mssqltest.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    @Procedure(procedureName = "get_customer_by_id")
    @Query(nativeQuery = true, value = "exec get_customer_by_id :id")
    Optional<Customer> customerById(@Param("id") Long id);
}
