package com.example.ex1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Button btn = (Button)findViewById(R.id.button1);
		Button btn2 = (Button)findViewById(R.id.button2);
		Log.i("Main",btn.toString());
		
		btn.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("Main","clicked....");
				Intent intent = new Intent(MainActivity.this,QuizActivity.class);
				startActivity( intent );
				
			}
		} );
		
		btn2.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("Main","clicked");
				Intent intent1 = new Intent(MainActivity.this,MapActivity.class);
				startActivity( intent1 );
				Log.i("Map","clicked..");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
