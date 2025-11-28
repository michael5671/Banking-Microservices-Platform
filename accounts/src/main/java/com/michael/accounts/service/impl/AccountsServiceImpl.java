package com.michael.accounts.service.impl;

import com.michael.accounts.dto.CustomerDto;
import com.michael.accounts.repository.AccountsRepository;
import com.michael.accounts.repository.CustomerRepository;
import com.michael.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
