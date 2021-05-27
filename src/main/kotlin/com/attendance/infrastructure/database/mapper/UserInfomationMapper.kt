/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.record.UserInfomationRecord
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
interface UserInfomationMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<UserInfomationRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<UserInfomationRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("UserInfomationRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): UserInfomationRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="UserInfomationRecordResult", value = [
        Result(column="user_id", property="userId", jdbcType=JdbcType.TINYINT, id=true),
        Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        Result(column="furigana_name", property="furiganaName", jdbcType=JdbcType.VARCHAR),
        Result(column="age", property="age", jdbcType=JdbcType.TINYINT),
        Result(column="birth_date", property="birthDate", jdbcType=JdbcType.DATE),
        Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="role_type", property="roleType", jdbcType=JdbcType.VARCHAR),
        Result(column="employment_status", property="employmentStatus", jdbcType=JdbcType.VARCHAR),
        Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
        Result(column="hire_date", property="hireDate", jdbcType=JdbcType.DATE),
        Result(column="leave_date", property="leaveDate", jdbcType=JdbcType.DATE),
        Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<UserInfomationRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}