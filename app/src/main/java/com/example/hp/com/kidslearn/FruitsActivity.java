package com.example.hp.com.kidslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("Apple","Good for health"));
        alphabet.add(new abcd_main("Banana","Good for protein"));
        alphabet.add(new abcd_main("Blackberry","good for vitamins"));
        alphabet.add(new abcd_main("coconut","very strong"));
        alphabet.add(new abcd_main("mango","summer fruit"));
        alphabet.add(new abcd_main("pineapple","very crispy fruit"));
        alphabet.add(new abcd_main("watermelon","heavy fruit"));

        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);

    }
}
