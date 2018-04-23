package com.example.adrianch.spinner3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import static com.example.adrianch.spinner3.R.drawable.acuatics;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
ImageButton img;
    int cant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        final ImageButton img = (ImageButton)findViewById(R.id.img);


        final AdapterAnimales adapter = new AdapterAnimales
                (this, R.layout.item_adapter, Animales.gettipoanimal());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        spinner2.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Animales.getAcuaticos()));
                        img.setImageResource(R.drawable.acuatics);



                        break;

                    case 1:
                        spinner2.setAdapter(new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,Animales.getTerrestres()));
                       img.setImageResource(R.drawable.terrestres);
                        break;





                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        }
    }
