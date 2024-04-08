package com.app.mad5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displayTextView = findViewById(R.id.displayTextView);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        int userAge = intent.getIntExtra("userAge", 0);
        String userEmail = intent.getStringExtra("userEmail");
        String userContact = intent.getStringExtra("userContact");

        String displayText = "Name: " + userName + "\nAge: " + userAge + "\nEmail: " + userEmail + "\nContact: " + userContact;
        displayTextView.setText(displayText);
    }
}
