package com.example.android.regandlogin;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class LauncherActivity extends AppCompatActivity {
    Button b;
    RelativeLayout r1,r2;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        b=(Button)findViewById(R.id.bbb);
        r1 = (RelativeLayout) findViewById(R.id.one);
        r2 = (RelativeLayout) findViewById(R.id.two);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0) {
                    r2.setVisibility(View.GONE);
                    r1.setVisibility(View.VISIBLE);
                    count++;
                }
                else if(count==1){
                    Intent i = new Intent(LauncherActivity.this,MainActivity.class);
                    startActivity(i);
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_editor.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.editor_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Save" menu option
            case R.id.action_save:
                // Save pet to database
                String url = "http://www.vesnahealthsolutions.com/blog";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

                  // Exit activity

                return true;
            // Respond to a click on the "Delete" menu option

        }
        return super.onOptionsItemSelected(item);
    }
}
