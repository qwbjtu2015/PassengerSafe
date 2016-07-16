package com.example.passengersafe;

import com.example.chengkejiemian.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

@SuppressLint("ShowToast")
public class LogInActivity extends Activity {
	public Button button_login;
	public Spinner spinner1;
	public String spinner_identity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in);
		button_login=(Button)findViewById(R.id.button_login);
		spinner1=(Spinner)findViewById(R.id.Spinner_SelectIdentity);
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent,View view,int pos,long id){
				String[] identity=getResources().getStringArray(R.array.identity);
				spinner_identity=identity[pos];
			}
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO 自动生成的方法存根
				
			}});
		button_login.setOnClickListener(new OnClickListener() {
			

			public void onClick(View v) {
				// TODO 自动生成的方法存根
				switch (spinner_identity) {
				case "司机":
					Intent intent1 = new Intent(LogInActivity.this,DriverMainActivity.class);
					startActivity(intent1);
					break;
				case "乘客":
					Intent intent2 = new Intent(LogInActivity.this,ScanDriverActivity.class);
					startActivity(intent2);
					break;
				case "监视者":
					Intent intent3 = new Intent(LogInActivity.this,TraceMainActivity.class);
					startActivity(intent3);
					break;
				default:
					Toast.makeText(LogInActivity.this, "请选择登陆身份", 2000).show();
					break;
				}
			}
		});
	}
}
