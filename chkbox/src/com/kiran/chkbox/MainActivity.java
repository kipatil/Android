package com.kiran.chkbox;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{

	CheckBox opt1;
	CheckBox opt2;
	RadioGroup rg1;
	RadioButton r1,r2,r3;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        opt1 = (CheckBox) findViewById(R.id.checkBox1);
        opt2 = (CheckBox) findViewById(R.id.checkBox2);
        
        rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
        
        r1 = (RadioButton) findViewById(R.id.radio0);
        
        
        
        opt1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			       	 	
        				@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				// TODO Auto-generated method stub
				if(state==true)
				{
					Log.d("[DEBUG]", "OPT1 Checked");
				}
				else
				{
					Log.d("[DEBUG]", "Opt1 is not checked");
				}
			}
		});
        opt2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
       	 	
			@Override
public void onCheckedChanged(CompoundButton arg0, boolean state) {
	// TODO Auto-generated method stub
	if(state==true)
	{
		Log.d("[DEBUG]", "OPT2 Checked");
	}
	else
	{
		Log.d("[DEBUG]", "Opt2 is not checked");
	}
}
});
        
        
    }
    
        private void clickOne() {
        	Log.d("[DEBUG Rad batn 1]", "Clicked btn 1");
		}
        @Override
    	public void onCheckedChanged(RadioGroup arg0, int id) 
    	{
    		switch (id) 
    		{
    		case 0:
    			   Log.d("[DEBUG]", "1st Radio button is selected");
    		break;
    		
    		case 1:Log.d("[DEBUG]", "2nd Radio button is selected");
    		break;
    		
    		case 2:Log.d("[DEBUG]", "3rd Radio button is selected");
    		break;
    		
    		default:
    			break;
    		}
    		
    	}


    }
