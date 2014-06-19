package com.codepath.loginscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		//LinearLayout ll = (LinearLayout) findViewById(R.id.box);
		//ll.setAlpha((float) 0.80);
	}
}
