package cn.yuening.dao;

import cn.yuening.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> ListAccount();

    @Insert(value = "insert into account(name,money) values(#{name},#{money})")
    public void SaveAccount(Account account);
}
