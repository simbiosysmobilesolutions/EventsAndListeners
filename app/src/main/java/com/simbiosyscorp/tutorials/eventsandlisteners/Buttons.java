package com.simbiosyscorp.tutorials.eventsandlisteners;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Buttons extends Activity implements View.OnClickListener {
    Button button1, button2;
    final String DEBUG_TAG = "Debug Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        //Getting handle to UI
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        //Have the button implement  listen to its 'Click' Events
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log and Toast messages to understand Button-Click event
                Toast.makeText(getApplicationContext(), "Button is Listening to this Click!", Toast.LENGTH_SHORT).show();
                Log.i(DEBUG_TAG, "Button is Listening to this Click!");
            }
        });
        //Using the Activity to Listen to the Button's 'Click' Events
        button2.setOnClickListener(this);
    }


    public void buttonFn(View view) {
        //Log and Toast messages to understand Button-Click event
        Toast.makeText(getApplicationContext(),"Executing Function upon 'Click' Event", Toast.LENGTH_SHORT).show();
        Log.i(DEBUG_TAG, "Executing Function upon 'Click' Event");
    }

    @Override
    public void onClick(View v) {
        //Log and Toast messages to understand Button-Click event
        Toast.makeText(getApplicationContext(), "Activity is Listening to this Click!", Toast.LENGTH_SHORT).show();
        Log.i(DEBUG_TAG, "Activity is Listening to this Click!");

    }
    public void next(View view) {
        startActivity(new Intent(getApplicationContext(),CheckBoxes.class));
    }
}
