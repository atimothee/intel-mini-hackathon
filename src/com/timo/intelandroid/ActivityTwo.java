package com.timo.intelandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_two);
		
		String content = getIntent().getStringExtra("content");
		TextView tv2 = (TextView)findViewById(R.id.tv_two);
		tv2.setText(content);
		
	}

}
