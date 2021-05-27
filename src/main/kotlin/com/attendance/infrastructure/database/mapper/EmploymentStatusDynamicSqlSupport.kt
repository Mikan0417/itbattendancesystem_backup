/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object EmploymentStatusDynamicSqlSupport {
    object EmploymentStatus : SqlTable("employment_status") {
        val employmentStatus = column<String>("employment_status", JDBCType.VARCHAR)
    }
}