package com.michael.accounts.service.impl;

import com.michael.accounts.constants.AccountsConstants;
import com.michael.accounts.dto.CustomerDto;
import com.michael.accounts.entity.Accounts;
import com.michael.accounts.entity.Customer;
import com.michael.accounts.mapper.CustomerMapper;
import com.michael.accounts.repository.AccountsRepository;
import com.michael.accounts.repository.CustomerRepository;
import com.michael.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

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
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer = customerRepository.save(customer);
    }
    private Accounts createNewAccounts(Customer customer){
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
