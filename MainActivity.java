package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,clear,dot,sum,sub,mul,div,calc,del;
    EditText disp;
    TextView textView;

    double a=0,b=0;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.button10);
        two=findViewById(R.id.button11);
        three=findViewById(R.id.button12);
        four=findViewById(R.id.button7);
        five=findViewById(R.id.button8);
        six=findViewById(R.id.button9);
        seven=findViewById(R.id.button4);
        eight=findViewById(R.id.button5);
        nine=findViewById(R.id.button6);
        zero=findViewById(R.id.button14);
        disp=findViewById(R.id.editText);
        clear=findViewById(R.id.button13);
        dot=findViewById(R.id.button15);
        sum=findViewById(R.id.button17);
        sub=findViewById(R.id.button3);
        mul=findViewById(R.id.button2);
        div=findViewById(R.id.button);
        calc=findViewById(R.id.button19);
        del=findViewById(R.id.button18);
        textView=findViewById(R.id.text);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot.setEnabled(false);
                disp.setText(disp.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot.setEnabled(true);
                disp.setText("");
                textView.setText("");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(disp.getText().toString());
                i=1;
                disp.setText("");
                dot.setEnabled(true);
                textView.setText(textView.getText()+"+");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(disp.getText().toString());
                i=2;
                disp.setText("");
                dot.setEnabled(true);
                textView.setText(textView.getText()+"*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(disp.getText().toString());
                i=3;
                disp.setText("");
                dot.setEnabled(true);
                textView.setText(textView.getText()+"/");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(disp.getText().toString());
                i=4;
                disp.setText("");
                dot.setEnabled(true);
                textView.setText(textView.getText()+"-");
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(disp.getText().toString());
                switch(i){
                    case 1:{
                        //c=a+b;
                        disp.setText(String.valueOf(a+b));
//                      textView.setText(textView.getText()+b);
                    }break;
                    case 2:{
                        //c=a*b;
                        disp.setText(String.valueOf(a*b));
                    }break;
                    case 3:{
                        //c=a/b;
                        disp.setText(String.valueOf(a/b));
                    }break;
                    case 4:{
                        //c=a-b;
                        disp.setText(String.valueOf(a-b));
                    }break;
                    default:{
                        //tv.setText("Give any input..");
                        disp.setText("0");
                    }break;
                }
                // disp.setText(String.valueOf(c));
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=disp.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    disp.setText(str);
                }
                else if (str.length() <=1 ) {
                    disp.setText("");
                }
            }
        });
    }
}