package com.example.passengersafe;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class TraceMainActivity extends Activity {

	public Button button_trace;
	public Button button_auto;
	public Button button_manual;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trace_main);
		button_trace=(Button) findViewById(R.id.button_trace);
		button_auto=(Button) findViewById(R.id.button_auto);
		button_manual=(Button) findViewById(R.id.button_manual);
		button_trace.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent = new Intent(TraceMainActivity.this,CheckTrace.class);
				startActivity(intent);
			}
		});
		button_auto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent = new Intent(TraceMainActivity.this,AutoTrace.class);
				startActivity(intent);
			}
		});
		button_manual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent = new Intent(TraceMainActivity.this,ManualTrace.class);
				startActivity(intent);
			}
		});
	}
}
