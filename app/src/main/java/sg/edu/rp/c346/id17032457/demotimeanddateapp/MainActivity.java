package sg.edu.rp.c346.id17032457.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    //Step 1: Declare the field variables
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Step 2: Link the field variables to UI components in layout
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        textView = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.btnReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for the action
                textView.setText("Time is " +  tp.getCurrentHour() + ":" + tp.getCurrentMinute());

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for the action
                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();

                textView.setText("Date is" +day + "/" + month+ "/" +year);


            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020,0,1);

            }
        });




    }
}
