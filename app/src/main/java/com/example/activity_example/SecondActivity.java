package com.example.activity_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtVwName = findViewById(R.id.txtVwName);
        TextView txtVwSurname = findViewById(R.id.txtVwSurname);

        String givenText1 = getIntent().getExtras().getString("text1");
        String givenText2 = getIntent().getExtras().getString("text2");

        txtVwName.setText(givenText1);
        txtVwSurname.setText(givenText2);
    }
}
