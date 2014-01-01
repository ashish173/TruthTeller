package com.example.newapp;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Declare our view variable
        // findViewById returns View not TextView
        final TextView answerLabel = (TextView) findViewById(R.id.textView1); 
        Button getAnswerButton = (Button) findViewById(R.id.button1);

        getAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			// when the answer button was clicked, so update the answer label to an answer
				String answer = null;
				
				
				Random randomGenerator = new Random();
				int randomNumber = randomGenerator.nextInt(3);
				if(randomNumber == 0) {
					answer = "Yes";
				}
				else if(randomNumber == 1) {
					answer = "No";
				}
				else {
					answer = "Maybe";
				}
				answerLabel.setText(answer);
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
