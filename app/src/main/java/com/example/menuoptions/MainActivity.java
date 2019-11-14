package com.example.menuoptions;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author HadarMalul
 * @since 14.11.19
 */

public class MainActivity extends AppCompatActivity {

    LinearLayout LL;

    /**
     * LL is a Linear Layout java component
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL = (LinearLayout) findViewById(R.id.LL);

        /**
         * connecting between the java component to the xml component
         */
    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        return true;

        /**
         * creating the Option Menu
         */
    }

    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if (st.equals("Gray")){
            LL.setBackgroundColor(Color.GRAY);
        }
        if (st.equals("Blue")){
            LL.setBackgroundColor(Color.BLUE);
        }
        if (st.equals("Red")){
            LL.setBackgroundColor(Color.RED);
        }
        return true;

        /**
         *  checking the color on the chosen item and changing the background according to the color
         */
    }

    public void next(View view) {
        Intent si = new Intent(this, anotherColor.class  );
        startActivity(si);

        /**
         *  screen moves to the next activity
         */

    }
}
