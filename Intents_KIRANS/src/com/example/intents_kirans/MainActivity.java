package com.example.intents_kirans;

import android.R.id;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	Button login;
	EditText username;
	EditText password;
	
	String uname = "abc";
	String pwd ="123";

	@Override
    protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				
				
				
				// TODO Auto-generated method stub
				 String s1 = username.getText().toString();
			     String s2 = password.getText().toString();
			     
			     if(uname.equalsIgnoreCase(s1) && pwd.equals(s2))
			     {
			    	 Intent intent = new Intent(MainActivity.this, SecondActivity.class);
						startActivity(intent);
						Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
			    	 Log.d("[DEBUG]", "Login Successful");
			    	 
			     }
			     else
			     {
			    	Log.d("[DEBUG]", "Login fail try again....");
			    	Toast.makeText(MainActivity.this, "Login Unsuccessful", Toast.LENGTH_SHORT).show();
			     }
				
			}

		});
       
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
