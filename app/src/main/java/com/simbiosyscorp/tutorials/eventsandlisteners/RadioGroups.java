package com.simbiosyscorp.tutorials.eventsandlisteners;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroups extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton android, ios, blackBerry;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_groups);
        //Getting a handle on UI
        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        //Setting OnCheckedChangeListener for the RadioGroup,
        // to listen to Radio Button Selection within the group
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Finding which radio button was selected
                if (checkedId == R.id.android) {
                    Toast.makeText(getApplicationContext(), "choice: Android",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ios) {
                    Toast.makeText(getApplicationContext(), "choice: iOS",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: BlackBerry",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

        //Getting a handle to each Radio Button to access it from Button View
        android = (RadioButton) findViewById(R.id.android);
        ios = (RadioButton) findViewById(R.id.ios);
        blackBerry = (RadioButton) findViewById(R.id.blackberry);
        button = (Button) findViewById(R.id.chooseBtn);

        //Setting the listener to react to 'Click' events of the button
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // Finding which radioButton is checked, by id
                if (selectedId == android.getId()) {
                    Toast.makeText(getApplicationContext(), "You chose : Android",
                            Toast.LENGTH_SHORT).show();
                } else if (selectedId == ios.getId()) {
                    Toast.makeText(getApplicationContext(), "You chose : iOS",
                            Toast.LENGTH_SHORT).show();
                } else if (selectedId == blackBerry.getId()){
                    Toast.makeText(getApplicationContext(), "You chose : BlackBerry",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
