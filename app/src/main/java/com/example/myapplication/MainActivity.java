package com.example.myapplication;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText search;
    public TextView result;
    public Button again;
    public Button minus_ten;
    public Button plus_ten;
    public Button minus_seven;
    public Button plus_five;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        again = findViewById(R.id.again);
        search = findViewById(R.id.search);
        result = findViewById(R.id.result);

        minus_seven = findViewById(R.id.minus_seven);
        minus_ten = findViewById(R.id.minus_ten);
        plus_five = findViewById(R.id.plus_five);
        plus_ten = findViewById(R.id.plus_ten);

        count();

    }



    private void count() {

//        if (search.getText().length() > 0) {
            minus_seven.setOnClickListener(v -> {
                final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                        this, R.anim.anim);
                minus_seven.startAnimation(animationRotateCenter); //вращаемся ибо нам сучно
                String s1 = search.getText().toString();
                double a = Double.parseDouble(s1);
                double x_seven_minus = a - (a / 100 * 7);
                String seven_minus = Double.toString(x_seven_minus);
                result.setText(seven_minus);
            });
//        }else if(search.getText().length() == 0){
//            Toast.makeText(this, "Please try again", Toast.LENGTH_SHORT).show();
//        }

//        if (search.getText().length() > 0) {
            minus_ten.setOnClickListener(v -> {
                final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                        this, R.anim.anim);
                minus_ten.startAnimation(animationRotateCenter); //вращаемся ибо нам сучно
                String s1 = search.getText().toString();
                double a = Double.parseDouble(s1);
                double x_ten_minus = a - (a / 100 * 10);
                String ten_minus = Double.toString(x_ten_minus);
                result.setText(ten_minus);
            });
//        }else{
//            Toast.makeText(this, "Please try again", Toast.LENGTH_SHORT).show();
//        }

//        if (search.getText().length() > 0) {
            plus_five.setOnClickListener(v -> {
                final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                        this, R.anim.anim);
                plus_five.startAnimation(animationRotateCenter); //вращаемся ибо нам сучно
                String s1 = search.getText().toString();
                double a = Double.parseDouble(s1);
                double x_five_plus = a + (a / 100 * 5);
                String five_plus = Double.toString(x_five_plus);
                result.setText(five_plus);
            });
//        }else{
//            Toast.makeText(this, "Please try again", Toast.LENGTH_SHORT).show();
//        }

//        if (search.getText().length() > 0) {
            plus_ten.setOnClickListener(v -> {
                final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                        this, R.anim.anim);
                plus_ten.startAnimation(animationRotateCenter); //вращаемся ибо нам сучно
                String s1 = search.getText().toString();
                double a = Double.parseDouble(s1);
                double x_ten_plus = a + (a / 100 * 10);
                String ten_plus = Double.toString(x_ten_plus);
                result.setText(ten_plus);
            });
//        }else{
//            Toast.makeText(this, "Please try again", Toast.LENGTH_SHORT).show();
//        }


        again.setOnClickListener(v -> {
            final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                    this, R.anim.anim);
            again.startAnimation(animationRotateCenter); //вращаемся ибо нам сучно
            result.setText("");
            search.setText("");
        });

    }
}
