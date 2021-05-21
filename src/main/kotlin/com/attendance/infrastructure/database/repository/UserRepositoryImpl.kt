package com.attendance.infrastructure.database.repository

import com.attendance.domain.model.LoginUserInfo
import com.attendance.domain.repository.UserRepository
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport
import com.attendance.infrastructure.database.mapper.UserInfomationMapper
import com.attendance.infrastructure.database.mapper.custom.UserLoginInfoMapper
import com.attendance.infrastructure.database.mapper.selectOne
import com.attendance.infrastructure.database.record.UserInfomationRecord
import com.attendance.infrastructure.database.record.custom.UserLoginInfoRecord
import org.mybatis.dynamic.sql.SqlBuilder
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.render.RenderingStrategy
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.select
import org.springframework.stereotype.Repository

//UserRepositoryの実装クラス

@Repository
@Suppress("SpringJavaInjectionPointsAutowiringInspection")
class UserRepositoryImpl(
    private val userLoginInfoMapper: UserLoginInfoMapper,
    private val userInfomationMapper: UserInfomationMapper
) : UserRepository {
    override fun findUserByEmail(email: String): LoginUserInfo? {
//        val selectStatement = SqlBuilder.select(UserInfomationDynamicSqlSupport.UserInfomation.userId,
//                                                UserInfomationDynamicSqlSupport.UserInfomation.userName,
//                                                UserInfomationDynamicSqlSupport.UserInfomation.email,
//                                                UserInfomationDynamicSqlSupport.UserInfomation.password,
//                                                UserInfomationDynamicSqlSupport.UserInfomation.roleType)
//                                                .from(UserInfomationDynamicSqlSupport.UserInfomation)
//                                                .where(UserInfomationDynamicSqlSupport.UserInfomation.email, isEqualTo(email))
//                                                .build().render(RenderingStrategy.MYBATIS3)
//
//        val record = userLoginInfoMapper.selectUserLoginInfoByEmail(selectStatement)
//
//        return record?.let { toModelLoginUserInfo(it) }
        val record = userInfomationMapper.selectOne {
            where(UserInfomationDynamicSqlSupport.UserInfomation.email, isEqualTo(email))
        }
        return record?. let { toModelLoginUserInfo(it) }
    }

    private fun toModelLoginUserInfo(record: UserInfomationRecord): LoginUserInfo {
        return LoginUserInfo(
            record.userId!!,
            record.userName!!,
            record.email!!,
            record.password!!,
            record.roleType!!
        )
    }
}