/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.record

import java.time.LocalDate

data class UserInfomationRecord(
    var userId: Byte? = null,
    var userName: String? = null,
    var furiganaName: String? = null,
    var age: Byte? = null,
    var birthDate: LocalDate? = null,
    var email: String? = null,
    var address: String? = null,
    var password: String? = null,
    var roleType: String? = null,
    var employmentStatus: String? = null,
    var department: String? = null,
    var hireDate: LocalDate? = null,
    var leaveDate: LocalDate? = null,
    var deleteFlag: Byte? = null
)