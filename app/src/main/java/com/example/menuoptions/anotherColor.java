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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_color);
        LL2 = (LinearLayout) findViewById(R.id.LL2);
    }
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Black");
        return true;
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
    }

    public void back(View view) {
        finish();
    }
}
