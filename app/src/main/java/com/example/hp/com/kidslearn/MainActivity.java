package com.example.hp.com.kidslearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting up click activity for abcd
        TextView abcd = (TextView)findViewById(R.id.abcd);
        //set a clicklistener on that view
        abcd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent abcdIntent = new Intent(MainActivity.this,AbcdActivity.class);
                startActivity(abcdIntent);
            }
        });

        //setting up click activity for animals
        TextView animals = (TextView) findViewById(R.id.animals);
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this,AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        //setting up click event for birds
        TextView birds = (TextView) findViewById(R.id.birds);
        birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent birdsIntent = new Intent(MainActivity.this,BirdsActivity.class);
                startActivity(birdsIntent);
            }
        });

        //setting up click event for fruits
        TextView fruits = (TextView) findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fruitsIntent = new Intent(MainActivity.this,FruitsActivity.class);
                startActivity(fruitsIntent);
            }
        });

        // setting up click event for vegetables
        TextView vegetables = (TextView)findViewById(R.id.vegetables);
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vegetablesIntent = new Intent(MainActivity.this,VegetablesActivity.class);
                startActivity(vegetablesIntent);
            }
        });

        //setting up click event for vehicles
        TextView vehicles = (TextView)findViewById(R.id.vehicles);
        vehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vehicleIntent = new Intent(MainActivity.this,VehiclesActivity.class);
                startActivity(vehicleIntent);
            }
        });
    }
    }

