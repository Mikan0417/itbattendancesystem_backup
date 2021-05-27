package com.attendance.presentation.controller

import com.attendance.application.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

//ADMIN権限のユーザーのみ通信を行うコントローラー
//処理１：勤怠画面出力
//処理２：社員一覧画面を出力する
//処理３：選択した社員の勤怠情報を出力する
//処理４：変更ボタン押下時に社員変更画面を出力する
//処理５：削除ボタン押下時に該当の社員を削除する
//処理６：社員登録内容変更画面の変更（更新）ボタン押下時に該当社員情報を変更する
@Controller
@RequestMapping("admin")
class AdminController(
    private val userService: UserService  //UserServiceクラスを関数として利用できるようにする
) {

    @GetMapping("employee-list")  //社員一覧ページを表示する関数
    fun employeeListPage(model: Model) :String {
        val employeeList=userService.getAllUser()  //UserServiceクラスのgetAllUser関数の機能を変数名(employeeList)で定義して利用できるようにする
        model.addAttribute("employeelist",employeeList)  //employeeListの情報(email,password等)をキー：employeelistへ格納してhtml側で利用できるようにする
        return "admin/employee-list"  //社員一覧ページを返す
    }

    @GetMapping("specific-attendance")  //社員勤怠詳細画面を表示する関数
    fun specificAttendancePage() :String {
        return "admin/specific-attendance"
    }
}