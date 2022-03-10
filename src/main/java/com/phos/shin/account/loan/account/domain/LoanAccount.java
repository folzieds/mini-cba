package com.phos.shin.account.loan.account.domain;

import javax.persistence.*;

/*
 * Created By Folarin
 * on 3/10/2022
 */

@Entity
@Table("loan")
public class LoanAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
