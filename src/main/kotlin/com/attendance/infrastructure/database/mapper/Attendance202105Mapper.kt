/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.attendance.infrastructure.database.mapper

import com.attendance.infrastructure.database.record.Attendance202105Record
import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface Attendance202105Mapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<Attendance202105Record>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<Attendance202105Record>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("Attendance202105RecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): Attendance202105Record?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="Attendance202105RecordResult", value = [
        Result(column="attendance_id", property="attendanceId", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="user_id", property="userId", jdbcType=JdbcType.SMALLINT),
        Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        Result(column="date", property="date", jdbcType=JdbcType.DATE),
        Result(column="work_style", property="workStyle", jdbcType=JdbcType.VARCHAR),
        Result(column="start_time", property="startTime", jdbcType=JdbcType.TIME),
        Result(column="end_time", property="endTime", jdbcType=JdbcType.TIME),
        Result(column="break_start", property="breakStart", jdbcType=JdbcType.TIME),
        Result(column="break_end", property="breakEnd", jdbcType=JdbcType.TIME),
        Result(column="break_time", property="breakTime", jdbcType=JdbcType.TIME),
        Result(column="scheduled_hours", property="scheduledHours", jdbcType=JdbcType.TIME),
        Result(column="overtime_hours", property="overtimeHours", jdbcType=JdbcType.TIME),
        Result(column="midnight_hours", property="midnightHours", jdbcType=JdbcType.TIME),
        Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        Result(column="total_break_time", property="totalBreakTime", jdbcType=JdbcType.TIME),
        Result(column="total_scheduled_hours", property="totalScheduledHours", jdbcType=JdbcType.TIME),
        Result(column="total_overtime_hours", property="totalOvertimeHours", jdbcType=JdbcType.TIME),
        Result(column="total_midnight_hours", property="totalMidnightHours", jdbcType=JdbcType.TIME),
        Result(column="scheduled_working_days", property="scheduledWorkingDays", jdbcType=JdbcType.TINYINT),
        Result(column="actual_working_days", property="actualWorkingDays", jdbcType=JdbcType.TINYINT),
        Result(column="total_hours", property="totalHours", jdbcType=JdbcType.TIME),
        Result(column="used_paid_vacation_days", property="usedPaidVacationDays", jdbcType=JdbcType.TINYINT),
        Result(column="remaining_paid_vacation_days", property="remainingPaidVacationDays", jdbcType=JdbcType.TINYINT)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<Attendance202105Record>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}