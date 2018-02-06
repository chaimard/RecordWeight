package chaimard.krirk.ac.th.recordweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chaimard.krirk.ac.th.recordweight.utility.MyManager;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myManager = new MyManager(MainActivity.this);

//        Test Add User
        myManager.addValueToUserrTable("nick",
                "start", "weight", "height",
                "gender", "age");



    }   // Main Method
}   // Main Class
