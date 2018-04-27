package com.example.hschmachte.simpleprofilendab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.guywithcoffee);

        /*
        Although under the CC0 license not requiring attribution, pic source:
        https://www.pexels.com/photo/man-wearing-jacket-and-holding-cup-sitting-on-the-snow-902215/
         */

        TextView name = findViewById(R.id.name);
        name.setText("Harry Schmach");
        /* Set your profile name size*/
        name.setTextSize(50);
        /* Set your profile name color*/
        name.setTextColor(Color.GREEN);

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("9/20/1994");
        birthday.setHighlightColor(Color.CYAN);
        birthday.setTextColor(Color.MAGENTA);

        TextView country = findViewById(R.id.country);
        country.setText("United States of America");
    }
}
