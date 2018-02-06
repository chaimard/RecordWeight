package chaimard.krirk.ac.th.recordweight;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chaimard.krirk.ac.th.recordweight.utility.MyManager;
import chaimard.krirk.ac.th.recordweight.utility.MyOpenHelperSQLite;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myManager = new MyManager(MainActivity.this);

//        Test Add User    เดิมสร้างอันนี้ก่อน  เสร็จแล้ว ctrl+alt+M เพื่อสร้าง testAddUser ด้านล่างแล้ว remark
//        myManager.addValueToUserrTable("nick",
//                "start", "weight", "height",
//                "gender", "age");

//        testAddUser();
//---------------------------------

        //สร้าง delete all usertable

//        Delete All userTable
        //-------------
//        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelperSQLite.databaseName,
//                MODE_PRIVATE, null);     //mode private คือลยข้างในเท่านั้น
//
//        sqLiteDatabase.delete("userTABLE", null, null);

        //----------- ทำช่วงนี้เสร็จแล้ว  36-39 แล้วให้ ctrl+alt+M เพื่อสร้าง method ภายนอก 50-55 แล้วไป remark บรรทัด 44


        //deleteAllUserTable();



    }   // Main Method

    private void deleteAllUserTable() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelperSQLite.databaseName,
                MODE_PRIVATE, null);     //mode private คือลยข้างในเท่านั้น

        sqLiteDatabase.delete("userTABLE", null, null);
    }

    private void testAddUser() {
        myManager.addValueToUserrTable("nick",
                "start", "weight", "height",
                "gender", "age");
    }
}   // Main Class
