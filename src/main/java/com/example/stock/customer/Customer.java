package com.example.stock.customer;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;

    private String name;

    private String phone;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    @CreationTimestamp
    private Timestamp created;  // 등록일

    @LastModifiedDate
    @Column(updatable = true)
    @UpdateTimestamp
    private Timestamp modified; // 수정일

    @Column(nullable = false)
    @ColumnDefault("'N'")
    private String delYn ="N"; // 삭제여부


}
