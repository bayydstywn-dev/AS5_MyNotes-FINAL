package com.hann.mynotes_android;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.content.res.ResourcesCompat;

public class NotePages extends AppCompatActivity {

    private EditText writeNote;
    private Button submitBtn;
    private LinearLayout notesContainer;
    private TextView usernameDisplay;
    public static final String EXTRA_MESSAGE_USERNAME = "USERNAME"; //Key untuk mengirim username

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_note_pages);

        writeNote = findViewById(R.id.writeNote);
        submitBtn = findViewById(R.id.submitBtn);
        notesContainer = findViewById(R.id.notesContainer);
        ImageView home = findViewById(R.id.home);
        ImageView addNote = findViewById(R.id.newNote);
        ImageView userProfile = findViewById(R.id.profile);
        usernameDisplay = findViewById(R.id.usermame);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNote();
            }
        });
        Intent intent = getIntent(); //Menerima intent dari semua activity
        String username = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_USERNAME);
        usernameDisplay.setText(username);


        home.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToHome = new Intent(NotePages.this, HomePage.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToHome.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke home
                        startActivity(goToHome);
                    }
                }
        );

        addNote.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(NotePages.this, "Kamu sudah di Note Page", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        userProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent goToUserProfile = new Intent(NotePages.this, Profile.class);
                        String message = usernameDisplay.getText().toString(); // Mengambil username dari kolom username
                        goToUserProfile.putExtra(EXTRA_MESSAGE_USERNAME, message); // Mengirim username ke
                        startActivity(goToUserProfile);
                    }
                }
        );
    }

    private void addNote() {
        String noteText = writeNote.getText().toString().trim();
        if (!noteText.isEmpty()) {
            FrameLayout newNoteLayout = new FrameLayout(this);
            FrameLayout.LayoutParams noteContainerParams = new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            noteContainerParams.setMargins(0,0,0,20); //Memberi jarak antar catatan
            newNoteLayout.setLayoutParams(noteContainerParams); //Memberi aturan layout kepada LinearLayout yang dibuat

            //Membuat sebuah TextView baru untuk menampilkan catatan yang ditambahkan
            TextView newNotes = new TextView(this);
            newNotes.setText(noteText);
            Typeface poppins = ResourcesCompat.getFont(this, R.font.poppins_regular);
            newNotes.setTypeface(poppins); //Font yang digunakan
            newNotes.setTextSize(14); //Ukuran text
            newNotes.setMinHeight(50); //Minimal height
            newNotes.setGravity(Gravity.START | Gravity.CENTER_VERTICAL); //Mengatur gravity text ke tengah secara vertikal
            newNotes.setPadding(20,20,90,20); //Padding didalam textviewnya
            newNotes.setBackgroundResource(R.drawable.bg_note_display); //Memberi background dengan aset yang sudah dibuat
            newNotes.setTextColor(getResources().getColor(R.color.black)); //Memberi warna text

            //Memberi aturan width dan height pada TextView
            FrameLayout.LayoutParams newNotesParams = new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, //Width
                    ViewGroup.LayoutParams.WRAP_CONTENT //Height
            );
            newNotes.setLayoutParams(newNotesParams); //Memberi aturan layout kepada TextView yang dibuat

            Button deleteBtn = new Button(this);
            deleteBtn.setText("×"); //Text pada delete button
            deleteBtn.setTypeface(poppins);
            deleteBtn.setTextSize(20); //Ukuran text pada button
            deleteBtn.setPadding(2,2,2,2); //Padding untuk delete button
            deleteBtn.setBackground(getResources().getDrawable(R.drawable.bg_btn_delete));
            deleteBtn.setTextColor(Color.WHITE); //Warna text pada button

            //Memberi aturan width dan height pada Button
            FrameLayout.LayoutParams deleteBtnParams = new FrameLayout.LayoutParams(
                    80,
                    80,
                    Gravity.TOP | Gravity.END
            );
            deleteBtnParams.setMargins(0, 10, 10, 0);
            deleteBtn.setLayoutParams(deleteBtnParams); //Memberi aturan layout kepada Button yang dibuat

            deleteBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    notesContainer.removeView(newNoteLayout);
                }
            });

            newNoteLayout.addView(newNotes); //Menambahkan TextView ke dalam FrameLayout baru yang dibuat
            newNoteLayout.addView(deleteBtn); //Menambahkan Button ke dalam FrameLayout baru yang dibuat
            notesContainer.addView(newNoteLayout); //Menambahkan FrameLayout baru yang berisi TextView dan Button ke dalam notesContainer

            writeNote.setText(""); //Mengosongkan EditText setelah catatan yang dibuat disubmit/ditambahkan
        }
    }

}