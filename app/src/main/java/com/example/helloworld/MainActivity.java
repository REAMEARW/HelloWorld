package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txv=(TextView)findViewById(R.id.txv);
        txv.setText("Hello I AM REAMED");
        Masetr();
    }

    public void Masetr()
    {
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Master");
        TestDev();
    }
    public void TestDev()
    {
        TextView txv=(TextView)findViewById(R.id.txv);
        txv.setText("DEV");
    }
}
