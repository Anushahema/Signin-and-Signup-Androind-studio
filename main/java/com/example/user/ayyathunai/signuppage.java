package com.example.user.ayyathunai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class signuppage extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);
        Button submit = findViewById(R.id.submit);
        Button cancel = findViewById(R.id.cancel);
        final EditText user = findViewById(R.id.usr);
        final EditText pawd = findViewById(R.id.pwd);
        final EditText cpwd = findViewById(R.id.cpwd);
        final EditText phno = findViewById(R.id.phno_);
        final EditText address = findViewById(R.id.address);
        final CheckBox agree = findViewById(R.id.agree);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("") &&
                        pawd.getText().toString().equals("") &&
                        cpwd.getText().toString().equals("") &&
                        phno.getText().toString().equals("") &&
                        address.getText().toString().equals("")&&
                        agree.bringPointIntoView(0))
                {
                    Toast.makeText(getApplicationContext(),
                            "fill every thing", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "registration page",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(v.getContext(),MainActivity.class);
                startActivity(i);
            }
        });}
}
