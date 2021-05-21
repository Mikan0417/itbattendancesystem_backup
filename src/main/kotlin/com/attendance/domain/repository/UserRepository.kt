package com.attendance.domain.repository

import com.attendance.domain.model.LoginUserInfo

//ユーザーに関係するデータベース処理のインターフェース
//処理１：emailからユーザー情報をDBで検索
//処理２：DBで社員情報を全件検索する
//処理３：ユーザー情報をDBに登録する
//処理４：ユーザーIDから該当のユーザー情報を取得する
//処理５：ユーザー情報を削除する（boolean型の削除フラグをtrueにする）
//処理６：ユーザー情報を変更する
interface UserRepository {
    fun findUserByEmail(email: String): LoginUserInfo?
}