package com.example.interactiveui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<button> extends AppCompatActivity {

    private Button toastButton;
    private Button countButton;
    private TextView countText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastButton = findViewById(R.id.btn_toast);
        countButton = findViewById(R.id.btn_count);
        countText = findViewById(R.id.count_text_view);

       /* toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this is toast", Toast.LENGTH_LONG).show();
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countText.setText(count);
                Log.d("MainActivity", ""+count);
            }
        });*/

    }

    ;

/*    public void toastClick(View view) {
        if (view.getId() == R.id.btn_toast){
            Toast.makeText(MainActivity.this, "this is toast increment", Toast.LENGTH_LONG).show();
        }else if (view.getId() == R.id.btn_count){
            count++;
            countText.setText(""+count);
        }
    }*/
}

