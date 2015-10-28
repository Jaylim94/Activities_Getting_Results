package com.example.getresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get the reference of Edit Text
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }

    public void submitMessage(View v){

        //get the Entered message
        String message = editTextMessage.getText().toString();
        Intent intentMessage = new Intent();

        //put the msssage in Intent
        intentMessage.putExtra("MESSAGE", message);

        //set the Result in Intent
        setResult(2, intentMessage);

        //finish the activity
        finish();

    }
}
