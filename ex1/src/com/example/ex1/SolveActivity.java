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

public class SolveActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_solve);
	
		Button btn = (Button)findViewById(R.id.button1);
		Log.i("Solve",btn.toString());
		
		final EditText answerText = (EditText)findViewById(R.id.useranswer);
		
		final EditText questionText = (EditText)findViewById(R.id.questiontext);
		PositionService obj = PositionService.getInstance();
		PositionContent tmp = obj.getLast();
		
		questionText.setText( obj.getLast().toString() );
		
		btn.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("Solve","clicked....");
				
				Intent intent = new Intent(SolveActivity.this,MapActivity.class);
				startActivity( intent );
				
			}
		} );
	}
	
}
