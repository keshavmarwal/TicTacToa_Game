package com.example.tictactoa_game;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,reset;
    TextView textView;
    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init();
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                textView.setText("");
            }
        });

    }
    public void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        textView=findViewById(R.id.result);
        reset=findViewById(R.id.reset);

    }

    public void Check(View view){
      Button btncurrent=(Button)view;

        if(btncurrent.getText().toString().equals("")){
      if(flag == 0){
          btncurrent.setText("X");
          flag=1;


      }else{
          btncurrent.setText("O");
          flag=0;


      }count++;
        }

      if(count>4){
          result();
      }

    }

    public void result(){
        if(btn1.getText()==btn2.getText() && btn2.getText()==btn3.getText() && btn1.getText().toString()=="X" ){
            textView.setText("User1 Win");
            Reset();

        }
        else if(btn1.getText()==btn2.getText() && btn2.getText()==btn3.getText() && btn1.getText().toString()=="O" ){
            textView.setText("User2 Win");
            Reset();

        }
        else if(btn1.getText()==btn4.getText() && btn4.getText()==btn7.getText() && btn1.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();

        }
        else if(btn1.getText()==btn4.getText() && btn4.getText()==btn7.getText() && btn1.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();

        }
        else if(btn1.getText()==btn5.getText() && btn5.getText()==btn9.getText() && btn1.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();
        }
        else if(btn1.getText()==btn5.getText() && btn5.getText()==btn9.getText() && btn1.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();
        }
        else if(btn2.getText()==btn5.getText() && btn5.getText()==btn8.getText() && btn2.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();
        }
        else if(btn2.getText()==btn5.getText() && btn5.getText()==btn8.getText() && btn2.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();
        }
        else if(btn3.getText()==btn6.getText() && btn6.getText()==btn9.getText() && btn3.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();
        }
        else if(btn3.getText()==btn6.getText() && btn6.getText()==btn9.getText() && btn3.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();
        }
        else if(btn3.getText()==btn5.getText() && btn5.getText()==btn7.getText() && btn3.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();
        }
        else if(btn3.getText()==btn5.getText() && btn5.getText()==btn7.getText() && btn3.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();
        }
        else if(btn4.getText()==btn5.getText() && btn5.getText()==btn6.getText() && btn4.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();
        }
        else if(btn4.getText()==btn5.getText() && btn5.getText()==btn6.getText() && btn4.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();
        }
        else if(btn7.getText()==btn8.getText() && btn8.getText()==btn9.getText() && btn7.getText().toString()=="X"){
            textView.setText("User1 Win");
            Reset();
        }
        else if(btn7.getText()==btn8.getText() && btn8.getText()==btn9.getText() && btn7.getText().toString()=="O"){
            textView.setText("User2 Win");
            Reset();
        }
        else{

        if(count==9){
            textView.setText("Draw");
            Reset();
        }
        }

    }
    public void Reset(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        count=0;


    }

}