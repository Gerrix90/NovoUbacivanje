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

        ViewClass viewClass = new ViewClass(probaTv);

        ViewController viewController = new ViewController(new Student(),
                viewClass);

        viewController.addStudent(new Student("Jahja"));
        viewController.display();
    }
}
