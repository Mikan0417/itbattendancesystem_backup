package com.attendance.domain.model

import java.time.LocalDate

data class LoginUserInfo(
    val userId: Byte,
    val userName: String,
    val email: String,
    val password: String,
    val roleType: String,
)
