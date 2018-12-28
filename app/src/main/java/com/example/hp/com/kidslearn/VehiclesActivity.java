package com.example.hp.com.kidslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class VehiclesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("cycle","two wheel"));
        alphabet.add(new abcd_main("Bike","Two wheel"));
        alphabet.add(new abcd_main("Car","four wheel"));
        alphabet.add(new abcd_main("Truck","six wheel"));
        alphabet.add(new abcd_main("bus","for wheel"));
        alphabet.add(new abcd_main("train","chain of containers"));
        alphabet.add(new abcd_main("Aeroplane","can fly in the sky"));

        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);

    }
}
