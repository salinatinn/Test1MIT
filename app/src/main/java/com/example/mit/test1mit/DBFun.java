package com.example.mit.test1mit;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by MIT on 28-Jun-17.
 */

public class DBFun {

    SQLiteDatabase db;
    public String abc="abc";

    public void openDB() {
        try {

            db = SQLiteDatabase.openDatabase("data/data/com.example.mit.test1mit/newg7", null, SQLiteDatabase.CREATE_IF_NECESSARY);
            Log.i("DB Open!", "");
        } catch (SQLException e) {
            Log.i("SQL Exception", "");
        }

    }
}
