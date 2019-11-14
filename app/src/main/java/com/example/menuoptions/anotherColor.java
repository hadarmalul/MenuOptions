package com.example.menuoptions;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class anotherColor extends AppCompatActivity {

    LinearLayout LL2;

    /**
     * LL2 is a Linear Layout java component
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_color);

        LL2 = (LinearLayout) findViewById(R.id.LL2);

        /**
         * connecting between the java component to the xml component
         */
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Black");
        return true;

        /**
         * creating the Option Menu
         * adding another item (Black)
         */
    }


    public boolean onOptionsItemSelected(MenuItem item){

        String st = item.getTitle().toString();
        if (st.equals("Gray")){
            LL2.setBackgroundColor(Color.GRAY);
        }
        if (st.equals("Blue")){
            LL2.setBackgroundColor(Color.BLUE);
        }
        if (st.equals("Red")){
            LL2.setBackgroundColor(Color.RED);
        }
        if (st.equals("Black")){
            LL2.setBackgroundColor(Color.BLACK);
        }
        return true;

        /**
         *  checking the color on the chosen item and changing the background according to the color
         */
    }

    public void back(View view) {
        finish();

        /**
         *  returns to the main activity
         */
    }

}
