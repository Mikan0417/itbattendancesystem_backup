package com.attendance.application.service

import com.attendance.domain.model.LoginUserInfo
import com.attendance.domain.repository.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Service
import java.lang.IllegalStateException

//ユーザーに関係する処理を実装
//処理１：ログインフォームに入力されたemailを使ってユーザーの情報を検索する
//処理２：社員の一覧をDBから取得する
//処理３：コントローラーで受け取ったユーザー情報をDBに登録する
//処理４：ユーザーIDから該当のユーザー情報を取得する
//処理５：該当のユーザーを削除する（boolean型の削除フラグをtrueにする）
//処理６：該当のユーザー情報を変更する
@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getAllUser(): List<com.attendance.domain.model.User>? {  //ユーザー全件取得関数
        return userRepository.findAll()   //UserRepositoryインターフェースのfindAll関数を返す
    }

}