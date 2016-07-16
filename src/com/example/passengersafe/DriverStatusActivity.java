package com.example.passengersafe;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DriverStatusActivity extends Activity {

	public Button button_contact;
	public TextView textView_phone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_driver_status);
		
		button_contact=(Button)findViewById(R.id.button_contact);
		button_contact.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				 textView_phone=(TextView)findViewById(R.id.textView_passengerPhoneNum);
					String phoneno=textView_phone.getText().toString();
					if(phoneno==null||"".equals(phoneno.trim()))
					{
					Toast.makeText(getApplicationContext(), "没有电话号码",
					    Toast.LENGTH_SHORT).show();
					}
					else
					{
					Toast.makeText(getApplicationContext(), "有电话号码"+phoneno,
					    Toast.LENGTH_SHORT).show();
					Intent intent=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+phoneno));
					startActivity(intent);
					}
			}
		});
	}
}
