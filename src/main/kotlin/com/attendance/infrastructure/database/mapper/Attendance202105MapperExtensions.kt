/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.actualWorkingDays
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.attendanceId
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.breakEnd
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.breakStart
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.breakTime
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.date
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.endTime
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.midnightHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.overtimeHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.remainingPaidVacationDays
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.remarks
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.scheduledHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.scheduledWorkingDays
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.startTime
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.totalBreakTime
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.totalHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.totalMidnightHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.totalOvertimeHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.totalScheduledHours
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.usedPaidVacationDays
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.userId
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.userName
import com.attendance.infrastructure.database.mapper.Attendance202105DynamicSqlSupport.Attendance202105.workStyle
import com.attendance.infrastructure.database.record.Attendance202105Record
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun Attendance202105Mapper.count(completer: CountCompleter) =
    countFrom(this::count, Attendance202105, completer)

fun Attendance202105Mapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Attendance202105, completer)

fun Attendance202105Mapper.deleteByPrimaryKey(attendanceId_: Int) =
    delete {
        where(attendanceId, isEqualTo(attendanceId_))
    }

fun Attendance202105Mapper.insert(record: Attendance202105Record) =
    insert(this::insert, record, Attendance202105) {
        map(attendanceId).toProperty("attendanceId")
        map(userId).toProperty("userId")
        map(userName).toProperty("userName")
        map(date).toProperty("date")
        map(workStyle).toProperty("workStyle")
        map(startTime).toProperty("startTime")
        map(endTime).toProperty("endTime")
        map(breakStart).toProperty("breakStart")
        map(breakEnd).toProperty("breakEnd")
        map(breakTime).toProperty("breakTime")
        map(scheduledHours).toProperty("scheduledHours")
        map(overtimeHours).toProperty("overtimeHours")
        map(midnightHours).toProperty("midnightHours")
        map(remarks).toProperty("remarks")
        map(totalBreakTime).toProperty("totalBreakTime")
        map(totalScheduledHours).toProperty("totalScheduledHours")
        map(totalOvertimeHours).toProperty("totalOvertimeHours")
        map(totalMidnightHours).toProperty("totalMidnightHours")
        map(scheduledWorkingDays).toProperty("scheduledWorkingDays")
        map(actualWorkingDays).toProperty("actualWorkingDays")
        map(totalHours).toProperty("totalHours")
        map(usedPaidVacationDays).toProperty("usedPaidVacationDays")
        map(remainingPaidVacationDays).toProperty("remainingPaidVacationDays")
    }

fun Attendance202105Mapper.insertMultiple(records: Collection<Attendance202105Record>) =
    insertMultiple(this::insertMultiple, records, Attendance202105) {
        map(attendanceId).toProperty("attendanceId")
        map(userId).toProperty("userId")
        map(userName).toProperty("userName")
        map(date).toProperty("date")
        map(workStyle).toProperty("workStyle")
        map(startTime).toProperty("startTime")
        map(endTime).toProperty("endTime")
        map(breakStart).toProperty("breakStart")
        map(breakEnd).toProperty("breakEnd")
        map(breakTime).toProperty("breakTime")
        map(scheduledHours).toProperty("scheduledHours")
        map(overtimeHours).toProperty("overtimeHours")
        map(midnightHours).toProperty("midnightHours")
        map(remarks).toProperty("remarks")
        map(totalBreakTime).toProperty("totalBreakTime")
        map(totalScheduledHours).toProperty("totalScheduledHours")
        map(totalOvertimeHours).toProperty("totalOvertimeHours")
        map(totalMidnightHours).toProperty("totalMidnightHours")
        map(scheduledWorkingDays).toProperty("scheduledWorkingDays")
        map(actualWorkingDays).toProperty("actualWorkingDays")
        map(totalHours).toProperty("totalHours")
        map(usedPaidVacationDays).toProperty("usedPaidVacationDays")
        map(remainingPaidVacationDays).toProperty("remainingPaidVacationDays")
    }

fun Attendance202105Mapper.insertMultiple(vararg records: Attendance202105Record) =
    insertMultiple(records.toList())

