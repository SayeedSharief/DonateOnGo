package com.naveen.donateongo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by lenovo on 29-10-2016.
 */

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView myView = (ImageView) findViewById(R.id.imageView);

        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.splash_screen);
        //final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_in);
        myView.startAnimation(an);
        // myView.startAnimation(an2);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();

                Intent tomain = new Intent(Splash.this, MainActivity.class);
                startActivity(tomain);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
