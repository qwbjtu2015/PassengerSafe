package com.example.passengersafe;


        
import com.example.chengkejiemian.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class PassengerSafe extends Activity {
    /** Called when the activity is first created. */
	public ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qi_don);
        imageView=(ImageView)findViewById(R.id.img_qidong);
        AlphaAnimation anima = new AlphaAnimation(0, 1);
		anima.setDuration(3000);// 设置动画显示时间
		imageView.startAnimation(anima);
		anima.setAnimationListener( new AnimationImpl());
	}

	private class AnimationImpl implements AnimationListener {

		@Override
		public void onAnimationStart(Animation animation) {
			imageView.setBackgroundResource(R.drawable.qidong);
		}

		@Override
		public void onAnimationEnd(Animation animation) {
			Intent intent=new Intent(PassengerSafe.this,LogInActivity.class); 
			startActivity(intent);
		}

		@Override
		public void onAnimationRepeat(Animation animation) {

		}

	}
}

