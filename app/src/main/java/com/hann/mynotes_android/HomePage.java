package com.hann.mynotes_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private TextView usernameDisplay; // TextView untuk menampilkan username sekaligus mengirim username ke activity lain

    public static final String EXTRA_MESSAGE_USERNAME = "USERNAME"; //Key untuk mengirim username

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        Button createNote = findViewById(R.id.createNote);
        ImageView home = findViewById(R.id.home);
        ImageView addNote = findViewById(R.id.newNote);
        ImageView userProfile = findViewById(R.id.profile);

        Intent intent = getIntent(); //Menerima intent dari semua activity
        String username = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_USERNAME);
        usernameDisplay = findViewById(R.id.username);
        usernameDisplay.setText(username);

        createNote.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToCreateNote = new Intent(HomePage.this, NotePages.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToCreateNote.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke create note
                        startActivity(goToCreateNote);
                        finish();
                    }
                }
        );

        home.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(HomePage.this, "Kamu sudah di Home Page", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        addNote.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToCreateNote = new Intent(HomePage.this, NotePages.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToCreateNote.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke create note
                        startActivity(goToCreateNote);
                        finish();
                    }
                }
        );

        userProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToUserProfile = new Intent(HomePage.this, Profile.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToUserProfile.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke create note
                        startActivity(goToUserProfile);
                        finish();
                    }
                }
        );
    }
}