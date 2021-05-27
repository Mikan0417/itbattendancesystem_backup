package com.attendance.presentation.handler

import org.springframework.security.core.Authentication
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.web.DefaultRedirectStrategy
import org.springframework.security.web.authentication.AuthenticationSuccessHandler
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class AttendanceAuthenticationSuccessHandler : AuthenticationSuccessHandler {
    override fun onAuthenticationSuccess(
        request: HttpServletRequest,
        response: HttpServletResponse,
        authentication: Authentication
    ) {
        response.status = HttpServletResponse.SC_OK
        val redirectStrategy = DefaultRedirectStrategy()
        val roles = AuthorityUtils.authorityListToSet(authentication.authorities)  //roles(権限)変数を定義
        if(roles.contains("ADMIN")) {   //ADMINでログインした場合、社員一覧ページ(employee-list.html)へ遷移
            redirectStrategy.sendRedirect(request, response, "/admin/employee-list")
        } else if(roles.contains("USER")) {   //USERでログインした場合、テストページへ遷移
            redirectStrategy.sendRedirect(request, response, "/test/after/login")
        }
    }

}