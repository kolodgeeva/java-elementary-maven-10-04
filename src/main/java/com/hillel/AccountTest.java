package com.hillel;

import java.math.BigDecimal;

public class AccountTest {

  public static void main(String[] args) {

    Account account = new Account();
    System.out.println(account);

    Account account1 = new Account(
        "uuid",
        new BigDecimal("100.50"),
        "EUR",
        "Mariana",
        "Kolodzheieva");

    System.out.println(account1);

    account1.setFirstName("Ivan");

    System.out.println(account1.getFirstName());

    System.out.println(account1);

  }

}
