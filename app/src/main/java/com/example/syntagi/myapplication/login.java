package com.example.syntagi.myapplication;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class login extends AppCompatActivity {

    RelativeLayout main;
    EditText ed1,ed2;
    TextView tv1,tv2,tv3;
    Button btn;
    LayoutParams msgdimension,usernamedimension,usernamevaldimension,userpassdim,userpassvaldim,logindimension;
    int msgId=1,usernameId=2,usernamevalId=3,passId=4,passvalId=5,loginId=6;
    int padding=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        createmessage();
        createusername();
        createusernameedit();
        createpasstext();
        createuserpassedit1();
        createloginbutton();
         main.addView(tv1,msgdimension);
         main.addView(tv2,usernamedimension);
         main.addView(ed1,usernamevaldimension);
         main.addView(tv3,userpassdim);
        main.addView(ed2,userpassvaldim);
        main.addView(btn,logindimension);
        setContentView(main);

    }
    private void init()
    {
        main=new RelativeLayout(this);
        msgdimension=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        ed1=new EditText(this);
        ed2=new EditText(this);
        tv1=new TextView(this);
        tv2=new TextView(this);
        tv3=new TextView(this);
        btn=new Button(this);
        main.setLayoutParams(msgdimension);

    }
    private void createmessage()
    {
     msgdimension=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        msgdimension.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tv1.setPadding(padding,100,padding,padding);
        tv1.setText("Please Login First");
        tv1.setId(msgId);


        tv1.setLayoutParams(msgdimension);
    }
    private void createusername()
    {
        usernamedimension=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        usernamedimension.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        usernamedimension.addRule(RelativeLayout.BELOW,msgId);
        usernamedimension.addRule(RelativeLayout.ALIGN_RIGHT,msgId);
        usernamedimension.addRule(RelativeLayout.RIGHT_OF,msgId);
        tv2.setPadding(padding,padding,padding,padding);

        tv2.setText("User name");
        tv2.setId(usernameId);
    }
    private void createusernameedit()
    {
        usernamevaldimension=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        usernamevaldimension.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        usernamevaldimension.addRule(RelativeLayout.RIGHT_OF,usernameId);
        usernamevaldimension.addRule(RelativeLayout.ALIGN_BASELINE,usernameId);
        usernamevaldimension.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
    }
    private void createpasstext()
    {
       userpassdim=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        userpassdim.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        userpassdim.addRule(RelativeLayout.BELOW,usernameId);
        userpassdim.addRule(RelativeLayout.ALIGN_RIGHT,usernameId);
        userpassdim.addRule(RelativeLayout.RIGHT_OF,usernameId);
        tv3.setPadding(padding,padding,padding,padding);

        tv3.setText("Password");
        tv3.setId(passId);
    }
    private void createuserpassedit1()
    {
       userpassvaldim=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        ed2.setId(passvalId);
        userpassvaldim.addRule(RelativeLayout.RIGHT_OF,passId);
        userpassvaldim.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        userpassvaldim.addRule(RelativeLayout.ALIGN_BASELINE,passId);
        userpassvaldim.addRule(RelativeLayout.BELOW,usernamevalId);

    }
    private void createloginbutton()
    {
      logindimension=new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        logindimension.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        logindimension.addRule(RelativeLayout.BELOW,passvalId);
        btn.setText("Login");
    }
}
