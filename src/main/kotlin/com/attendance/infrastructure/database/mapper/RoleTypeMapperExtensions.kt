/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.RoleTypeDynamicSqlSupport.RoleType
import com.attendance.infrastructure.database.mapper.RoleTypeDynamicSqlSupport.RoleType.role
import com.attendance.infrastructure.database.record.RoleTypeRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun RoleTypeMapper.count(completer: CountCompleter) =
    countFrom(this::count, RoleType, completer)

fun RoleTypeMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, RoleType, completer)

fun RoleTypeMapper.deleteByPrimaryKey(role_: String) =
    delete {
        where(role, isEqualTo(role_))
    }

fun RoleTypeMapper.insert(record: RoleTypeRecord) =
    insert(this::insert, record, RoleType) {
        map(role).toProperty("role")
    }

fun RoleTypeMapper.insertMultiple(records: Collection<RoleTypeRecord>) =
    insertMultiple(this::insertMultiple, records, RoleType) {
        map(role).toProperty("role")
    }

fun RoleTypeMapper.insertMultiple(vararg records: RoleTypeRecord) =
    insertMultiple(records.toList())

fun RoleTypeMapper.insertSelective(record: RoleTypeRecord) =
    insert(this::insert, record, RoleType) {
        map(role).toPropertyWhenPresent("role", record::role)
    }

private val columnList = listOf(role)

fun RoleTypeMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, RoleType, completer)

fun RoleTypeMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, RoleType, completer)

fun RoleTypeMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, RoleType, completer)

fun RoleTypeMapper.update(completer: UpdateCompleter) =
    update(this::update, RoleType, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: RoleTypeRecord) =
    apply {
        set(role).equalTo(record::role)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: RoleTypeRecord) =
    apply {
        set(role).equalToWhenPresent(record::role)
    }