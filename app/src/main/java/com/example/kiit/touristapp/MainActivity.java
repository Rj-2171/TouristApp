package com.example.kiit.touristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            Intent i=new Intent(this,KonarkActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW KONARK TEMPLE",
                    Toast.LENGTH_SHORT).show();

        }
        else if(v==b2)
        {
            Intent i=new Intent(this,PuriActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW PURI BEACH",
                    Toast.LENGTH_SHORT).show();
        }
        else if(v==b3)
        {
            Intent i=new Intent(this,JagarActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW JAGARNATH TEMPLE TEMPLE",
                    Toast.LENGTH_SHORT).show();

        }
        else if(v==b4)
        {
            Intent i=new Intent(this,AshokaActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW ASHOKA PILLAR",
                    Toast.LENGTH_SHORT).show();

        }
        else if(v==b5)
        {
            Intent i=new Intent(this,ChilkaActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW CHILKA LAKE",
                    Toast.LENGTH_SHORT).show();

        }
        else if(v==b6)
        {
            Intent i=new Intent(this,WaterActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW LUDU WATERFALLS",
                    Toast.LENGTH_SHORT).show();

        }else if(v==b7)
        {
            Intent i=new Intent(this,NandanActivity.class);
            startActivity(i);
            Toast.makeText(this,"YOU HAVE SELECTED TO VIEW NANDANKANAN VAN",
                    Toast.LENGTH_SHORT).show();

        }

    }
}
