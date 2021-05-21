/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object RoleTypeDynamicSqlSupport {
    object RoleType : SqlTable("role_type") {
        val role = column<String>("role", JDBCType.VARCHAR)
    }
}