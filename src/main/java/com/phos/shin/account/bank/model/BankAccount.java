package com.phos.shin.account.bank.model;

/*
 * Created By Folarin
 * on 1/21/2022
 */

import lombok.Data;

@Data
public class BankAccount {

    private Long id;
    private String accountName;
    private String accountNo;
    private String bankName;

}
