package com.example.otusactivity2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        findViewById<Button>(R.id.shareButton).setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)

            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "https://otus.ru")
            startActivity(Intent.createChooser(intent, "Share"))
        }
    }
}