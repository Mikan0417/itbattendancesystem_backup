package com.attendance.presentation.controller

import com.attendance.presentation.form.LoginInfo
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("login")
class LoginController {

    @GetMapping
    fun login(model: Model): String {
        model.addAttribute("loginInfo", LoginInfo("", ""))
        return "login/login"
    }
}