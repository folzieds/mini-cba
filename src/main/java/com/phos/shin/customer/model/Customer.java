package com.phos.shin.customer.model;

/*
 * Created By Folarin
 * on 1/19/2022
 */

import com.phos.shin.account.bank.model.BankAccount;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Customer {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate createdDate;
    private BankAccount account;

}