fun Attendance202105Mapper.insertSelective(record: Attendance202105Record) =
    insert(this::insert, record, Attendance202105) {
        map(attendanceId).toPropertyWhenPresent("attendanceId", record::attendanceId)
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(userName).toPropertyWhenPresent("userName", record::userName)
        map(date).toPropertyWhenPresent("date", record::date)
        map(workStyle).toPropertyWhenPresent("workStyle", record::workStyle)
        map(startTime).toPropertyWhenPresent("startTime", record::startTime)
        map(endTime).toPropertyWhenPresent("endTime", record::endTime)
        map(breakStart).toPropertyWhenPresent("breakStart", record::breakStart)
        map(breakEnd).toPropertyWhenPresent("breakEnd", record::breakEnd)
        map(breakTime).toPropertyWhenPresent("breakTime", record::breakTime)
        map(scheduledHours).toPropertyWhenPresent("scheduledHours", record::scheduledHours)
        map(overtimeHours).toPropertyWhenPresent("overtimeHours", record::overtimeHours)
        map(midnightHours).toPropertyWhenPresent("midnightHours", record::midnightHours)
        map(remarks).toPropertyWhenPresent("remarks", record::remarks)
        map(totalBreakTime).toPropertyWhenPresent("totalBreakTime", record::totalBreakTime)
        map(totalScheduledHours).toPropertyWhenPresent("totalScheduledHours", record::totalScheduledHours)
        map(totalOvertimeHours).toPropertyWhenPresent("totalOvertimeHours", record::totalOvertimeHours)
        map(totalMidnightHours).toPropertyWhenPresent("totalMidnightHours", record::totalMidnightHours)
        map(scheduledWorkingDays).toPropertyWhenPresent("scheduledWorkingDays", record::scheduledWorkingDays)
        map(actualWorkingDays).toPropertyWhenPresent("actualWorkingDays", record::actualWorkingDays)
        map(totalHours).toPropertyWhenPresent("totalHours", record::totalHours)
        map(usedPaidVacationDays).toPropertyWhenPresent("usedPaidVacationDays", record::usedPaidVacationDays)
        map(remainingPaidVacationDays).toPropertyWhenPresent("remainingPaidVacationDays", record::remainingPaidVacationDays)
    }

private val columnList = listOf(attendanceId, userId, userName, date, workStyle, startTime, endTime, breakStart, breakEnd, breakTime, scheduledHours, overtimeHours, midnightHours, remarks, totalBreakTime, totalScheduledHours, totalOvertimeHours, totalMidnightHours, scheduledWorkingDays, actualWorkingDays, totalHours, usedPaidVacationDays, remainingPaidVacationDays)

fun Attendance202105Mapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Attendance202105, completer)

fun Attendance202105Mapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Attendance202105, completer)

fun Attendance202105Mapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Attendance202105, completer)

fun Attendance202105Mapper.selectByPrimaryKey(attendanceId_: Int) =
    selectOne {
        where(attendanceId, isEqualTo(attendanceId_))
    }

fun Attendance202105Mapper.update(completer: UpdateCompleter) =
    update(this::update, Attendance202105, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: Attendance202105Record) =
    apply {
        set(attendanceId).equalTo(record::attendanceId)
        set(userId).equalTo(record::userId)
        set(userName).equalTo(record::userName)
        set(date).equalTo(record::date)
        set(workStyle).equalTo(record::workStyle)
        set(startTime).equalTo(record::startTime)
        set(endTime).equalTo(record::endTime)
        set(breakStart).equalTo(record::breakStart)
        set(breakEnd).equalTo(record::breakEnd)
        set(breakTime).equalTo(record::breakTime)
        set(scheduledHours).equalTo(record::scheduledHours)
        set(overtimeHours).equalTo(record::overtimeHours)
        set(midnightHours).equalTo(record::midnightHours)
        set(remarks).equalTo(record::remarks)
        set(totalBreakTime).equalTo(record::totalBreakTime)
        set(totalScheduledHours).equalTo(record::totalScheduledHours)
        set(totalOvertimeHours).equalTo(record::totalOvertimeHours)
        set(totalMidnightHours).equalTo(record::totalMidnightHours)
        set(scheduledWorkingDays).equalTo(record::scheduledWorkingDays)
        set(actualWorkingDays).equalTo(record::actualWorkingDays)
        set(totalHours).equalTo(record::totalHours)
        set(usedPaidVacationDays).equalTo(record::usedPaidVacationDays)
        set(remainingPaidVacationDays).equalTo(record::remainingPaidVacationDays)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: Attendance202105Record) =
    apply {
        set(attendanceId).equalToWhenPresent(record::attendanceId)
        set(userId).equalToWhenPresent(record::userId)
        set(userName).equalToWhenPresent(record::userName)
        set(date).equalToWhenPresent(record::date)
        set(workStyle).equalToWhenPresent(record::workStyle)
        set(startTime).equalToWhenPresent(record::startTime)
        set(endTime).equalToWhenPresent(record::endTime)
        set(breakStart).equalToWhenPresent(record::breakStart)
        set(breakEnd).equalToWhenPresent(record::breakEnd)
        set(breakTime).equalToWhenPresent(record::breakTime)
        set(scheduledHours).equalToWhenPresent(record::scheduledHours)
        set(overtimeHours).equalToWhenPresent(record::overtimeHours)
        set(midnightHours).equalToWhenPresent(record::midnightHours)
        set(remarks).equalToWhenPresent(record::remarks)
        set(totalBreakTime).equalToWhenPresent(record::totalBreakTime)
        set(totalScheduledHours).equalToWhenPresent(record::totalScheduledHours)
        set(totalOvertimeHours).equalToWhenPresent(record::totalOvertimeHours)
        set(totalMidnightHours).equalToWhenPresent(record::totalMidnightHours)
        set(scheduledWorkingDays).equalToWhenPresent(record::scheduledWorkingDays)
        set(actualWorkingDays).equalToWhenPresent(record::actualWorkingDays)
        set(totalHours).equalToWhenPresent(record::totalHours)
        set(usedPaidVacationDays).equalToWhenPresent(record::usedPaidVacationDays)
        set(remainingPaidVacationDays).equalToWhenPresent(record::remainingPaidVacationDays)
    }

