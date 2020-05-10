package com.example.chatuplogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void tvLoginClick(View view) {
        Log.d("Chat","e' stato premuto il tasto Login");
        Intent intent1 = new Intent(this, LoginActivity.class);
        startActivity(intent1);
    }

    public void btnRegisterClick(View view) {
        Log.d("Chat","e' stato premuto il tasto Register");
    }
}
