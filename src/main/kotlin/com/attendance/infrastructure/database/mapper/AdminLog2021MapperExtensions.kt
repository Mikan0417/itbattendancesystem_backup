/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.AdminLog2021DynamicSqlSupport.AdminLog2021
import com.attendance.infrastructure.database.mapper.AdminLog2021DynamicSqlSupport.AdminLog2021.logId
import com.attendance.infrastructure.database.mapper.AdminLog2021DynamicSqlSupport.AdminLog2021.operationTarget
import com.attendance.infrastructure.database.mapper.AdminLog2021DynamicSqlSupport.AdminLog2021.operationType
import com.attendance.infrastructure.database.mapper.AdminLog2021DynamicSqlSupport.AdminLog2021.operatorName
import com.attendance.infrastructure.database.mapper.AdminLog2021DynamicSqlSupport.AdminLog2021.updateTime
import com.attendance.infrastructure.database.record.AdminLog2021Record
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun AdminLog2021Mapper.count(completer: CountCompleter) =
    countFrom(this::count, AdminLog2021, completer)

fun AdminLog2021Mapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, AdminLog2021, completer)

fun AdminLog2021Mapper.deleteByPrimaryKey(logId_: Int) =
    delete {
        where(logId, isEqualTo(logId_))
    }

fun AdminLog2021Mapper.insert(record: AdminLog2021Record) =
    insert(this::insert, record, AdminLog2021) {
        map(logId).toProperty("logId")
        map(operationType).toProperty("operationType")
        map(operatorName).toProperty("operatorName")
        map(updateTime).toProperty("updateTime")
        map(operationTarget).toProperty("operationTarget")
    }

fun AdminLog2021Mapper.insertMultiple(records: Collection<AdminLog2021Record>) =
    insertMultiple(this::insertMultiple, records, AdminLog2021) {
        map(logId).toProperty("logId")
        map(operationType).toProperty("operationType")
        map(operatorName).toProperty("operatorName")
        map(updateTime).toProperty("updateTime")
        map(operationTarget).toProperty("operationTarget")
    }

fun AdminLog2021Mapper.insertMultiple(vararg records: AdminLog2021Record) =
    insertMultiple(records.toList())

fun AdminLog2021Mapper.insertSelective(record: AdminLog2021Record) =
    insert(this::insert, record, AdminLog2021) {
        map(logId).toPropertyWhenPresent("logId", record::logId)
        map(operationType).toPropertyWhenPresent("operationType", record::operationType)
        map(operatorName).toPropertyWhenPresent("operatorName", record::operatorName)
        map(updateTime).toPropertyWhenPresent("updateTime", record::updateTime)
        map(operationTarget).toPropertyWhenPresent("operationTarget", record::operationTarget)
    }

private val columnList = listOf(logId, operationType, operatorName, updateTime, operationTarget)

fun AdminLog2021Mapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, AdminLog2021, completer)

fun AdminLog2021Mapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, AdminLog2021, completer)

fun AdminLog2021Mapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, AdminLog2021, completer)

fun AdminLog2021Mapper.selectByPrimaryKey(logId_: Int) =
    selectOne {
        where(logId, isEqualTo(logId_))
    }

fun AdminLog2021Mapper.update(completer: UpdateCompleter) =
    update(this::update, AdminLog2021, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: AdminLog2021Record) =
    apply {
        set(logId).equalTo(record::logId)
        set(operationType).equalTo(record::operationType)
        set(operatorName).equalTo(record::operatorName)
        set(updateTime).equalTo(record::updateTime)
        set(operationTarget).equalTo(record::operationTarget)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: AdminLog2021Record) =
    apply {
        set(logId).equalToWhenPresent(record::logId)
        set(operationType).equalToWhenPresent(record::operationType)
        set(operatorName).equalToWhenPresent(record::operatorName)
        set(updateTime).equalToWhenPresent(record::updateTime)
        set(operationTarget).equalToWhenPresent(record::operationTarget)
    }

fun AdminLog2021Mapper.updateByPrimaryKey(record: AdminLog2021Record) =
    update {
        set(operationType).equalTo(record::operationType)
        set(operatorName).equalTo(record::operatorName)
        set(updateTime).equalTo(record::updateTime)
        set(operationTarget).equalTo(record::operationTarget)
        where(logId, isEqualTo(record::logId))
    }

fun AdminLog2021Mapper.updateByPrimaryKeySelective(record: AdminLog2021Record) =
    update {
        set(operationType).equalToWhenPresent(record::operationType)
        set(operatorName).equalToWhenPresent(record::operatorName)
        set(updateTime).equalToWhenPresent(record::updateTime)
        set(operationTarget).equalToWhenPresent(record::operationTarget)
        where(logId, isEqualTo(record::logId))
    }