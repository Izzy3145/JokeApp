package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.jokeandroid.JokeAndroidActivity;
import com.example.android.jokejava.JokeJava;


public class MainActivity extends AppCompatActivity {

    private int mJokeIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public int iterateThroughJokes(int jokeIndex){

        mJokeIndex = jokeIndex;

        if (mJokeIndex < 9){
            mJokeIndex++;
        } else {
            mJokeIndex = 0;
        }

        return mJokeIndex;
    }

    public void tellJoke(View view) {

        iterateThroughJokes(mJokeIndex);

        new EndpointsAsyncTask().execute(new Pair<Context, Integer>(this, mJokeIndex));

    }

}
