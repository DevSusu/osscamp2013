package com.example.ex1;

import org.thinker.oss.PositionService;
import org.thinker.oss.QuizPositionVO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuizActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
	
		final EditText nameText = (EditText)findViewById(R.id.quizname);
		final EditText latText = (EditText)findViewById(R.id.lat);
		final EditText lngText = (EditText)findViewById(R.id.lng);
		final EditText answerText = (EditText)findViewById(R.id.quizanswer);
		final EditText descText = (EditText)findViewById(R.id.quizdesc);
		final EditText questionText = (EditText)findViewById(R.id.quizquestion);
		
		Button btn = (Button)findViewById(R.id.button1);
		
		btn.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				QuizPositionVO vo =
						new QuizPositionVO(
								Double.parseDouble(latText.getText().toString()),
								Double.parseDouble(lngText.getText().toString()),
								nameText.getText().toString(),
								questionText.getText().toString(),
								answerText.getText().toString(),
								descText.getText().toString()					
								);
				Log.i("Quiz", vo.toString());
				
				PositionService obj = PositionService.getInstance(); obj.addContent(vo);
				
				Intent intent2 = new Intent(QuizActivity.this,MainActivity.class);
				startActivity( intent2 );
			}
		});
		
	}
	
}
