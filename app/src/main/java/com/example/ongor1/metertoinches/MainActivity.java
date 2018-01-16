package com.example.ongor1.metertoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* 1 meter to Inches = 39.37

     */

    private EditText enterMeter;
    private Button convertButton;
    private TextView resulttextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeter = (EditText)findViewById(R.id.meterEditText);
        resulttextView = (TextView)findViewById(R.id.resulTextView);
        convertButton = (Button)findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mul = 39.37;
                double result = 0.0;

                double meterValue = Double.parseDouble(enterMeter.getText().toString());
                result = meterValue*mul;
              // resulttextView.setText(Double.toString(result)+"Inches");
               // resulttextView.setText(String.format("%.2f",result)+);

                if (enterMeter.getText().toString().equals("")){
                    resulttextView.setText(R.string.error_message);
                    resulttextView.setTextColor(Color.RED);

                } else {
                    Double MeterValue = Double.parseDouble(enterMeter.getText().toString());
                    result = MeterValue*mul;

                    resulttextView.setTextColor(Color.DKGRAY);
                    resulttextView.setText(String.format("%.2f",result)+"Inches");

                }
            }
        });
    }
}
