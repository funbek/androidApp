package com.example.otusactivity2

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        private const val EXTRA_TEXT = "EXTRA_TEXT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<TextView>(R.id.textView1).setTextColor(Color.MAGENTA)

            openSecondActivity()
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<TextView>(R.id.textView2).setTextColor(Color.MAGENTA)

            openSecondActivity()
        }

//        savedInstanceState?.let {
//            findViewById<TextView>(R.id.textView).text = it.getString(EXTRA_TEXT)
//        }

//        findViewById<View>(R.id.btn).setOnClickListener {
////            val intent = Intent(this, secondActivity::class.java)
////
//
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://otus.ru"))
//
//            startActivity(intent)
//        }
    }

    private fun openSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        outState.putString(EXTRA_TEXT, findViewById<TextView>(R.id.textView).text.toString())
//    }

}