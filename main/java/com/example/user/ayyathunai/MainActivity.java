package com.example.user.ayyathunai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usr;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr=findViewById(R.id.usrname);
        pwd=findViewById(R.id.password);
        Button in = findViewById(R.id.signin);
        Button up = findViewById(R.id.signup);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usr.getText().toString().equals("admin") &&
                        pwd.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "signing in the application", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(v.getContext(), signinpage.class);
                    startActivity(i);
                }else  if(usr.getText().toString().equals("") &&
                        pwd.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "fill the username and password", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(getApplicationContext(),
                            "enter the proper username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "registration page",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(v.getContext(),signuppage.class);
                startActivity(i);
            }
        });
    }
}
