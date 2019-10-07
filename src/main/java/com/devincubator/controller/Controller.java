package com.devincubator.controller;

import com.devincubator.repository.AccountRepository;
import com.devincubator.repository.UserAndAccountJoinRepository;
import com.devincubator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@org.springframework.stereotype.Controller
@ComponentScan("com.devincubator")
public class Controller {

    @Autowired
    private UserAndAccountJoinRepository userAndAccountJoinRepository;

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    public String showSummary(ModelMap modelMap){

        modelMap.put("summary", accountRepository.findSumAccountValue());

        return "showSummary";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String showUser(ModelMap modelMap, RedirectAttributes redirectAttributes){

        modelMap.addAttribute("name", userAndAccountJoinRepository.findMaxAccount().get(0).getName());
        modelMap.put("surname", userAndAccountJoinRepository.findMaxAccount().get(0).getSurName());
        modelMap.put("account", userAndAccountJoinRepository.findMaxAccount().get(0).getAccount());

        return "showUsers";
    }


}
