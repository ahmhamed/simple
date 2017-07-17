package com.example.ahamed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String msgKey = "key.com.example.ahamed.myapplication.msgKey";

    TextView txt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.userName);
    }

    public void showName (View view){

       txt.setText("Ahmed Hamed");
    }

   public void callMe (View view){
       String currentButton = ((Button) view ).getText().toString();
       Intent intent ;
       if (currentButton.equals("About Me")){
            intent = new Intent(this , AboutMe.class);

            parseValues(view ,intent );

            startActivity(intent);
       }
       else if (currentButton.equals("My Email")){
            intent = new Intent(this, MyEmail.class);
           startActivity(intent);

       }
   }


   public void parseValues (View view ,Intent intent) {

    intent.putExtra(msgKey , " ==> " +((TextView) findViewById(R.id.userName)).getText().toString() );
       System.out.print(msgKey);
       System.out.print(((TextView) findViewById(R.id.userName)).toString());
   }

}
