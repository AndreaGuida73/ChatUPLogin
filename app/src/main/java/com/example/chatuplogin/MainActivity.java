package com.example.chatuplogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle b = getIntent().getExtras();
        String extra = b.getString("messaggio");
        Toast.makeText(this,"Utente: "+extra,Toast.LENGTH_LONG).show();


    }
}
