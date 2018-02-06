package chaimard.krirk.ac.th.recordweight.utility;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by hero on 30/1/2561.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;



    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();


    }   // constructors

    //    Add Value to userTable
    public long addValueToUserrTable(String nickNameString,
                                     String startAppString,
                                     String weightString,
                                     String heightString,
                                     String genderString,
                                     String ageString) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("NickName",nickNameString );
        contentValues.put("StartApp",startAppString );
        contentValues.put("Weight",weightString );
        contentValues.put("Height",heightString );
        contentValues.put("Gender",genderString );
        contentValues.put("Age",ageString );


        return sqLiteDatabase.insert("userTable",null,contentValues);

    }








}   // Main Class
