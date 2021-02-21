package com.example.feedbackproto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DoBetter : AppCompatActivity() {
    val btn_next by lazy <Button>{findViewById(R.id.btn_dobetternext)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_do_better)

        btn_next.setOnClickListener{
            val intent = Intent(this,EndFeedback::class.java)
            startActivity(intent)
        }
    }
}