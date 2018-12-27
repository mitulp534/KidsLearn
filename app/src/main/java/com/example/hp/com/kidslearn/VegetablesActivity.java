package com.example.hp.com.kidslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class VegetablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("Beetroot","increase blood cell"));
        alphabet.add(new abcd_main("Broccoli","looks like flowers"));
        alphabet.add(new abcd_main("corn","yellow vegetable"));
        alphabet.add(new abcd_main("pea","it is green"));
        alphabet.add(new abcd_main("onion","used in salad and cooking"));
        alphabet.add(new abcd_main("tomato","used in salad"));


        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);

    }
}
