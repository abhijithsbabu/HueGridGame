package com.example.huegrid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context) {
        super(context, "mainDb.db", null, 1);
    }

    @Override
    // The code needed to create a new database
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String stmt = "CREATE TABLE FIRST_TABLE (LEVELSPAGE INTEGER)";

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
