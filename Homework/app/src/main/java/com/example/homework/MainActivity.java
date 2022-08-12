package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a = findViewById(R.id.editTextTextPersonName);
        EditText b = findViewById(R.id.editTextTextPersonName2);
        EditText d = findViewById(R.id.editTextTextPersonName3);
        EditText c = findViewById(R.id.editTextTextPersonName4);
        TextView h = findViewById(R.id.grade);
        TextView j = findViewById(R.id.textView);
        Button n = findViewById(R.id.button);

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(a.getText().toString());
                int number2 = Integer.parseInt(b.getText().toString());
                int number3 = Integer.parseInt(d.getText().toString());
                int number4 = Integer.parseInt(c.getText().toString());

                int result = number1 + number2 + number3 + number4;

                j.setText(String.valueOf(result));

            }
        });








    }
}