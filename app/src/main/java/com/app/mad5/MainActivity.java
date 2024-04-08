package com.app.mad5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userNameEditText, userAgeEditText, userEmailEditText, userContactEditText;
    private Button sendDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.userNameEditText);
        userAgeEditText = findViewById(R.id.userAgeEditText);
        userEmailEditText = findViewById(R.id.userEmailEditText);
        userContactEditText = findViewById(R.id.userContactEditText);
        sendDataButton = findViewById(R.id.sendDataButton);

        sendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameEditText.getText().toString();
                int userAge = Integer.parseInt(userAgeEditText.getText().toString());
                String userEmail = userEmailEditText.getText().toString();
                String userContact = userContactEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("userName", userName);
                intent.putExtra("userAge", userAge);
                intent.putExtra("userEmail", userEmail);
                intent.putExtra("userContact", userContact);
                startActivity(intent);
            }
        });
    }
}
