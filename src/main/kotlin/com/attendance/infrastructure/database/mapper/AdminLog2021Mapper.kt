/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.record.AdminLog2021Record
import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface AdminLog2021Mapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<AdminLog2021Record>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<AdminLog2021Record>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("AdminLog2021RecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): AdminLog2021Record?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="AdminLog2021RecordResult", value = [
        Result(column="log_id", property="logId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="operation_type", property="operationType", jdbcType=JdbcType.VARCHAR),
        Result(column="operator_name", property="operatorName", jdbcType=JdbcType.VARCHAR),
        Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="operation_target", property="operationTarget", jdbcType=JdbcType.VARCHAR)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<AdminLog2021Record>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}