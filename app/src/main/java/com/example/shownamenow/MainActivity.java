package com.example.shownamenow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button myButton;
    private TextView myText;
    private EditText myTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextInput = findViewById(R.id.editText);

        myText = findViewById(R.id.textView);
        myText.setText("");

        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String newText;
                newText = myTextInput.getText().toString();

                myText.append(newText);
                myText.append(System.getProperty("line.separator"));

                myTextInput.setText("");
            }
        });
    }
}