package com.sliit.studentregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private EditText editTextStudentName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        editTextStudentName = findViewById(R.id.editTextStudentName);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String val = editTextStudentName.getText().toString();

            }
        });


    }
}