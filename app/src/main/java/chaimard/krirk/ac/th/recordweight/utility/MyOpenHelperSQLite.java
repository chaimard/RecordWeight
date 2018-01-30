package chaimard.krirk.ac.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hero on 30/1/2561.
 */

public class MyOpenHelperSQLite extends SQLiteOpenHelper{

    //    Explicit
    private Context context;    // ท่าสำหรับส่งข้อมูล
    public static final String databaseName = "Weight.db"; // เห็นจากคลาสภายนอกได้ สแตติกคือคงที่ final คือไม่มีการเปลี่นนแปลง
    private static final int databaseVersion = 1;  // ใช้ได้เฉพาะในคลาส คงที่ ไม่มีการเปลี่ยนแปลง
    private static final String databaseDetailuserTABLE = "create table userTABLE(" +
            "id integer primary key," +
            "NickName text," +
            "StartApp text," +
            "Weight text," +
            "Height text," +
            "Gender text," +
            "Age text);";

    private static final String databaseDetaildailyTABLE = "create table dailyTABLE(" +
            "id integer primary key," +
            "DateCheck text," +
            "Weight text);";



    //constructor คือ method ชื่อเดียวกับ class
    // alt+insert constructor

    public MyOpenHelperSQLite(Context context) {
        super(context,databaseName,null,databaseVersion);
        this.context = context;

    } //constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(databaseDetailuserTABLE);
        sqLiteDatabase.execSQL(databaseDetaildailyTABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

} //Main
