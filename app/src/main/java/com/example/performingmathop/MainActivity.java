package com.example.performingmathop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTotalvalue = findViewById(R.id.txtTotalvalue);
        TextView txtcalculate = findViewById(R.id.txtcalculate);

        String Oldtxt;
         int[]  IntigerArray = {2,34,23,43,123,3,342, 23,43,434,23,32};

         int TotalValue = 0;

         for(int index=0 ; index<IntigerArray.length; index++) {

              TotalValue += IntigerArray[index] ;

             txtTotalvalue.setText(TotalValue + " ");


             //for showing the calculation

         }
         TotalValue = 0;
        for(int counter=0; counter<IntigerArray.length;counter++) {
            Oldtxt = txtcalculate.getText().toString();

            txtcalculate.setText(Oldtxt + " +" + IntigerArray[counter] + "=" + (TotalValue+=IntigerArray[counter] ) +"\n");
        }











    }
}