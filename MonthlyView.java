package com.zybooks.myplannner1022;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MonthlyView extends AppCompatActivity {
   CalendarView simpleCalendarView;

   @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.calendar_layout);

       //get the reference of Calendarview
       simpleCalendarView = (CalendarView) findViewById(R.id.simpleCalendarView);
       
       //set the red color for the dates of the focused MONTH
       simpleCalendarView.setFocusedMonthDateColor(Color.RED);
       
       //set the yellow color for the dates of an UNfocused MONTH
       simpleCalendarView.setUnfocusedMonthDateColor(Color.YELLOW);
       
       //red color for the selected week's background
       simpleCalendarView.setSelectedWeekBackgroundColor(Color.RED);
       
       //green color for the week separator line
       simpleCalendarView.setWeekSeparatorLineColor(Color.GREEN);

       //perform setOnDateChangeListener even on CalendarView
       simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
           @Override
           public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
               //display the selected date by using a toast
               Toast.makeText(getApplicationContext(), dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
           }
       });

   }
}
