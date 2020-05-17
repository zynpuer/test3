package cn.yuening.service;

import cn.yuening.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    public List<Account> ListAccount();

    public void SaveAccount(Account account);
}
