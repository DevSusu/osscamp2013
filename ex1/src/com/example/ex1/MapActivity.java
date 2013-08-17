package com.example.ex1;

import org.thinker.oss.PositionContent;
import org.thinker.oss.PositionService;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);

		Button btn = (Button)findViewById(R.id.button1);
		Log.i("Main",btn.toString());

		final EditText latText = (EditText)findViewById(R.id.latText2);
		final EditText lngText = (EditText)findViewById(R.id.lngText2);
		
		btn.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				PositionService obj = PositionService.getInstance();
				PositionContent ans = obj.getContent(Double.parseDouble(latText.getText().toString()), Double.parseDouble(lngText.getText().toString()));
				obj.addContent( ans );
				
				Intent intent = new Intent( MapActivity.this , SolveActivity.class );
				startActivity( intent );
			}
		} );
	}

}
