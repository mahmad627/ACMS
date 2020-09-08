package com.example.acms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
Button login;
TextView signuptext;
EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        login=findViewById(R.id.btn_login);
        email=findViewById(R.id.edt_email);
        password=findViewById(R.id.edt_password);
        signuptext=findViewById(R.id.text_sidnup);
    }
}