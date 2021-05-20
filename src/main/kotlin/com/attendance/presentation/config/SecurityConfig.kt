package com.attendance.presentation.config

import com.attendance.application.service.AttendanceAuthenticationService
import com.attendance.application.service.security.AttendanceUserDetailsService
import com.attendance.presentation.handler.AttendanceAccessDeniedHandler
import com.attendance.presentation.handler.AttendanceAuthenticationEntryPoint
import com.attendance.presentation.handler.AttendanceAuthenticationFailureHandler
import com.attendance.presentation.handler.AttendanceAuthenticationSuccessHandler
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@EnableWebSecurity
class SecurityConfig(private val attendanceAuthenticationService: AttendanceAuthenticationService) : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
            .mvcMatchers("/login").permitAll() //.permitAllを指定し、権限なしでアクセス許可
            .mvcMatchers("admin/**").hasAuthority(RoleType.ADMIN.toString()) //.hasAuthority(RoleType.ADMIN~を指定し、ADMIN権限のみアクセス許可
            .mvcMatchers("/user/**").hasAuthority(RoleType.USER.toString()) //.hasAuthority(RoleType.USER~を指定し、USER権限のみアクセス許可
            .anyRequest().authenticated()
            .and()
            .csrf().disable()
            .formLogin() //ユーザー名(今回はemail)、パスワードでのログインを有効化
            .loginProcessingUrl("/login/auth") //ログイン認証の実行のリクエスト
            .loginPage("/login")
            .usernameParameter("email") //ログインで使用するユーザー名のパラメーターをemailに設定
            .passwordParameter("pass") //ログインで使用するパスワードのパラメーターをpassに設定
            .successHandler(AttendanceAuthenticationSuccessHandler()) //認証成功時に実行するハンドラー
            .failureHandler(AttendanceAuthenticationFailureHandler()) //認証失敗時に実行するハンドラー
            .and()
            .exceptionHandling()
            .authenticationEntryPoint(AttendanceAuthenticationEntryPoint()) //未認証時に実行するハンドラー
            .accessDeniedHandler(AttendanceAccessDeniedHandler()) //認可失敗時に実行するハンドラー
            .and().logout() //ログアウト機能
            .logoutUrl("/user/logout") //ログアウト実行のリクエスト
            .logoutSuccessUrl("/login") //ログアウト後の遷移先
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(AttendanceUserDetailsService(attendanceAuthenticationService)).passwordEncoder(BCryptPasswordEncoder())
    }
}