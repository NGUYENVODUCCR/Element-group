package com.element.userDetail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/userDetail")
    public String userDetail(Model model) {
        // Hardcode thông tin người dùng
        model.addAttribute("username", "Nguyen Van Element");
        model.addAttribute("email", "E.@example.com");
        model.addAttribute("age", 20);
        model.addAttribute("address", "123 Main Street, Springfield");
        return "userDetail";
    }
}
