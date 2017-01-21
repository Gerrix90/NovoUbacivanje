package com.example.gerrix.versioncontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView probaTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        probaTv = (TextView) findViewById(R.id.probaTv);
        probaTv.setText("Ovo mi se ne svidja pa sam ovo ponovo izmenio, jbg takav je zivot");
    }
}
