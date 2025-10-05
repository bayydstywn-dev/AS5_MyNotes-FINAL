package com.hann.mynotes_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    private TextView usernameDisplay;

    public static final String EXTRA_MESSAGE_USERNAME = "USERNAME"; //Key untuk mengirim username

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView home = findViewById(R.id.home);
        ImageView addNote = findViewById(R.id.newNote);
        ImageView userProfile = findViewById(R.id.profile);



        Intent intent = getIntent(); //Menerima intent dari semua activity
        String username = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_USERNAME);
        usernameDisplay = findViewById(R.id.profileName);
        usernameDisplay.setText(username);

        home.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToHome = new Intent(Profile.this, HomePage.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToHome.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke home page
                        startActivity(goToHome);
                        finish();
                    }
                }
        );

        addNote.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToCreateNote = new Intent(Profile.this, NotePages.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToCreateNote.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke home page
                        startActivity(goToCreateNote);
                        finish();
                    }
                }
        );

        userProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Profile.this, "Kamu sudah di Profile Page", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void logOutEvent(View view) {
        Intent goToLogin = new Intent(this, MainActivity.class);
        startActivity(goToLogin);
        finish();
    }
    
}