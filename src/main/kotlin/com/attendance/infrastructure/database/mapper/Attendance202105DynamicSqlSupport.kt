/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDate
import java.time.LocalTime
import org.mybatis.dynamic.sql.SqlTable

object Attendance202105DynamicSqlSupport {
    object Attendance202105 : SqlTable("attendance_202105") {
        val attendanceId = column<Int>("attendance_id", JDBCType.INTEGER)

        val userId = column<Short>("user_id", JDBCType.SMALLINT)

        val userName = column<String>("user_name", JDBCType.VARCHAR)

        val date = column<LocalDate>("date", JDBCType.DATE)

        val workStyle = column<String>("work_style", JDBCType.VARCHAR)

        val startTime = column<LocalTime>("start_time", JDBCType.TIME)

        val endTime = column<LocalTime>("end_time", JDBCType.TIME)

        val breakStart = column<LocalTime>("break_start", JDBCType.TIME)

        val breakEnd = column<LocalTime>("break_end", JDBCType.TIME)

        val breakTime = column<LocalTime>("break_time", JDBCType.TIME)

        val scheduledHours = column<LocalTime>("scheduled_hours", JDBCType.TIME)

        val overtimeHours = column<LocalTime>("overtime_hours", JDBCType.TIME)

        val midnightHours = column<LocalTime>("midnight_hours", JDBCType.TIME)

        val remarks = column<String>("remarks", JDBCType.VARCHAR)

        val totalBreakTime = column<LocalTime>("total_break_time", JDBCType.TIME)

        val totalScheduledHours = column<LocalTime>("total_scheduled_hours", JDBCType.TIME)

        val totalOvertimeHours = column<LocalTime>("total_overtime_hours", JDBCType.TIME)

        val totalMidnightHours = column<LocalTime>("total_midnight_hours", JDBCType.TIME)

        val scheduledWorkingDays = column<Byte>("scheduled_working_days", JDBCType.TINYINT)

        val actualWorkingDays = column<Byte>("actual_working_days", JDBCType.TINYINT)

        val totalHours = column<LocalTime>("total_hours", JDBCType.TIME)

        val usedPaidVacationDays = column<Byte>("used_paid_vacation_days", JDBCType.TINYINT)

        val remainingPaidVacationDays = column<Byte>("remaining_paid_vacation_days", JDBCType.TINYINT)
    }
}