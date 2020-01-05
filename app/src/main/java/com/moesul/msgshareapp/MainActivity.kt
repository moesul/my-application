package com.moesul.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnSend.setOnClickListener {
            val message: String = txtMsg.text.toString();
            Toast.makeText(this, "\"$message\" message will be sent", Toast.LENGTH_SHORT).show()

            // use intent to navigate to SecondActivity class (using java class reflection)
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
