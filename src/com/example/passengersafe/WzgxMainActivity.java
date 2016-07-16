package com.example.passengersafe;

import android.os.Bundle;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class WzgxMainActivity extends Activity {

	public Button button_person1;
	public Button button_person2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wzgx_main);
		
		button_person1=(Button)findViewById(R.id.button_person1);
		button_person2=(Button)findViewById(R.id.button_person2);
		button_person1.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Toast.makeText(WzgxMainActivity.this, "已向 父亲 发送共享", 2000).show();
			}
		});
		button_person2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Toast.makeText(WzgxMainActivity.this, "已向 母亲 发送共享", 2000).show();
			}
		});
	}


}
