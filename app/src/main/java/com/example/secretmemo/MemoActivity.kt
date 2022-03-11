package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)

        val shareButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        shareButton.setOnClickListener{
            val sendIntent = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"공유할 메세지")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent,null)
            startActivity(shareIntent)
        }
    }
}