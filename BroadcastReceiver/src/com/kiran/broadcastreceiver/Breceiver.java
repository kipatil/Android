package com.kiran.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Breceiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context arg0, Intent arg1)
	{
		// TODO Auto-generated method stub
	
		Toast.makeText(arg0, "phone mode changed", Toast.LENGTH_SHORT).show();
	}
}