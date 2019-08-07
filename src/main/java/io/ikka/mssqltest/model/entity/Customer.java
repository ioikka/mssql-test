package io.ikka.mssqltest.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "CUSTOMERS")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "get_customer_by_id",
                procedureName = "get_customer_by_id",
                resultClasses = Customer.class,
                parameters = @StoredProcedureParameter(name = "id", type = Integer.class, mode = ParameterMode.IN)
        )
})
public class Customer {
    @Id
    private Long id;
    private String name;
    private String address;
    private BigDecimal salary;
    private Integer age;
}
