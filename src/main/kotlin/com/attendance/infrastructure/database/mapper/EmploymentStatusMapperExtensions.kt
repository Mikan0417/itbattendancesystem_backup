/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.EmploymentStatusDynamicSqlSupport.EmploymentStatus
import com.attendance.infrastructure.database.mapper.EmploymentStatusDynamicSqlSupport.EmploymentStatus.employmentStatus
import com.attendance.infrastructure.database.record.EmploymentStatusRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun EmploymentStatusMapper.count(completer: CountCompleter) =
    countFrom(this::count, EmploymentStatus, completer)

fun EmploymentStatusMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, EmploymentStatus, completer)

fun EmploymentStatusMapper.deleteByPrimaryKey(employmentStatus_: String) =
    delete {
        where(employmentStatus, isEqualTo(employmentStatus_))
    }

fun EmploymentStatusMapper.insert(record: EmploymentStatusRecord) =
    insert(this::insert, record, EmploymentStatus) {
        map(employmentStatus).toProperty("employmentStatus")
    }

fun EmploymentStatusMapper.insertMultiple(records: Collection<EmploymentStatusRecord>) =
    insertMultiple(this::insertMultiple, records, EmploymentStatus) {
        map(employmentStatus).toProperty("employmentStatus")
    }

fun EmploymentStatusMapper.insertMultiple(vararg records: EmploymentStatusRecord) =
    insertMultiple(records.toList())

fun EmploymentStatusMapper.insertSelective(record: EmploymentStatusRecord) =
    insert(this::insert, record, EmploymentStatus) {
        map(employmentStatus).toPropertyWhenPresent("employmentStatus", record::employmentStatus)
    }

private val columnList = listOf(employmentStatus)

fun EmploymentStatusMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, EmploymentStatus, completer)

fun EmploymentStatusMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, EmploymentStatus, completer)

fun EmploymentStatusMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, EmploymentStatus, completer)

fun EmploymentStatusMapper.update(completer: UpdateCompleter) =
    update(this::update, EmploymentStatus, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: EmploymentStatusRecord) =
    apply {
        set(employmentStatus).equalTo(record::employmentStatus)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: EmploymentStatusRecord) =
    apply {
        set(employmentStatus).equalToWhenPresent(record::employmentStatus)
    }