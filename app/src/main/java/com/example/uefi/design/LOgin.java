package com.example.uefi.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LOgin extends AppCompatActivity {
 private AppCompatEditText username , pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (AppCompatEditText)findViewById(R.id.textew2);
        pass = (AppCompatEditText)findViewById(R.id.textew);
        Log.i("kill memy " , "my time now");
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);

    }

    public void LOgin(View view) {
      //  Toast.makeText(this, "lol ", Toast.LENGTH_SHORT).show();
        if(username.getText().toString().equals("user") && pass.getText().toString().equals("user")){
            Intent intent = new Intent(this , MainActivity.class);
            startActivity(intent);
        }
    }
}
