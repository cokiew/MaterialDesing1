package com.example.uziel.materialdesing1;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colocarFAB();
    }

    public void colocarFAB(){
        FloatingActionButton miFab = (FloatingActionButton)findViewById(R.id.fab);
        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click xd!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
