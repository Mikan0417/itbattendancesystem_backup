/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.DepartmentDynamicSqlSupport.Department
import com.attendance.infrastructure.database.mapper.DepartmentDynamicSqlSupport.Department.department
import com.attendance.infrastructure.database.record.DepartmentRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun DepartmentMapper.count(completer: CountCompleter) =
    countFrom(this::count, Department, completer)

fun DepartmentMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Department, completer)

fun DepartmentMapper.deleteByPrimaryKey(department_: String) =
    delete {
        where(department, isEqualTo(department_))
    }

fun DepartmentMapper.insert(record: DepartmentRecord) =
    insert(this::insert, record, Department) {
        map(department).toProperty("department")
    }

fun DepartmentMapper.insertMultiple(records: Collection<DepartmentRecord>) =
    insertMultiple(this::insertMultiple, records, Department) {
        map(department).toProperty("department")
    }

fun DepartmentMapper.insertMultiple(vararg records: DepartmentRecord) =
    insertMultiple(records.toList())

fun DepartmentMapper.insertSelective(record: DepartmentRecord) =
    insert(this::insert, record, Department) {
        map(department).toPropertyWhenPresent("department", record::department)
    }

private val columnList = listOf(department)

fun DepartmentMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Department, completer)

fun DepartmentMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Department, completer)

fun DepartmentMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Department, completer)

fun DepartmentMapper.update(completer: UpdateCompleter) =
    update(this::update, Department, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: DepartmentRecord) =
    apply {
        set(department).equalTo(record::department)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: DepartmentRecord) =
    apply {
        set(department).equalToWhenPresent(record::department)
    }