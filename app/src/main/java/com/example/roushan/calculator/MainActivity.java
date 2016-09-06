package com.example.roushan.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button calcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcButton = (Button)findViewById(R.id.calc_button);
    }


    public void onClickCalc(View view) {
        Intent intent = Main2Activity.getNewIntent(this);
        startActivity(intent);
    }
}
