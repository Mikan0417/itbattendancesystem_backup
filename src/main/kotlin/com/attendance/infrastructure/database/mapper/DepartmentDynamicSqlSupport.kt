/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object DepartmentDynamicSqlSupport {
    object Department : SqlTable("department") {
        val department = column<String>("department", JDBCType.VARCHAR)
    }
}