fun Attendance202105Mapper.updateByPrimaryKey(record: Attendance202105Record) =
    update {
        set(userId).equalTo(record::userId)
        set(userName).equalTo(record::userName)
        set(date).equalTo(record::date)
        set(workStyle).equalTo(record::workStyle)
        set(startTime).equalTo(record::startTime)
        set(endTime).equalTo(record::endTime)
        set(breakStart).equalTo(record::breakStart)
        set(breakEnd).equalTo(record::breakEnd)
        set(breakTime).equalTo(record::breakTime)
        set(scheduledHours).equalTo(record::scheduledHours)
        set(overtimeHours).equalTo(record::overtimeHours)
        set(midnightHours).equalTo(record::midnightHours)
        set(remarks).equalTo(record::remarks)
        set(totalBreakTime).equalTo(record::totalBreakTime)
        set(totalScheduledHours).equalTo(record::totalScheduledHours)
        set(totalOvertimeHours).equalTo(record::totalOvertimeHours)
        set(totalMidnightHours).equalTo(record::totalMidnightHours)
        set(scheduledWorkingDays).equalTo(record::scheduledWorkingDays)
        set(actualWorkingDays).equalTo(record::actualWorkingDays)
        set(totalHours).equalTo(record::totalHours)
        set(usedPaidVacationDays).equalTo(record::usedPaidVacationDays)
        set(remainingPaidVacationDays).equalTo(record::remainingPaidVacationDays)
        where(attendanceId, isEqualTo(record::attendanceId))
    }

fun Attendance202105Mapper.updateByPrimaryKeySelective(record: Attendance202105Record) =
    update {
        set(userId).equalToWhenPresent(record::userId)
        set(userName).equalToWhenPresent(record::userName)
        set(date).equalToWhenPresent(record::date)
        set(workStyle).equalToWhenPresent(record::workStyle)
        set(startTime).equalToWhenPresent(record::startTime)
        set(endTime).equalToWhenPresent(record::endTime)
        set(breakStart).equalToWhenPresent(record::breakStart)
        set(breakEnd).equalToWhenPresent(record::breakEnd)
        set(breakTime).equalToWhenPresent(record::breakTime)
        set(scheduledHours).equalToWhenPresent(record::scheduledHours)
        set(overtimeHours).equalToWhenPresent(record::overtimeHours)
        set(midnightHours).equalToWhenPresent(record::midnightHours)
        set(remarks).equalToWhenPresent(record::remarks)
        set(totalBreakTime).equalToWhenPresent(record::totalBreakTime)
        set(totalScheduledHours).equalToWhenPresent(record::totalScheduledHours)
        set(totalOvertimeHours).equalToWhenPresent(record::totalOvertimeHours)
        set(totalMidnightHours).equalToWhenPresent(record::totalMidnightHours)
        set(scheduledWorkingDays).equalToWhenPresent(record::scheduledWorkingDays)
        set(actualWorkingDays).equalToWhenPresent(record::actualWorkingDays)
        set(totalHours).equalToWhenPresent(record::totalHours)
        set(usedPaidVacationDays).equalToWhenPresent(record::usedPaidVacationDays)
        set(remainingPaidVacationDays).equalToWhenPresent(record::remainingPaidVacationDays)
        where(attendanceId, isEqualTo(record::attendanceId))
    }