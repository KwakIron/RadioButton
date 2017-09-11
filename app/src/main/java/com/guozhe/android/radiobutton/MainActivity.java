package com.guozhe.android.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button1;
    RadioButton radioButton,radioButton2;
    RadioGroup radioGroup;
    LiumRadioGroup radioGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //radioGroup.getChildCount()는 radioGroup에 있는 button의 개수
                for(int i=0;i<radioGroup.getChildCount();i++){
                    //radioGroup.getChildAt(i)  내가 선택한 radioGroup i번째의 버튼
                    radioButton = (RadioButton)radioGroup.getChildAt(i);
                    if(radioButton.isChecked()){
                        Toast.makeText(MainActivity.this,"선택한 버튼이:"+radioButton.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
        button1 = (Button)findViewById(R.id.button2);
        radioGroup1 = (LiumRadioGroup) findViewById(R.id.radiogroup1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<radioGroup1.getChildCount();i++){
                    //radioGroup.getChildAt(i)  내가 선택한 radioGroup i번째의 버튼
                    radioButton2 = (RadioButton)radioGroup1.getChildAt(i);
                    if(radioButton2.isChecked()){
                        Toast.makeText(MainActivity.this,"선택한 버튼이:"+radioButton2.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }



}
