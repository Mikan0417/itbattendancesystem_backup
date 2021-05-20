package com.attendance.domain.repository

//勤怠情報に関するDBのリポジトリ
//処理１：年・月・ユーザー情報を受け取って、受け取った年と月に対応するDBテーブルを検索し、そのDBテーブルから受け取ったユーザーに一致する勤怠情報を取得する
//処理２：勤怠情報などを受け取って、勤怠情報から登録を行うべきDBテーブルを検索し、勤怠情報を保存する(insert)
//処理３：勤怠情報などを受け取って、登録を行うべきDBテーブルを検索し、勤怠情報を保存する(update)
interface AttendanceRepository {
}