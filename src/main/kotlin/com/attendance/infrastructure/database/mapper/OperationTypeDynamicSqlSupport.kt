/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object OperationTypeDynamicSqlSupport {
    object OperationType : SqlTable("operation_type") {
        val operationType = column<String>("operation_type", JDBCType.VARCHAR)
    }
}