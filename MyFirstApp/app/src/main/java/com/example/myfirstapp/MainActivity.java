package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    public static final String TEXT_MESSAGE_KEY = "EL_VALOR_QUE:YO:QUIERA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class );
        TextView textView = findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        intent.putExtra(TEXT_MESSAGE_KEY, message);

        startActivity(intent);
    }
}
