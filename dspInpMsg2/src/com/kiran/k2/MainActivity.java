package com.kiran.k2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button b1;
	Button b2;
	Button b3;
	
	TextView t1;
	TextView t2;
	
	EditText e1;
	EditText e2;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void d1(View v)
    {
    	String s1 = e1.getText().toString();
    	t1.setText(s1);
    }
    public void d2(View v1)
    {
    	String s2 = e2.getText().toString();
    	t2.setText(s2);
    }
    
    public void d3(View v2)
    {
    	e1.cancelLongPress();
    	e2.cancelLongPress();
    }
}
