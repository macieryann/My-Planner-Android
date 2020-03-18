package com.zybooks.myplannner1022;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
   Button btnMonthly;
   Button btnWeekly;

   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       // Locate the button in activity_main.xml
       btnMonthly = (Button) findViewById(R.id.btnMonthly);
       btnWeekly = (Button) findViewById(R.id.btnWeekly);

       // Capture button clicks
       btnMonthly.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {
               Intent myIntent = new Intent(MainActivity.this,
                       MonthlyView.class);
               startActivity(myIntent);
           }
       });

       btnWeekly.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {
               Intent myIntent = new Intent(MainActivity.this,
                       WeeklyView.class);
               startActivity(myIntent);
           }
       });
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu, menu);
       return true;
   }
}
