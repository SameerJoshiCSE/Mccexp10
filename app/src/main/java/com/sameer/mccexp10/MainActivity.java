package com.sameer.mccexp10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int t=-1;
    public void langChanger(View view){
        t++;
        TextView language=(TextView) findViewById(R.id.textView);
        ImageView lang=(ImageView) findViewById(R.id.imageView);
        switch(t){
            case 0:
                lang.setImageResource(R.drawable.c);
                language.setText("C");
                break;
            case 1:
                lang.setImageResource(R.drawable.cpp);
                language.setText("C++");
                break;
            case 2:
                lang.setImageResource(R.drawable.csharp);
                language.setText("C#");
                break;
            case 3:
                lang.setImageResource(R.drawable.java);
                language.setText("Java");
                break;
            case 4:
                lang.setImageResource(R.drawable.python);
                language.setText("Python");
                break;
            case 5:
                lang.setImageResource(R.drawable.swift);
                language.setText("Swift");
                break;
            case 6:
                lang.setImageResource(R.drawable.ruby);
                language.setText("Ruby");
                break;
            case 7:
                lang.setImageResource(R.drawable.html);
                language.setText("HTML5");
                break;
            case 8:
                lang.setImageResource(R.drawable.css);
                language.setText("CSS3");
                break;
            case 9:
                lang.setImageResource(R.drawable.js);
                language.setText("JavaScript");
                break;
            case 10:
                lang.setImageResource(R.drawable.php);
                language.setText("PHP");
                break;
            case 11:
                lang.setImageResource(R.drawable.julia);
                language.setText("Julia");
                Toast.makeText(MainActivity.this, "This Project created by Sameer Joshi Roll No: 30", Toast.LENGTH_SHORT).show();
                break;
            default:
                t=-1;
                break;
        }
        if(t==11){
            t=-1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
