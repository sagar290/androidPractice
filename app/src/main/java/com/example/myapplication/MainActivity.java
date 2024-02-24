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

            textView.setText(value);
        });
    }
}