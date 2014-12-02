package com.trhuo.login.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.trhuo.login.R;

/**
 * µÇÂ¼Activity
 * @author trh
 *
 */
public class LoginActivity extends Activity implements OnClickListener{

	private Button btnToRegister;
	private Button btnForgetPwd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		btnToRegister = (Button) findViewById(R.id.btnToRegister);
		btnForgetPwd = (Button)findViewById(R.id.btnForgetPwd);
		btnToRegister.setOnClickListener(this);
		btnForgetPwd.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.btnToRegister:
			Intent intent = new Intent(this, RegisterActivity.class);
			startActivity(intent);
			break;
		case R.id.btnForgetPwd:
			
			break;
		default:
			break;
		}
	}
}
