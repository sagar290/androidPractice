package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] facultyInitials;
    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facultyInitials = getResources().getStringArray(R.array.faculty_initials);

        spinner = (Spinner)findViewById(R.id.spinner_id);

        textView = (TextView)findViewById(R.id.textViewId);

        Button button = (Button) findViewById(R.id.button_id);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample_view, R.id.textViewSampleId, facultyInitials);

        spinner.setAdapter(adapter);

        button.setOnClickListener(v -> {
            String value = spinner.getSelectedItem().toString();

            if (value.equals("MBH")) {
                value = "MBH: Md. Biplob Hossain \n" +
                        "Assistant Professor \n" +
                        "Department of Information Technology \n" +
                        "Course taking:\n" +
                        "1. PMIT-6307: Data Mining and Knowledge Discovery\n" +
                        "2. PMIT-6113: Mobile Application Development\n";
            } else if (value.equals("MA")) {
                value = "MBH: Mehrin Anannya \n" +
                        "Assistant Professor\n" +
                        "Institute of Information Technology \n" +
                        "Course taking:\n" +
                        "1. PMIT-6217: Wireless Networks\n" +
                        "2. PMIT-6111: Software Testing & Quality Assurance \n";
            } else {
                value = "Not Found";
            }


            textView.setText(value);
        });
    }
}