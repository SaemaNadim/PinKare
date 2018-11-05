package com.example.android.regandlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1,e2,e3,e4,e5;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.Fname);
        e2 = (EditText) findViewById(R.id.Lname);
        e3 = (EditText) findViewById(R.id.Email);
        e4 = (EditText) findViewById(R.id.Password);
        e5 = (EditText) findViewById(R.id.Cpassword);
        b1 = (Button) findViewById(R.id.Register);
        b2 = (Button) findViewById(R.id.Login1);
        db = new DatabaseHelper(this);
        b2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
        });
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = e1.getText().toString();
                        String s2 = e2.getText().toString();
                        String s3 = e3.getText().toString();
                        String s4 = e4.getText().toString();
                        String s5 = e5.getText().toString();
                        if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals(""))
                            Toast.makeText(getApplicationContext(), "One or more fields are empty", Toast.LENGTH_SHORT).show();
                        else {
                            if (s4.equals(s5)) {
                                boolean checkOnMail = db.checkDuplicate(s3);
                                if (checkOnMail == true) {
                                    boolean ins = db.insertData(s1, s2, s3, s4);
                                    if (ins == true)
                                    {
                                        Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();
                                        Intent intent =new Intent(MainActivity.this,webactivity.class);
                                        startActivity(intent);
                                    }
                                } else {
                                    Toast.makeText(getApplicationContext(), "Email already exists", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Password do not match", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });
    }
    }