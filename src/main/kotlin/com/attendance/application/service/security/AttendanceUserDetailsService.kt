package com.attendance.application.service.security

import com.attendance.application.service.AttendanceAuthenticationService
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class AttendanceUserDetailsService(
    private val attendanceAuthenticationService: AttendanceAuthenticationService
) : UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails? {

    }
}

data class AttendanceUserDetails(

) : UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {

    }

    override fun getPassword(): String {

    }

    override fun getUsername(): String {

    }

    override fun isAccountNonExpired(): Boolean {

    }

    override fun isAccountNonLocked(): Boolean {

    }

    override fun isCredentialsNonExpired(): Boolean {

    }

    override fun isEnabled(): Boolean {

    }

}