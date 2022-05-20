package com.ayong.alfredyong;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNewPost;
    Button btnShowAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewPost = findViewById(R.id.btnNewPost);
        btnShowAll = findViewById(R.id.btnShowAll);

        btnNewPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newAdvertIntent = new Intent(MainActivity.this, activity_NewAdvert.class);
                startActivity(newAdvertIntent);
            }
        });

        btnShowAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showAdvertIntent = new Intent(MainActivity.this, ShowAdvertsActivity.class);
                startActivity(showAdvertIntent);
            }
        });
    }
}