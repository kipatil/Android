package com.kiran.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {
	
	RadioGroup r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        r1 = (RadioGroup) findViewById(R.id.radioGroup1);
        
        r1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int id) 
			{
				switch (id) 
				{
				case R.id.radio0: Log.d("[DEBUG]", "radio 1st selected");
				break;
				case R.id.radio1: Log.d("[DEBUG]", "radio 2nd button selected");
				break;
				case R.id.radio2: Log.d("[DEBUG]", "radio 3nd button selected");
				break;
				case R.id.radio3: Log.d("[DEBUG]", "radio 4nd button selected");
				break;
				
				
				default:
					break;
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
