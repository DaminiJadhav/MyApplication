package com.example.syntagi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity{
    Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
    }


    public void process(View view) {
        Intent i=null,chooser=null;

        if (view.getId() == R.id.button1) {

            i=new Intent(android.content.Intent.ACTION_VIEW);
//           i.setData(Uri.parse("geo.19.079,72.877"));
//            Toast.makeText(getApplicationContext(), "button1 click", Toast.LENGTH_LONG).show();
            startActivity(i);
        }
        if (view.getId() == R.id.button2) {
//            Toast.makeText(getApplicationContext(), "button2 click", Toast.LENGTH_LONG).show();
            i=new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("mailto:"));
            String []to={"supriyakrirsagar1990@gmail.com","daminijadhav1213@gmail.com"};
            i.putExtra(Intent.EXTRA_EMAIL,to);
            i.putExtra(Intent.EXTRA_SUBJECT,"Hi,this was send from my app");
            i.putExtra(Intent.EXTRA_TEXT,"What's up");
            i.setType("message/rfc822");
            chooser=Intent.createChooser(i,"send mail");
            startActivity(i);

            }
        if (view.getId() == R.id.button3) {
            Uri imageuri=Uri.parse("android.resource://MyApplication/drawable/"+R.drawable.index);
            i=new Intent(Intent.ACTION_SEND);
            i.setType("image/*");
            i.putExtra(Intent.EXTRA_STREAM,imageuri);
            i.putExtra(Intent.EXTRA_TEXT,"I have attached this image");
            chooser=Intent.createChooser(i,"send image");
            startActivity(chooser);
        }

    }
}
