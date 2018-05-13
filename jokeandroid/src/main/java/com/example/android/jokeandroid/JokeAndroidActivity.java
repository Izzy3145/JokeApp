package com.example.android.jokeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//will display an intent passed to it as in intent extra


public class JokeAndroidActivity extends AppCompatActivity {

    private static String JOKE_FROM_JAVA = "joke from java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receivedIntent = getIntent();
        String receivedJoke = receivedIntent.getStringExtra(JOKE_FROM_JAVA);

        Toast.makeText(this, receivedJoke, Toast.LENGTH_SHORT).show();

    }

}
