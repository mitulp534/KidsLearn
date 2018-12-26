package com.example.hp.com.kidslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //create an arraylist of alphabets
        ArrayList<abcd_main> alphabet = new ArrayList<abcd_main>();
        alphabet.add(new abcd_main("Cow","Cow gives milk"));
        alphabet.add(new abcd_main("Dog","Dogs are honest"));
        alphabet.add(new abcd_main("Cat","Cat do meow meow"));
        alphabet.add(new abcd_main("Tiger","Nation animal of india"));
        alphabet.add(new abcd_main("Lion","King of forest"));
        alphabet.add(new abcd_main("Leopard","Fastest running animal"));
        alphabet.add(new abcd_main("Elephant","Have long nose"));

        //LinearLayout abcdRootView =(LinearLayout)findViewById(R.id.abcdRootView);
        abcdAdapter adapter = new abcdAdapter(this,alphabet);

        ListView abcdlistView = (ListView) findViewById(R.id.abcdRootView);

        abcdlistView.setAdapter(adapter);




    }


}
