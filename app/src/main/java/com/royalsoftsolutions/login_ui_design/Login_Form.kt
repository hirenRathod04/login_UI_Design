package com.royalsoftsolutions.login_ui_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login_Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login__form)
    }

    fun btn_singin_form(view: View) {
        val intent = Intent (this , Signup_Form::class.java)
        startActivity(intent)
    }
}