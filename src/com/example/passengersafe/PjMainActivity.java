package com.example.passengersafe;

import android.os.Bundle;

import com.example.chengkejiemian.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PjMainActivity extends Activity {

	public Button button_jvbao;
	public Button button_submit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pj_main);
		button_jvbao=(Button)findViewById(R.id.button_jvbao);
		button_submit=(Button)findViewById(R.id.button_submit);
		button_jvbao.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("ShowToast")
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Toast.makeText(PjMainActivity.this, "�Ѿٱ���", 2000).show();
				Intent intent1 = new Intent(PjMainActivity.this,PassengerMainActivity.class);
				startActivity(intent1);
			}
		});
		button_submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Toast.makeText(PjMainActivity.this, "�����ύ�ɹ�����л���룡", 2000).show();
				Intent intent2 = new Intent(PjMainActivity.this,PassengerMainActivity.class);
				startActivity(intent2);
			}
		});
	}


}
