package com.vti.service;

import com.vti.entity.Account;
import org.springframework.data.domain.Page;

public interface IAccountService {
    Page<Account> getAllAccount();

    Account findById(int id);

    void createAccount();
    void updateAccount();

    void deleteEmployeeById(int id);


}
