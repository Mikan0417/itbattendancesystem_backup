/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object WorkStyleDynamicSqlSupport {
    object WorkStyle : SqlTable("work_style") {
        val workStyle = column<String>("work_style", JDBCType.VARCHAR)
    }
}