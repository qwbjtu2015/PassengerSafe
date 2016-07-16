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
				// TODO �Զ����ɵķ������
				
			}});
		button_login.setOnClickListener(new OnClickListener() {
			

			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				switch (spinner_identity) {
				case "˾��":
					Intent intent1 = new Intent(LogInActivity.this,DriverMainActivity.class);
					startActivity(intent1);
					break;
				case "�˿�":
					Intent intent2 = new Intent(LogInActivity.this,ScanDriverActivity.class);
					startActivity(intent2);
					break;
				case "������":
					Intent intent3 = new Intent(LogInActivity.this,TraceMainActivity.class);
					startActivity(intent3);
					break;
				default:
					Toast.makeText(LogInActivity.this, "��ѡ���½���", 2000).show();
					break;
				}
			}
		});
	}
}
