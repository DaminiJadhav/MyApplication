package com.example.syntagi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.lang.invoke.MethodHandles;

public class Main2Activity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menufile,menu);
        return super.onCreateOptionsMenu(menu);

    }


     public boolean onOptionsItemSelected(MenuItem item)
     {
         int id=item.getItemId();
         switch (id)
         {
             case R.id.home:
                 Toast.makeText(getApplicationContext(),"home",Toast.LENGTH_LONG).show();
                 break;
             case R.id.first:
                 Toast.makeText(getApplicationContext(),"first",Toast.LENGTH_LONG).show();
                 break;
             case R.id.setting:
                 Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_LONG).show();
                 break;
         }
         return true;
     }

}
