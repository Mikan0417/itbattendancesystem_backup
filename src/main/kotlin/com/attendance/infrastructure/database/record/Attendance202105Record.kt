/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.record

import java.time.LocalDate
import java.time.LocalTime

data class Attendance202105Record(
    var attendanceId: Int? = null,
    var userId: Short? = null,
    var userName: String? = null,
    var date: LocalDate? = null,
    var workStyle: String? = null,
    var startTime: LocalTime? = null,
    var endTime: LocalTime? = null,
    var breakStart: LocalTime? = null,
    var breakEnd: LocalTime? = null,
    var breakTime: LocalTime? = null,
    var scheduledHours: LocalTime? = null,
    var overtimeHours: LocalTime? = null,
    var midnightHours: LocalTime? = null,
    var remarks: String? = null,
    var totalBreakTime: LocalTime? = null,
    var totalScheduledHours: LocalTime? = null,
    var totalOvertimeHours: LocalTime? = null,
    var totalMidnightHours: LocalTime? = null,
    var scheduledWorkingDays: Byte? = null,
    var actualWorkingDays: Byte? = null,
    var totalHours: LocalTime? = null,
    var usedPaidVacationDays: Byte? = null,
    var remainingPaidVacationDays: Byte? = null
)