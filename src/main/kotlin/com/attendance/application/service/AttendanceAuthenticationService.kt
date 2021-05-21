package com.attendance.application.service

import com.attendance.domain.model.LoginUserInfo
import com.attendance.domain.repository.UserRepository
import org.springframework.stereotype.Service

// ユーザー認証の為のサービス
@Service
class AttendanceAuthenticationService(
    private val userRepository: UserRepository
) {
    fun findUser(email: String): LoginUserInfo? {
        return userRepository.findUserByEmail(email)
    }
}