package com.attendance.application.service.security

import com.attendance.application.service.AttendanceAuthenticationService
import com.attendance.domain.model.LoginUserInfo
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class AttendanceUserDetailsService(
    private val attendanceAuthenticationService: AttendanceAuthenticationService
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails? {
        val user = attendanceAuthenticationService.findUser(username)
        return user?.let { AttendanceUserDetails(user) }
    }
}

data class AttendanceUserDetails(
    val userId: Byte,
    val userName: String,
    val email: String,
    val pass: String,
    val roleType: String
) : UserDetails {

    constructor(user: LoginUserInfo) : this(user.userId, user.userName, user.email, user.password, user.roleType)

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return AuthorityUtils.createAuthorityList(this.roleType)
    }

    override fun getPassword(): String {
        return this.pass
    }

    override fun getUsername(): String {
        return this.email
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }

}