package com.Kiran.spinnerproject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity 
{
	 
	Spinner sp1;
	TextView t1;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] brands = {"BMW","Audi","Jaguar","Ferrari","Bentley","Lamborghini","Msuzuki","Ford","Honda","Land Rover","Mitsubhishi"};
        
        sp1 = (Spinner) findViewById(R.id.sp1);
        t1 = (TextView) findViewById(R.id.textView2);
        
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, brands); 
    	sp1.setAdapter(adapter1);
    	
    
    	sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{				
				Log.d("[DEBUG]", brands[position]);
				Toast.makeText(MainActivity.this, brands[position], Toast.LENGTH_SHORT).show();
				
				//String s2 = (String) getText(position).toString();
				//t1.setText(s2);
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
			
		});		
    }
}