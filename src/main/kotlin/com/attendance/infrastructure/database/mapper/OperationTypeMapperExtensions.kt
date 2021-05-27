/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.OperationTypeDynamicSqlSupport.OperationType
import com.attendance.infrastructure.database.mapper.OperationTypeDynamicSqlSupport.OperationType.operationType
import com.attendance.infrastructure.database.record.OperationTypeRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun OperationTypeMapper.count(completer: CountCompleter) =
    countFrom(this::count, OperationType, completer)

fun OperationTypeMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, OperationType, completer)

fun OperationTypeMapper.deleteByPrimaryKey(operationType_: String) =
    delete {
        where(operationType, isEqualTo(operationType_))
    }

fun OperationTypeMapper.insert(record: OperationTypeRecord) =
    insert(this::insert, record, OperationType) {
        map(operationType).toProperty("operationType")
    }

fun OperationTypeMapper.insertMultiple(records: Collection<OperationTypeRecord>) =
    insertMultiple(this::insertMultiple, records, OperationType) {
        map(operationType).toProperty("operationType")
    }

fun OperationTypeMapper.insertMultiple(vararg records: OperationTypeRecord) =
    insertMultiple(records.toList())

fun OperationTypeMapper.insertSelective(record: OperationTypeRecord) =
    insert(this::insert, record, OperationType) {
        map(operationType).toPropertyWhenPresent("operationType", record::operationType)
    }

private val columnList = listOf(operationType)

fun OperationTypeMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, OperationType, completer)

fun OperationTypeMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, OperationType, completer)

fun OperationTypeMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, OperationType, completer)

fun OperationTypeMapper.update(completer: UpdateCompleter) =
    update(this::update, OperationType, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: OperationTypeRecord) =
    apply {
        set(operationType).equalTo(record::operationType)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: OperationTypeRecord) =
    apply {
        set(operationType).equalToWhenPresent(record::operationType)
    }