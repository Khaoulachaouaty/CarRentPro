package iset.project.carrentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN_DURATION = 3000; // Duration in milliseconds (4 seconds)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Delay transition to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to start the main activity
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);

                // Close the splash screen activity
                finish();
            }
        }, SPLASH_SCREEN_DURATION);
    }
}