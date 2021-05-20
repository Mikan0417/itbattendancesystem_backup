package com.attendance.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

//勤怠管理関係の通信を行うコントローラー
//処理１：年・月を受け取って対応した勤怠情報ページを出力(/attendance/{year}/{month})※URLパラメーターから年と月を取得
//処理２：出勤ボタン押下時に勤怠管理に必要な情報(現在時刻、ユーザー名など)をDBに登録する(/attendance/clock/in)
//処理３：退勤ボタン押下時に勤怠管理に必要な情報(現在時刻、ユーザー名など)をDBに登録する(/attendance/clock/out)
@Controller
@RequestMapping("attendance")
class AttendanceController {
}