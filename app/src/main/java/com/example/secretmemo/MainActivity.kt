package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,MemoActivity::class.java)

        findViewById<Button>(R.id.button).setOnClickListener{

            val editPassword = findViewById<EditText>(R.id.editTextNumberPassword)
            val passwordText = editPassword.text.toString()

            if(passwordText=="13579")
            {
                Log.d("Secret Memo", "로그인 성공")
                startActivity(intent)
                this.finish()
            }else{
                Log.d("Secret Memo", "비밀번호가 틀렸어요. 다시 입력해주세요.")
            }
        }
    }
}