package com.example.dfragment;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        
        b1.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View arg0) 
			{
				dfragment df1 = new dfragment();
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				
				ft.add(R.id.main_activity_id, df1);
				//ft.addToBackStack("frag1");
				ft.commit();
				
			}
		});
    }


    
}
