package com.attendance.domain.model

import java.time.LocalDate

//ユーザー情報をinsert・updateする際のモデル
data class User(
    var userId: Byte,
    var userName: String,
    var furiganaName: String,
    var age: Byte,
    var birthDate: LocalDate,
    var email: String?,
    var address: String,
    var password: String,
    var roleType: String,
    var employmentStatus: String,
    var department: String,
    var hireDate: LocalDate,
    var leaveDate: LocalDate?,
    var deleteFlag: String
)