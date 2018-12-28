package com.example.hp.com.kidslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AbcdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("A","Apple",R.drawable.alphabet_a));
        alphabet.add(new abcd_main("B","Bluetooth",R.drawable.alphabet_b));
        alphabet.add(new abcd_main("C","Chat",R.drawable.alphabet_c));
        alphabet.add(new abcd_main("D","Desktop",R.drawable.alphabet_d));
        alphabet.add(new abcd_main("E","Email",R.drawable.alphabet_e));
        alphabet.add(new abcd_main("F","Facebook",R.drawable.alphabet_f));
        alphabet.add(new abcd_main("G","Google",R.drawable.alphabet_g));
        alphabet.add(new abcd_main("H","HP",R.drawable.alphabet_h));
        alphabet.add(new abcd_main("I","Iphone",R.drawable.alphabet_i));
        alphabet.add(new abcd_main("J","Java",R.drawable.alphabet_j));
        alphabet.add(new abcd_main("K","Kingston",R.drawable.alphabet_k));
        alphabet.add(new abcd_main("L","Laptop",R.drawable.alphabet_l));
        alphabet.add(new abcd_main("M","Messenger",R.drawable.alphabet_m));
        alphabet.add(new abcd_main("N","Network",R.drawable.alphabet_n));
        alphabet.add(new abcd_main("O","Object",R.drawable.alphabet_o));
        alphabet.add(new abcd_main("P","Picassa",R.drawable.alphabet_p));
        alphabet.add(new abcd_main("Q","QuickHeal",R.drawable.alphabet_q));
        alphabet.add(new abcd_main("R","Ram",R.drawable.alphabet_r));
        alphabet.add(new abcd_main("S","Server",R.drawable.alphabet_s));
        alphabet.add(new abcd_main("T","Twitter",R.drawable.alphhabet_t));
        alphabet.add(new abcd_main("U","USB",R.drawable.alphabet_u));
        alphabet.add(new abcd_main("V","Vlc",R.drawable.alphabet_v));
        alphabet.add(new abcd_main("W","WiFi",R.drawable.alphabet_w));
        alphabet.add(new abcd_main("X","Xender",R.drawable.alphabet_x));
        alphabet.add(new abcd_main("Y","YouTube",R.drawable.alphabet_y));
        alphabet.add(new abcd_main("Z","Zorpia",R.drawable.alphabet_z));


        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);




    }



}

