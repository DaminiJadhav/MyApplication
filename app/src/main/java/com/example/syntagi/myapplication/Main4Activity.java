package com.example.syntagi.myapplication;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


    }
    public void showcustom(View v)
    {
        Toast toast=new Toast(this);
                toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM,0,0);
        LayoutInflater inflater=getLayoutInflater();

        View app=inflater.inflate(R.layout.toast_layout, (ViewGroup)findViewById(R.id.linear));
    toast.setView(app);
    toast.show();
    }
}
