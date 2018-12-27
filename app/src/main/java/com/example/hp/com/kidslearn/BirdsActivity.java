package com.example.hp.com.kidslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BirdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("Parrot","Parrot Ccan speak like us"));
        alphabet.add(new abcd_main("Owl","owl can see at night"));
        alphabet.add(new abcd_main("Penguin","penguin stays in very cold areas"));
        alphabet.add(new abcd_main("Dove","dove has beautiful colour on neck"));
        alphabet.add(new abcd_main("sparrow","sparrow is small bird"));

        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);

    }
}
