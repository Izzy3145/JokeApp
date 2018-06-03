package com.example.android.jokeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

//will display an intent passed to it as in intent extra


public class JokeAndroidActivity extends AppCompatActivity {

    private static String JOKE_FROM_JAVA = "joke from java";
    private TextView mJokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android);

        String receivedJoke = "";
        Intent receivedIntent = getIntent();
        if (receivedIntent.hasExtra(JOKE_FROM_JAVA)) {
            receivedJoke = receivedIntent.getStringExtra(JOKE_FROM_JAVA);
        }
        mJokeTv = (TextView) findViewById(R.id.joke_tv);
        mJokeTv.setText(receivedJoke);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
