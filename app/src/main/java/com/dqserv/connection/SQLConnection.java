package com.dqserv.connection;

import android.content.Context;
import android.database.SQLException;

import java.io.IOException;

/**
 * Created by Ajis on 18-12-2017.
 */

public class SQLConnection {

    public DataBaseHelper getconnection(Context context) {
        DataBaseHelper sqlliteconnection;
        sqlliteconnection = new DataBaseHelper(context);

        try {

            sqlliteconnection.createDataBase();

        } catch (IOException ioe) {

            throw new Error("Unable to create database");


        }

        try {

            sqlliteconnection.openDataBase();

        } catch (SQLException sqle) {

            throw sqle;
        }

        return sqlliteconnection;
    }

}
