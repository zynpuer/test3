package cn.yuening.service.Impl;

import cn.yuening.dao.AccountDao;
import cn.yuening.entity.Account;
import cn.yuening.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> ListAccount() {
        System.out.println("业务层：ListAccount执行了");

        return accountDao.ListAccount();
    }

    public void SaveAccount(Account account) {
        System.out.println("业务层：SaveAccount执行了");
        accountDao.SaveAccount(account);
    }
}
