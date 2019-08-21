package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {

    private AccountRepository accountRepository;

    public void getdatas() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1L,"jieuns",27L));
        accounts.add(new Account(2L,"jieuns",28L));
        accounts.add(new Account(3L,"jieuns",29L));
        accounts.add(new Account(4L,"jieuns",30L));
        accounts.add(new Account(5L,"jieuns",31L));

        accountRepository.saveAll(accounts);

    }
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
}
