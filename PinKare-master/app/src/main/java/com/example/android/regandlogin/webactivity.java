package com.example.android.regandlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webactivity extends AppCompatActivity {
            WebView web;
        //boolean t = true;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_webactivity);
            web = (WebView) findViewById(R.id.myown);
            WebSettings ws = web.getSettings();
            ws.setJavaScriptEnabled(true);
            if (savedInstanceState == null)
            {
                web.loadUrl("https://breast-cancer-app.herokuapp.com");
            }

            web.setWebViewClient(new WebViewClient());
        }
        @Override
        protected void onSaveInstanceState(Bundle outState)
        {
            super.onSaveInstanceState(outState);
            web.saveState(outState);
        }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState)
        {
            super.onRestoreInstanceState(savedInstanceState);
            web.restoreState(savedInstanceState);
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Insert dummy data" menu option
            case R.id.doctor:
                Intent intent =new Intent(webactivity.this,doctorsActivity.class);
                startActivity(intent);
                return true;
            // Respond to a click on the "Delete all entries" menu option
            case R.id.precautions:
                // Do nothing for now
                Intent i =new Intent(webactivity.this,precautionActivity.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    }

