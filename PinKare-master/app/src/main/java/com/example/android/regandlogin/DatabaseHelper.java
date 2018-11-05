package com.example.android.regandlogin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, "Project.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table USER (ID INTEGER PRIMARY KEY AUTOINCREMENT, FNAME TEXT, LNAME TEXT, EMAIL TEXT, PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
    }
    //INSERTING IN DATABASE
    public boolean insertData(String FName, String LName, String Email, String Password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("FNAME", FName);
        cv.put("LNAME", LName);
        cv.put("EMAIL", Email);
        cv.put("PASSWORD", Password);
        long result = db.insert("USER", null, cv);
        if(result == -1)
            return false;
        else
            return true;
    }
    //CHECK FOR DUPLICATE MAIL
    public Boolean checkDuplicate(String mail)
    {
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor c = db.rawQuery("Select * from USER where Email = ?",new String[] {mail});
        if(c.getCount()>0)
            return false;
            else return true;
    }
    //CHECKING EMAIL AND PASSWORD COMBINATION CORRECT OR NOT
    public Boolean matchIdPassword(String mail,String passkey)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("Select * from USER where Email=? and Password = ?",new String[] {mail,passkey});
        if(c.getCount()>0)
            return true;
        else return false;
    }
}
