/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object AdminLog2021DynamicSqlSupport {
    object AdminLog2021 : SqlTable("admin_log_2021") {
        val logId = column<Int>("log_id", JDBCType.INTEGER)

        val operationType = column<String>("operation_type", JDBCType.VARCHAR)

        val operatorName = column<String>("operator_name", JDBCType.VARCHAR)

        val updateTime = column<LocalDateTime>("update_time", JDBCType.TIMESTAMP)

        val operationTarget = column<String>("operation_target", JDBCType.VARCHAR)
    }
}