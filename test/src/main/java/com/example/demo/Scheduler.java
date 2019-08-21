package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Scheduler {

    private AccountService accountService;
    private AccountRepository accountRepository;


@PostConstruct
public void runner() {
    this.start();
}

public void start() {
    accountService.getdatas();
}

public Scheduler(AccountService accountService, AccountRepository accountRepository){
    this.accountRepository = accountRepository;
    this.accountService = accountService;
}
}