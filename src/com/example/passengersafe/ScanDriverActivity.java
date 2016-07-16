package com.example.passengersafe;

import android.os.Bundle;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ScanDriverActivity extends Activity {

	public ImageView imageview1;
	public ImageView imageview2;
	public ImageView imageview3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scan_driver);
		
		imageview1=(ImageView)findViewById(R.id.image_driver1);
		imageview2=(ImageView)findViewById(R.id.image_driver2);
		imageview3=(ImageView)findViewById(R.id.image_driver3);
		
		imageview1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent1=new Intent(ScanDriverActivity.this,PassengerMainActivity.class); 
				startActivity(intent1);
			}
		});
		imageview2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent2=new Intent(ScanDriverActivity.this,PassengerMainActivity.class); 
				startActivity(intent2);
			}
		});
		imageview3.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent3=new Intent(ScanDriverActivity.this,PassengerMainActivity.class); 
				startActivity(intent3);
			}
		});
	}
}
