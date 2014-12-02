package com.trhuo.login.activity;

import com.trhuo.login.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * µÇÂ¼Activity
 * @author trh
 *
 */
public class LoginActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
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
