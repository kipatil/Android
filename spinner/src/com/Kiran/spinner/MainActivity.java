package com.Kiran.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Spinner spnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] pbrands = {"Sony","Samsung","HTC","Moto","Apple","Micromax","BlackBerry","MI","Lenovo","Nokia"};
        
        spnr = (Spinner) findViewById(R.id.spinner1);
        
        ArrayAdapter<String> adapter  = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, pbrands);
        spnr.setAdapter(adapter);
        
        spnr.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) 
			{

				Log.d("DEBUG", pbrands[position]);
				Toast.makeText(MainActivity.this, pbrands[position], Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});   
    }
}
