package com.attendance.presentation.form

//ユーザーの新規登録を行う際に受け取るデータ
data class UserInsertInfo(
    val hoge: String
)

//ユーザー検索を行う際に受け取るデータ
data class UserSelectInfo(
    val hoge: String
)

//ユーザー情報を変更する際に受け取るデータ
data class UserUpdateInfo(
    val hoge: String
)

//ユーザー情報を削除する際に受け取るデータ
data class UserDeleteInfo(
    val hoge: String
)