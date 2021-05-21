package com.attendance.infrastructure.database.record.custom

data class UserLoginInfoRecord(
    var userId: Byte? = null,
    var userName: String? = null,
    var email: String? = null,
    var password: String? = null,
    var roleType: String? = null
)
