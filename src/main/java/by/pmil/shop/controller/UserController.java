package by.pmil.shop.controller;


import by.pmil.shop.entity.User;
import by.pmil.shop.service.UserService;
import by.pmil.shop.utils.AllArgUsersDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/order")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/red")
    public String saveOrder (Model model) {

    }

    @PostMapping("reg")
    public String saveOrder  {

    }
