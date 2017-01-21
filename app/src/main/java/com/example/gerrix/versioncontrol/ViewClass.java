package com.example.gerrix.versioncontrol;

import android.widget.TextView;

/**
 * Created by Gerrix on 21.1.2017..
 */

public class ViewClass {

    private TextView textView;

    public ViewClass(TextView textView) {
        this.textView = textView;
    }

    public void displey(Student student){

        textView.setText(student.getName());
    }
}
