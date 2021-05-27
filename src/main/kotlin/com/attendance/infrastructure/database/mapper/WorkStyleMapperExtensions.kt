/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.WorkStyleDynamicSqlSupport.WorkStyle
import com.attendance.infrastructure.database.mapper.WorkStyleDynamicSqlSupport.WorkStyle.workStyle
import com.attendance.infrastructure.database.record.WorkStyleRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun WorkStyleMapper.count(completer: CountCompleter) =
    countFrom(this::count, WorkStyle, completer)

fun WorkStyleMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, WorkStyle, completer)

fun WorkStyleMapper.deleteByPrimaryKey(workStyle_: String) =
    delete {
        where(workStyle, isEqualTo(workStyle_))
    }

fun WorkStyleMapper.insert(record: WorkStyleRecord) =
    insert(this::insert, record, WorkStyle) {
        map(workStyle).toProperty("workStyle")
    }

fun WorkStyleMapper.insertMultiple(records: Collection<WorkStyleRecord>) =
    insertMultiple(this::insertMultiple, records, WorkStyle) {
        map(workStyle).toProperty("workStyle")
    }

fun WorkStyleMapper.insertMultiple(vararg records: WorkStyleRecord) =
    insertMultiple(records.toList())

fun WorkStyleMapper.insertSelective(record: WorkStyleRecord) =
    insert(this::insert, record, WorkStyle) {
        map(workStyle).toPropertyWhenPresent("workStyle", record::workStyle)
    }

private val columnList = listOf(workStyle)

fun WorkStyleMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, WorkStyle, completer)

fun WorkStyleMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, WorkStyle, completer)

fun WorkStyleMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, WorkStyle, completer)

fun WorkStyleMapper.update(completer: UpdateCompleter) =
    update(this::update, WorkStyle, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: WorkStyleRecord) =
    apply {
        set(workStyle).equalTo(record::workStyle)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: WorkStyleRecord) =
    apply {
        set(workStyle).equalToWhenPresent(record::workStyle)
    }