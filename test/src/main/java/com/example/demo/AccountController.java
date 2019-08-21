package com.example.demo;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/temp")
public class AccountController {

    @Autowired
    AccountRepository accountRepository ;

    List<Account> accounts = new ArrayList<>();


    @PostMapping()
    public void insertAccount() {
            accounts.add(new Account(1L,"이지은1", 27L));
            accounts.add(new Account(2L,"이지은2", 28L));
            accounts.add(new Account(3L,"이지은3", 29L));
            accounts.add(new Account(4L,"이지은4", 30L));

            accountRepository.saveAll(accounts);
    }


    @PutMapping
    public void updateAccount() {
        Account findAccount  = accountRepository.findById(1L).get();

        findAccount.setNumber(3L);
    }
}
