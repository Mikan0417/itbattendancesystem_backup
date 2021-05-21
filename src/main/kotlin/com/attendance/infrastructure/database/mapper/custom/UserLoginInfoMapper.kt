package com.attendance.infrastructure.database.mapper.custom

import com.attendance.infrastructure.database.record.custom.UserLoginInfoRecord
import org.apache.ibatis.annotations.*
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface UserLoginInfoMapper {

//    @Results(
//        id = "UserLoginInfoResult", value = [
//            Result(column="user_id", property="userId", jdbcType=JdbcType.TINYINT, id=true),
//            Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
//            Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
//            Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
//            Result(column="role_type", property="roleType", jdbcType=JdbcType.VARCHAR)
//        ]
//    )
//
//    @SelectProvider(type = SqlProviderAdapter::class, method = "select")
//    @ResultMap("UserLoginInfoResult")
//    fun selectUserLoginInfoByEmail(selectStatement: SelectStatementProvider): UserLoginInfoRecord?
}