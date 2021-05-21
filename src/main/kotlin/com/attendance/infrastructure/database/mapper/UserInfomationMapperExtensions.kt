/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.address
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.birthDate
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.deleteFlag
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.department
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.email
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.hireDate
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.leaveDate
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.password
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.roleType
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.userId
import com.attendance.infrastructure.database.mapper.UserInfomationDynamicSqlSupport.UserInfomation.userName
import com.attendance.infrastructure.database.record.UserInfomationRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UserInfomationMapper.count(completer: CountCompleter) =
    countFrom(this::count, UserInfomation, completer)

fun UserInfomationMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, UserInfomation, completer)

fun UserInfomationMapper.deleteByPrimaryKey(userId_: Byte) =
    delete {
        where(userId, isEqualTo(userId_))
    }

fun UserInfomationMapper.insert(record: UserInfomationRecord) =
    insert(this::insert, record, UserInfomation) {
        map(userId).toProperty("userId")
        map(userName).toProperty("userName")
        map(birthDate).toProperty("birthDate")
        map(email).toProperty("email")
        map(address).toProperty("address")
        map(password).toProperty("password")
        map(roleType).toProperty("roleType")
        map(department).toProperty("department")
        map(hireDate).toProperty("hireDate")
        map(leaveDate).toProperty("leaveDate")
        map(deleteFlag).toProperty("deleteFlag")
    }

fun UserInfomationMapper.insertMultiple(records: Collection<UserInfomationRecord>) =
    insertMultiple(this::insertMultiple, records, UserInfomation) {
        map(userId).toProperty("userId")
        map(userName).toProperty("userName")
        map(birthDate).toProperty("birthDate")
        map(email).toProperty("email")
        map(address).toProperty("address")
        map(password).toProperty("password")
        map(roleType).toProperty("roleType")
        map(department).toProperty("department")
        map(hireDate).toProperty("hireDate")
        map(leaveDate).toProperty("leaveDate")
        map(deleteFlag).toProperty("deleteFlag")
    }

fun UserInfomationMapper.insertMultiple(vararg records: UserInfomationRecord) =
    insertMultiple(records.toList())

fun UserInfomationMapper.insertSelective(record: UserInfomationRecord) =
    insert(this::insert, record, UserInfomation) {
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(userName).toPropertyWhenPresent("userName", record::userName)
        map(birthDate).toPropertyWhenPresent("birthDate", record::birthDate)
        map(email).toPropertyWhenPresent("email", record::email)
        map(address).toPropertyWhenPresent("address", record::address)
        map(password).toPropertyWhenPresent("password", record::password)
        map(roleType).toPropertyWhenPresent("roleType", record::roleType)
        map(department).toPropertyWhenPresent("department", record::department)
        map(hireDate).toPropertyWhenPresent("hireDate", record::hireDate)
        map(leaveDate).toPropertyWhenPresent("leaveDate", record::leaveDate)
        map(deleteFlag).toPropertyWhenPresent("deleteFlag", record::deleteFlag)
    }

private val columnList = listOf(userId, userName, birthDate, email, address, password, roleType, department, hireDate, leaveDate, deleteFlag)

fun UserInfomationMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, UserInfomation, completer)

fun UserInfomationMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, UserInfomation, completer)

fun UserInfomationMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, UserInfomation, completer)

fun UserInfomationMapper.selectByPrimaryKey(userId_: Byte) =
    selectOne {
        where(userId, isEqualTo(userId_))
    }

fun UserInfomationMapper.update(completer: UpdateCompleter) =
    update(this::update, UserInfomation, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UserInfomationRecord) =
    apply {
        set(userId).equalTo(record::userId)
        set(userName).equalTo(record::userName)
        set(birthDate).equalTo(record::birthDate)
        set(email).equalTo(record::email)
        set(address).equalTo(record::address)
        set(password).equalTo(record::password)
        set(roleType).equalTo(record::roleType)
        set(department).equalTo(record::department)
        set(hireDate).equalTo(record::hireDate)
        set(leaveDate).equalTo(record::leaveDate)
        set(deleteFlag).equalTo(record::deleteFlag)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UserInfomationRecord) =
    apply {
        set(userId).equalToWhenPresent(record::userId)
        set(userName).equalToWhenPresent(record::userName)
        set(birthDate).equalToWhenPresent(record::birthDate)
        set(email).equalToWhenPresent(record::email)
        set(address).equalToWhenPresent(record::address)
        set(password).equalToWhenPresent(record::password)
        set(roleType).equalToWhenPresent(record::roleType)
        set(department).equalToWhenPresent(record::department)
        set(hireDate).equalToWhenPresent(record::hireDate)
        set(leaveDate).equalToWhenPresent(record::leaveDate)
        set(deleteFlag).equalToWhenPresent(record::deleteFlag)
    }

fun UserInfomationMapper.updateByPrimaryKey(record: UserInfomationRecord) =
    update {
        set(userName).equalTo(record::userName)
        set(birthDate).equalTo(record::birthDate)
        set(email).equalTo(record::email)
        set(address).equalTo(record::address)
        set(password).equalTo(record::password)
        set(roleType).equalTo(record::roleType)
        set(department).equalTo(record::department)
        set(hireDate).equalTo(record::hireDate)
        set(leaveDate).equalTo(record::leaveDate)
        set(deleteFlag).equalTo(record::deleteFlag)
        where(userId, isEqualTo(record::userId))
    }

fun UserInfomationMapper.updateByPrimaryKeySelective(record: UserInfomationRecord) =
    update {
        set(userName).equalToWhenPresent(record::userName)
        set(birthDate).equalToWhenPresent(record::birthDate)
        set(email).equalToWhenPresent(record::email)
        set(address).equalToWhenPresent(record::address)
        set(password).equalToWhenPresent(record::password)
        set(roleType).equalToWhenPresent(record::roleType)
        set(department).equalToWhenPresent(record::department)
        set(hireDate).equalToWhenPresent(record::hireDate)
        set(leaveDate).equalToWhenPresent(record::leaveDate)
        set(deleteFlag).equalToWhenPresent(record::deleteFlag)
        where(userId, isEqualTo(record::userId))
    }