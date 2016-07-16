package com.example.passengersafe;

import android.os.Bundle;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.view.Menu;

public class CkliMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ckli_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ckli_main, menu);
		return true;
	}

}
