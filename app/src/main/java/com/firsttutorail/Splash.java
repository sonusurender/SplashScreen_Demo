package com.firsttutorail;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;

public class Splash extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		// Thread
		new Handler().postDelayed(new Runnable() {
			/*
			 * Showing splash screen with a timer. This will be useful when you
			 * want to show case your app logo / company
			 */
			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
				Intent in = new Intent(Splash.this, MainActivity.class);
				startActivity(in);
				// close this activity
				finish();
			}
		}, 3000);

	}
}
