package com.example.demo.model;

import java.time.ZonedDateTime;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class HealthRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer SBP;//高压
    private Integer DBP;//低压
    private String isHeadache;//头痛
    private String isBackPain;//背痛
    private String isChestPain; //胸痛
    private String isLessUrination; //少尿
    private ZonedDateTime importTime;
    private String description;

    @Column(name = "user_id")
    private long userId;
    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    @JsonBackReference
    private Account account; // 一个账户对应多个交易记录

}
