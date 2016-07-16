package com.example.passengersafe;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class DriverMainActivity extends Activity {

	public Button button_work;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_driver_main);
		
		button_work=(Button)findViewById(R.id.button_GoToWork);
		button_work.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent=new Intent(DriverMainActivity.this,DriverStatusActivity.class); 
				startActivity(intent);
			}
		});
	}
}
