package com.example.group1lab3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// handle the launch button onClick event
	public void launchActivity(View view) {
		Intent intent = new Intent(this, DisplayNameActivity.class);
		EditText editName = (EditText) findViewById(R.id.edit_name);
		String userName = editName.getText().toString();
		intent.putExtra("USERNAME", userName);
		startActivity(intent);
	}
}
