package com.manal.walletapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name cant b blnk")
    @Size(min = 2, max = 30)

    private String name;
    @Size(min = 2, max = 30)
    private String accountNummber;
    @Size(max=100)
    private String description;
    @Min(1)
    @Max(3)
    private Integer priority ;
    private Double currentBalance;
    @PrePersist
    public void setBalance(){ this.currentBalance = new Double(value: 0);}
}
