package com.example.android.regandlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1 = (EditText) findViewById(R.id.Email2);
        e2 = (EditText) findViewById(R.id.Password2);
        b1 = (Button)findViewById(R.id.Login2);
        db = new DatabaseHelper(this);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s1 = e1.getText().toString();
                        String s2 = e2.getText().toString();
                        boolean verify = db.matchIdPassword(s1,s2);
                        if(verify == true)
                        {
                            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                            Intent intent =new Intent(LoginActivity.this,webactivity.class);
                            startActivity(intent);
                        }
                        else
                            Toast.makeText(getApplicationContext(), "Wrong mail or password", Toast.LENGTH_SHORT).show();
                    }
                    });
    }
}
