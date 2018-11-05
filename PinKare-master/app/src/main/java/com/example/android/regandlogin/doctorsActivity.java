package com.example.android.regandlogin;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class doctorsActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    String phone="919810527702";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        b1= findViewById(R.id.bb1);
        b2= findViewById(R.id.bb2);
        b3= findViewById(R.id.bb3);
        b4= findViewById(R.id.bb4);
        b5= findViewById(R.id.bb5);
        b6= findViewById(R.id.bb6);
        b7= findViewById(R.id.bb7);
        b8= findViewById(R.id.bb8);
        b9= findViewById(R.id.bb9);
        b10= findViewById(R.id.bb10);

        b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
        b10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //INTENT FOR WHATSAPP
                        Intent i = new Intent();
                        i.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                        i.setAction(Intent.ACTION_SEND);
                        i.putExtra(Intent.EXTRA_TEXT,"This is my report to send");
                        i.putExtra("jid", Uri.parse(phone)+"@s.whatsapp.net");
                        i.setType("text/plain");
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                    }
                });
    }
}
