package com.hann.mynotes_android;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private EditText username; // EditText untuk mengirim username agar bisa ditampilkan
    public static final String EXTRA_MESSAGE_USERNAME = "USERNAME"; //Key untuk mengirim username

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button loginbtn = findViewById(R.id.login);
        username = findViewById(R.id.username); // Inisialisasi EditText (USERNAME)

        Intent intent = getIntent(); //Menerima intent dari semua activity
    }

    public void loginEvent(View view) {
        Intent intent = new Intent(this, HomePage.class); // Membuat intent agar berpindah ke HomePage
        String message = username.getText().toString(); // Mengambil username dari kolom username
        intent.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke semua activity
        startActivity(intent); // Memulai intent
        finish(); // Menutup activity agar tidak bisa kembali ke login page
    }
}