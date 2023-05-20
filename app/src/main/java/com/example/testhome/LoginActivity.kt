package com.example.testhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var firebaseauth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        firebaseauth =  FirebaseAuth.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        LoginUser("syabinanf25@gmail.com", "123456")

    }

    private fun LoginUser(email: String, pw: String) {

        firebaseauth.signInWithEmailAndPassword(email, pw)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Log.e("Success", "LoginUser: ${it.isSuccessful}", )
                    LogoutUser()

                } else {
                    Log.e("Error", "LoginUser: ${it.exception}", )
                }
            }
    }

    private fun LogoutUser() {
        firebaseauth.signOut()
    }
}