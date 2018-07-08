package com.example.pranayarora.intent3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent A = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(A);
    }
}
