package com.element.userDetail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private User user = new User(); // Tạm thời lưu thông tin người dùng

    // Hiển thị form nhập thông tin
    @GetMapping("/userForm")
    public String userForm(Model model) {
        model.addAttribute("user", new User()); // Tạo đối tượng User rỗng
        return "userForm";
    }

    // Xử lý khi submit form
    @PostMapping("/submitUser")
    public String submitUser(@ModelAttribute("user") User user) {
        // Hiển thị thông tin người dùng trên console
        System.out.println("User Details (Submitted):");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
        System.out.println("Address: " + user.getAddress());

        this.user = user; // Lưu thông tin để chỉnh sửa
        return "redirect:/userDetail";
    }

    // Hiển thị thông tin người dùng
    @GetMapping("/userDetail")
    public String userDetail(Model model) {
        model.addAttribute("user", user);
        return "userDetail";
    }

    // Hiển thị form chỉnh sửa thông tin người dùng
    @GetMapping("/editUser")
    public String editUser(Model model) {
        model.addAttribute("user", user); // Đưa dữ liệu hiện tại vào form chỉnh sửa
        return "editUserForm";
    }

    // Xử lý khi cập nhật thông tin người dùng
    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        // Hiển thị thông tin chỉnh sửa trên console
        System.out.println("User Details (Updated):");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());
        System.out.println("Address: " + user.getAddress());

        this.user = user; // Cập nhật thông tin
        return "redirect:/userDetail";
    }
}
