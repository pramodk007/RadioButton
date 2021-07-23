package com.androiddev.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radio_group);
        textView =  findViewById(R.id.textView_selected);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radio_btn_male:
                        textView.setText(getResources().getString(R.string.male));
                        break;
                    case R.id.radio_btn_female:
                        textView.setText(getResources().getString(R.string.female));
                        break;
                    case R.id.radio_btn_other:
                        textView.setText(getResources().getString(R.string.other));
                        break;

                }
            }
        });
    }
}