package com.simbiosyscorp.tutorials.eventsandlisteners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxes extends AppCompatActivity {
    CheckBox salad, soup, sandwich;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes);

        //Getting handle to UI
        salad = (CheckBox) findViewById(R.id.saladcb);
        soup = (CheckBox) findViewById(R.id.soupcb);
        button = (Button) findViewById(R.id.button);
        sandwich = (CheckBox) findViewById(R.id.sandwichcb);

        //Setting listeners for Checkboxes

        salad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Callback gets executed both when Checkbox is checked and unchecked
                //Checking for 'Selection'
                if (isChecked)
                    Toast.makeText(getApplicationContext(), "Salad Selected", Toast.LENGTH_SHORT).show();
            }
        });
        soup.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Callback gets executed both when Checkbox is checked and unchecked
                //Checking for 'Selection'
                if (isChecked)
                    Toast.makeText(getApplicationContext(), "Soup Selected", Toast.LENGTH_SHORT).show();

            }
        });
        sandwich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Callback gets executed both when Checkbox is checked and unchecked
                //Checking for 'Selection'
                if (isChecked)
                    Toast.makeText(getApplicationContext(), "Sandwich Selected", Toast.LENGTH_SHORT).show();

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code to execute on Button-Click
                StringBuilder opitonsChecked = new StringBuilder("Options Selected: ");
                //Checking if no options were selected
                if(!salad.isChecked()&&!sandwich.isChecked()&&!soup.isChecked())
                    Toast.makeText(getApplicationContext(), "No options Selected", Toast.LENGTH_LONG).show();

                //Checking for the checkBoxes
                if (salad.isChecked())
                    opitonsChecked.append("Salad ");
                if (soup.isChecked())
                    opitonsChecked.append("Soup ");
                if (sandwich.isChecked())
                    opitonsChecked.append("Sandwich ");
                //Displaying options
                Toast.makeText(getApplicationContext(), opitonsChecked, Toast.LENGTH_LONG).show();

            }
        });
    }

    public void next(View view) {
        startActivity(new Intent(getApplicationContext(),RadioGroups.class));
    }
}
