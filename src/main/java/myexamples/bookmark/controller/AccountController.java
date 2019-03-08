package myexamples.bookmark.controller;

import myexamples.bookmark.dto.AccountDto;
import myexamples.bookmark.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/login")
    public String login(Model model) throws Exception{
        List<AccountDto> accountList = accountService.selectMember();
        model.addAttribute("accountList",accountList);
        return "account/login";
    }
}
