package com.example.hp.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // private static final String LOG_TAG =
     //       MainActivity.class.getSimpleName();
   public static EditText username;
    public static EditText passw;
    public static Button log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.name);
        passw=(EditText) findViewById(R.id.pass);
        log=(Button) findViewById(R.id.login);

    }



    public void launchSecondActivity(View view) {
        if (username.getText().toString().equals("namrata") && passw.getText().toString().equals("abcd")) {
            Intent intent = new Intent(this, UserPage.class);
            startActivity(intent);
        } else {
            Toast.makeText(this,"Invalid UserName or Password", Toast.LENGTH_LONG).show();
        }
    }
}

  // public void launchSecondActivity(View view) {
    //    Log.d(LOG_TAG, "Login");
      //  Intent intent = new Intent(this, UserPage.class);
       //startActivity(intent);




    //}
    //public void onClick(View v)
    //{
      //  if(username.getText().toString().equals("namrata")&& passw.getText().toString().equals("abcd"))
        //{
          //  Intent intent = new Intent(this, UserPage.class);
            //startActivity(intent);
        //}
        //else {
          //  log.setEnabled(false);
        //}
        //}

    //public void onClick(View v){
      //  final TextView username =(TextView)findViewById(R.id.name);
        //final TextView password =(TextView)findViewById(R.id.pass);
        //String uname = username.getText().toString();
        //String pass =  password.getText().toString();

        //if(uname.equals("kamlesh") && pass.equals("kamlesh"))
        //startActivity(new Intent(this,UserPage.class).putExtra("usr",(CharSequence)uname));
        //		 else
        //Toast.makeText(this,"Invalid UserName or Password", Toast.LENGTH_LONG).show();





