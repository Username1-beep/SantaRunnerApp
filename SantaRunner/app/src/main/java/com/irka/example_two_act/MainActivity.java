package com.irka.example_two_act;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button btnGoToSecond;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoToSecond = (Button) findViewById(R.id.btnGoToSecond);
        btnGoToSecond.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGoToSecond:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
