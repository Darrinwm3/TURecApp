package com.example.turecapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;

    private static final String DATABASE_NAME = "test.db";

    private static final String TABLE_NAME ="userdata";

    private static final String COLUMN_ID ="weight";
    private static final String COLUMN_NAME ="height";
    private static final String COLUMN_AGE ="age";

    SQLiteDatabase database;

    public DatabaseHandler(Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
        database=getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+" ( " +COLUMN_ID+" INTEGER PRIMARY KEY, "+COLUMN_NAME+" TEXT, "+COLUMN_AGE+" TEXT)");
        db.execSQL("INSERT INTO " + TABLE_NAME+ "(weight, height, age) VALUES (180, 6-2, 20)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}

