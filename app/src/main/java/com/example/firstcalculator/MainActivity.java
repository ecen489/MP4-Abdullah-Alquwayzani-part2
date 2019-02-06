package com.example.firstcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    Button B1; EditText ET1; RadioGroup RG1; public double stored=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button) findViewById(R.id.button);
        ET1 = (EditText) findViewById(R.id.editText);
        RG1 = (RadioGroup) findViewById(R.id.radioGroup);
    }
    public void computeCalc(View view){
        int index = RG1.indexOfChild(findViewById(RG1.getCheckedRadioButtonId()));
        String s = String.valueOf(ET1.getText());
        switch(index){
            case 0:
                stored = stored + parseDouble(s);
                ET1.setText(Double.toString(stored));
                break;
            case 1:
                stored = stored - parseDouble(s);
                ET1.setText(Double.toString(stored));
                break;
            case 2:
                stored = stored * parseDouble(s);
                ET1.setText(Double.toString(stored));
                break;
            case 3:
                stored = stored / parseDouble(s);
                ET1.setText(Double.toString(stored));
                break;
            case 4:
                stored = 0.0;
                ET1.setText("");
                break;
        }
    }
    public void switchingOperation(View view){
        ET1.setText("");
    }
}
