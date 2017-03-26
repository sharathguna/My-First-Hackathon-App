package com.thedebuggers.math;
import java.io.*;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
public class ResultActivity extends Activity  implements OnClickListener{
	
	 String filename = "myfile";
	    String outputString = "Hello world!";
	 File myInternalFile;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get rating bar object
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
		bar.setNumStars(10);
		bar.setStepSize(0.5f);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		String str=b.toString();
		int score= b.getInt("score");
		//display score
		 try {
		        FileOutputStream outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
		        outputStream.write(str.getBytes());
		        t.setText(str);
		        outputStream.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    		  
		if(score>=0&&score<=10){t.setText("Oopsie! Better Luck Next Time!");bar.setRating(3);}
		else if(score>=11&&score<=20){t.setText("Hmmmm.. Someone's been reading a lot of Math");bar.setRating(6);}
		else {t.setText("Who are you? A trivia wizard???");bar.setRating(10);}
		try {
	        FileInputStream inputStream = openFileInput(filename);
	        BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
	        StringBuilder total = new StringBuilder();
	        String line;
	        while ((line = r.readLine()) != null) {
	            total.append(line);
	        }
	        t.setText(score+" Points Last Times");
	        r.close();
	        inputStream.close();
	       
	        Log.d("File", "File contents: " + total);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

		
	}
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;*/
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	}
