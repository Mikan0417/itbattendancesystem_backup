package com.attendance.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("test")
class TestController {

    @GetMapping("after/login")
    fun afterLoginPage(): String {
        return "test"
    }
}