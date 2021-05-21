/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import org.mybatis.dynamic.sql.SqlTable

object UserInfomationDynamicSqlSupport {
    object UserInfomation : SqlTable("user_infomation") {
        val userId = column<Byte>("user_id", JDBCType.TINYINT)

        val userName = column<String>("user_name", JDBCType.VARCHAR)

        val birthDate = column<LocalDate>("birth_date", JDBCType.DATE)

        val email = column<String>("email", JDBCType.VARCHAR)

        val address = column<String>("address", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)

        val roleType = column<String>("role_type", JDBCType.VARCHAR)

        val department = column<String>("department", JDBCType.VARCHAR)

        val hireDate = column<LocalDate>("hire_date", JDBCType.DATE)

        val leaveDate = column<LocalDate>("leave_date", JDBCType.DATE)

        val deleteFlag = column<Byte>("delete_flag", JDBCType.TINYINT)
    }
}