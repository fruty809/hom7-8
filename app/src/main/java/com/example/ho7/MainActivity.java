package com.example.ho7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer start;
    private Integer end;
    private boolean result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);

    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.one:
                textView.append("1");
                if (textView.getText().toString().equals("0") || result){
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.two:
                if (textView.getText().toString().equals("0") || result){
                    textView.setText("2");
                }else {
                    textView.append("2");
                }

                break;
            case R.id.three:
                if (textView.getText().toString().equals("0") || result){
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                break;

            case R.id.four:
                if (textView.getText().toString().equals("0") || result){
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
                break;

            case R.id.five:
                if (textView.getText().toString().equals("0") || result){
                    textView.setText("5");
                }else {
                    textView.append("5");
                }

                break;

            case R.id.six:
                if (textView.getText().toString().equals("0") || result){
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
                break;

            case R.id.seven:

                if (textView.getText().toString().equals("0") || result){
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
                break;
            case R.id.eight:

                if (textView.getText().toString().equals("0") || result){
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
                break;

            case R.id.nine:

                if (textView.getText().toString().equals("0") || result){
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
                break;

            case R.id.zero:

                if (textView.getText().toString().equals("0") || result){
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
                break;

            case R.id.delete:
                textView.setText("0");
                break;
        }
        result = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.plus:

                start = Integer.valueOf(textView.getText().toString());
                break;

            case  R.id.ravno:
                end = Integer.valueOf(textView.getText().toString());
                Integer answer = start + end;
                textView.setText(answer.toString());
                break;
        }

        switch (view.getId()){
            case R.id.minus:

                start = Integer.valueOf(textView.getText().toString());
                break;

            case  R.id.ravno:
                end = Integer.valueOf(textView.getText().toString());
                Integer answer = start - end;
                textView.setText(answer.toString());
                break;
        }

        switch (view.getId()){
            case R.id.umnozh:

                start = Integer.valueOf(textView.getText().toString());
                break;

            case  R.id.ravno:
                end = Integer.valueOf(textView.getText().toString());
                Integer answer = start * end;
                textView.setText(answer.toString());
                break;
        }

        switch (view.getId()){
            case R.id.delenie:

                start = Integer.valueOf(textView.getText().toString());
                break;

            case  R.id.ravno:
                end = Integer.valueOf(textView.getText().toString());
                Integer answer = start / end;
                textView.setText(answer.toString());
                break;
        }
        result = true;
    }
}