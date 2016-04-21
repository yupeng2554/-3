package com.it.imgsbrowser4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	int index=4;
	public void fun (View view){
		ImageView showImageView=(ImageView)findViewById(R.id.show_iv);
		int[]imgIds= {R.drawable.all1,R.drawable.all2,R.drawable.all3,R.drawable.all4,R.drawable.all5,R.drawable.all6,R.drawable.all7,
				};
		int id=view.getId();
		if(id==R.id.lenft_btn){
			System.out.println("lenft_btn");
			showImageView.setImageResource(imgIds[index]);
			index--;
			if(index==0)
				index=6;	
		}else if (id==R.id.right_btn){
			System.out.println("right_btn");
			showImageView.setImageResource(imgIds[index]);
			index++;
			if(index==6)
				index=0;
			
		}
			
		}
		


	
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

}
