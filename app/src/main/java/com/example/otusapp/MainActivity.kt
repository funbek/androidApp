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
        const val FIRST_DESCRIPTION = "some description of first film"
        const val SECOND_DESCRIPTION = "some description of second film"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            findViewById<TextView>(R.id.textView1).setTextColor(Color.MAGENTA)

            openSecondActivity(FIRST_DESCRIPTION)
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            findViewById<TextView>(R.id.textView2).setTextColor(Color.MAGENTA)

            openSecondActivity(SECOND_DESCRIPTION)
        }
    }

    private fun openSecondActivity(descriptionData: String) {
        val intent = Intent(this, SecondActivity::class.java)

        intent.putExtra("description", descriptionData)
        startActivity(intent)
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        outState.putString(EXTRA_TEXT, findViewById<TextView>(R.id.textView).text.toString())
//    }

}