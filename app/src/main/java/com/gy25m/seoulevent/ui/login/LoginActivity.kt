package com.gy25m.seoulevent.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.gy25m.seoulevent.databinding.ActivityLoginBinding
import com.gy25m.seoulevent.ui.main.MainActivity
import com.kakao.sdk.auth.model.OAuthToken
import com.kakao.sdk.user.UserApiClient


class LoginActivity : AppCompatActivity() {
    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    val viewModel : LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.apply {
            ivLoginKakao.setOnClickListener { clickLoginKakao() }
        }.root)



    }


    private fun clickLoginKakao(){
        // 카카오 로그인의 공통 콜백 함수
        val callback:(OAuthToken?, Throwable?)->Unit={ token, error->
            if (token!=null){
                Toast.makeText(this, "카카오 로그인 성공", Toast.LENGTH_SHORT).show()

                // 사용자 정보 요청 [1.회원주소 2.이메일주소]
                UserApiClient.instance.me { user, error ->
                    if (user!=null){
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    }
                }
            }else{
                Toast.makeText(this, "카카오 로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }

        // 카카오톡이 설치되어 있다면 카톡으로 로그인, 아니면 카카오계정 로그인
        if(UserApiClient.instance.isKakaoTalkLoginAvailable(this)){
            UserApiClient.instance.loginWithKakaoTalk(this, callback = callback)
        }else{
            UserApiClient.instance.loginWithKakaoAccount(this, callback = callback)
        }
    }

    
}