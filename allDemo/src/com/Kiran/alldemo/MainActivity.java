package com.Kiran.alldemo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	CheckBox chk1;
	CheckBox chk2;
	ToggleButton tb;
	RadioGroup rg;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        chk1 = (CheckBox) findViewById(R.id.checkBox1);
        chk2 =(CheckBox) findViewById(R.id.checkBox2);
        tb = (ToggleButton) findViewById(R.id.toggleButton1);
        rg = (RadioGroup) findViewById(R.id.toggleButton1);
        
        
       chk1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean state) 
		{
			if(state==true)	
			{
				Log.d("[DEBUG]", "Option 1 checked");
				Toast.makeText(MainActivity.this, (CharSequence) chk1, Toast.LENGTH_SHORT).show();
			}
			
		}
	});
       
       tb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
			// TODO Auto-generated method stub
			if(arg1==true)	
			{
				Log.d("[DEBUG]", "ON ");
				Toast.makeText(MainActivity.this, (CharSequence) tb, Toast.LENGTH_SHORT).show();
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
