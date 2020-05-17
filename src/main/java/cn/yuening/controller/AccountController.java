package cn.yuening.controller;


import cn.yuening.entity.Account;
import cn.yuening.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/listaccount")
    public ModelAndView ListAccount() {
        System.out.println("表现层：ListAccount执行了");
        List<Account> list=accountService.ListAccount();
        for (Account account: list
             ) {
            System.out.println(account.toString());
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/saveaccount")
    public String SaveAccount(Account account){
        System.out.println("表现层：SaveAccount执行了");
        accountService.SaveAccount(account);
        return "success";
    }
}
