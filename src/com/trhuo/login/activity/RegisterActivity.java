package com.trhuo.login.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.trhuo.login.R;


/**
 * ×¢²áActivity
 * @author trh
 *
 */
public class RegisterActivity extends Activity{

	Button btnCancel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		btnCancel = (Button) findViewById(R.id.btnCancel);
	}
	
	public void onClick(View v){
		switch(v.getId()){
		case R.id.btnCancel:
			finish();
			break;
		}
	}
}
