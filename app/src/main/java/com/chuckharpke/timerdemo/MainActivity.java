package com.chuckharpke.timerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisecondsUntilDone) {

                // Coundown is counting down (every second)

                Log.i("Seconds left", String.valueOf(millisecondsUntilDone / 1000));

            }

            public void onFinish() {

                // Counter is finished! (after 10 seconds)

                Log.i("Done!", "Countdown Timer Finished");

            }
        }.start();

    }
}


        /*
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                // Insert code to be run every second

                Log.i("Runnable has run!", "a second must have passed...");

                handler.postDelayed(this, 1000);

            }
        };

        handler.post(run);
    }
    */

/*    @Override
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
}

*/