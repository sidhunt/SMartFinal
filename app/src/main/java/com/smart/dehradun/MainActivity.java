package com.smart.dehradun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity implements AnimationListener{
	
	ImageView icon;
	Animation an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        icon=(ImageView) findViewById(R.id.imageView1);
        an=AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_in);
        an.setAnimationListener(this);
        an.setDuration(2500);
        an.start();
        icon.setAnimation(an);
        icon.startAnimation(an);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		Intent i=new Intent(MainActivity.this, Home.class);
		startActivity(i);
	}


	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		finish();
	}
	
	
    
}
