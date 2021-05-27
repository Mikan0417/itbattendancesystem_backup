package com.attendance.infrastructure.database.repository

import com.attendance.domain.model.LoginUserInfo
import com.attendance.domain.model.User
import com.attendance.domain.repository.UserRepository
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport
import com.attendance.infrastructure.database.mapper.UserInfomationMapper
import com.attendance.infrastructure.database.mapper.custom.UserLoginInfoMapper
import com.attendance.infrastructure.database.mapper.selectOne
import com.attendance.infrastructure.database.record.UserInfomationRecord
import org.mybatis.dynamic.sql.SqlBuilder
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.render.RenderingStrategy
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

    override fun findAll(): List<User> {   //ユーザー全件取得関数(findAll)の実装
        val selectStatement = SqlBuilder.select(UserInfomationDynamicSqlSupport.UserInfomation.allColumns()).from(UserInfomationDynamicSqlSupport.UserInfomation).build().render(RenderingStrategy.MYBATIS3)
        val userInfomationRecordList = userInfomationMapper.selectMany(selectStatement)
        return userInfomationRecordList?.map { toModel(it) }
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

    private fun toModel(record: UserInfomationRecord):  User {   //ユーザー全件表示で利用するユーザー情報
        return User(
            record.userId!!,
            record.userName!!,
            record.furiganaName!!,
            record.age!!,
            record.birthDate!!,
            record.email,
            record.address!!,
            record.password!!,
            record.roleType!!,
            record.employmentStatus!!,
            record.department!!,
            record.hireDate!!,
            record.leaveDate,
            record.deleteFlag!!.toString()  //thymeleafでif文を使うためにデータを文字列で保持する
        )
    }
}