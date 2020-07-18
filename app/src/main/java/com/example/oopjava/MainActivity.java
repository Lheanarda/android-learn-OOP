package com.example.oopjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnThrowJab, btnThrowHook, btnThrowUppercut, btnThrowSideKick;
    Boxer myBoxer;
    KickBoxer myKickBoxer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Boxer myBoxer = new Boxer();
//        KickBoxer myKickBoxer = new KickBoxer();
//
//        Log.i("mytag", myBoxer.toString());
//        Log.i("mytag",myKickBoxer.toString());
//
//        myBoxer.punchPower = 200; //Kalo bukan private bisa diakses
//        Log.i ("FIGHT",myBoxer.punchPower+"");
//
//        Log.i ("FIGHT",myKickBoxer.punchPower+" "+myKickBoxer.punchSpeed);
//
//       // CREATE NEW OBJECT
//        Log.i("box", (new Boxer().punchPower = 800)+"");
////        new Boxer().punchPower = 200;
//        Log.i("box", (new Boxer())+"");
//        Log.i("box", (new Boxer())+"");

        myBoxer = new Boxer(0,100,80);
//       myBoxer.stamina = 90; // if pubclic static
        Boxer.setStamina(1110); //private static
        myBoxer.throwJab();


        Log.i("mytag","Al Boxer Stamina : "+myBoxer.getStamina()+" this boxer punch speed : "+ myBoxer.getPunchSpeed());

        myKickBoxer=new KickBoxer(2,80,90,100,60);
        Log.i("mytag",myKickBoxer.getKickPower()+"");
        myKickBoxer.getNumberOfGloves();

        btnThrowJab = findViewById(R.id.btnThrowJab);
        btnThrowHook = findViewById(R.id.btnThrowHook);
        btnThrowUppercut = findViewById(R.id.btnThrowUppercut);
        btnThrowSideKick = findViewById(R.id.btnThrowSideKick);

        myKickBoxer.testMethod();
        Log.i("test",myKickBoxer.getKickPower()+"");

    }

    public void throwjabisclicked(View buttonView){
        Toast.makeText(MainActivity.this,myBoxer.throwJab(),Toast.LENGTH_SHORT).show();
    }

    public void throwhookisclicked (View btn){
        Toast.makeText(MainActivity.this,myBoxer.ThrowHook(),Toast.LENGTH_SHORT).show();
    }

    public void throwuppercutisclicked (View btn){
        Toast.makeText(MainActivity.this,myBoxer.ThrowUppercut(),Toast.LENGTH_SHORT).show();
    }

    public void throwsidekickisclicked (View btn){
        Toast.makeText(MainActivity.this,myKickBoxer.ThrowSideKick(),Toast.LENGTH_SHORT).show();
    }
}
