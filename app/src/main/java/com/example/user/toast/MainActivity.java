package com.example.user.toast;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      clickButton=findViewById(R.id.clickButton);
      clickButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              LayoutInflater inflater=getLayoutInflater();
          View customView = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customtoast_id));

          Toast toast=new Toast(MainActivity.this);

           toast.setDuration(Toast.LENGTH_SHORT);
           toast.setGravity(Gravity.CENTER,0,0);
           toast.setView(customView);
           toast.show();

          }
      });
      }

    }
