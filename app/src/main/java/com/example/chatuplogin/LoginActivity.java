package com.example.chatuplogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    final String mUtente = "Andrea";
    final String mPwd = "1234";

    EditText nomeUtente;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nomeUtente = (EditText) findViewById(R.id.etRegNome);
        password = (EditText) findViewById(R.id.etRegPassword);


    }



    public void tvRegisgtratiClick(View view) {
        Log.d("Chat","Tasto Registrami premuto");
        Intent intent1 = new Intent(this, RegisterActivity.class);

        startActivity(intent1);
    }



        public void btnLoginClick(View view) {
            Log.d("Chat","Tasto Login premuto");

            if(mUtente.equals(nomeUtente.getText().toString()) && mPwd.equals(password.getText().toString())){

                Intent intent2 = new Intent(this, MainActivity.class);
                intent2.putExtra("messaggio",nomeUtente.getText().toString());
                startActivity(intent2);

            } else {

                Toast.makeText(this,"Credenziali Errate",Toast.LENGTH_LONG).show();
            }

        }




}
