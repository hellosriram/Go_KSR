package com.ksr.goksr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private Button loginbtn;
    private EditText email, password;
    private Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupbtn = findViewById(R.id.signupBtn);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent
                        = new Intent(login.this,
                        signup.class);
                startActivity(intent);
            }
        });


    }
}