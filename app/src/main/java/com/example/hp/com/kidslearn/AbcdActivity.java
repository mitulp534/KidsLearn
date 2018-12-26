package com.example.hp.com.kidslearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AbcdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcd_activity);

        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("A","Apple"));
        alphabet.add(new abcd_main("B","Bluetooth"));
        alphabet.add(new abcd_main("C","Chat"));
        alphabet.add(new abcd_main("D","Desktop"));
        alphabet.add(new abcd_main("E","Email"));
        alphabet.add(new abcd_main("F","Facebook"));
        alphabet.add(new abcd_main("G","Google"));
        alphabet.add(new abcd_main("H","HP"));
        alphabet.add(new abcd_main("I","Iphone"));
        alphabet.add(new abcd_main("J","Java"));
        alphabet.add(new abcd_main("K","Kingston"));
        alphabet.add(new abcd_main("L","Laptop"));
        alphabet.add(new abcd_main("M","Messenger"));
        alphabet.add(new abcd_main("N","Network"));
        alphabet.add(new abcd_main("O","Object"));
        alphabet.add(new abcd_main("P","Picassa"));
        alphabet.add(new abcd_main("Q","QuickHeal"));
        alphabet.add(new abcd_main("R","Ram"));
        alphabet.add(new abcd_main("S","Server"));
        alphabet.add(new abcd_main("T","Twitter"));
        alphabet.add(new abcd_main("U","USB"));
        alphabet.add(new abcd_main("V","Vlc"));
        alphabet.add(new abcd_main("W","WiFi"));
        alphabet.add(new abcd_main("X","Xender"));
        alphabet.add(new abcd_main("Y","YouTube"));
        alphabet.add(new abcd_main("Z","Zorpia"));


        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);




    }



}

