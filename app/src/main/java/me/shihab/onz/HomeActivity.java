package me.shihab.onz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import safety.com.br.android_shake_detector.core.ShakeCallback;
import safety.com.br.android_shake_detector.core.ShakeDetector;
import safety.com.br.android_shake_detector.core.ShakeOptions;

//import com.squareup.seismic.ShakeDetector;

public class HomeActivity extends AppCompatActivity /*implements ShakeDetector.Listener*/ {

    private static final String TAG = "HomeActivity";
    private ShakeDetector shakeDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);*/

        ShakeOptions options = new ShakeOptions()
                .background(true)
                .interval(1000)
                .shakeCount(2)
                .sensibility(2.0f);

        shakeDetector = new ShakeDetector(options).start(this, new ShakeCallback() {
            @Override
            public void onShake() {
                Log.d(TAG, "onShake");

            }
        });

    }

    /*@Override
    public void hearShake() {
        Toast.makeText(getApplicationContext(), "Shake Detected...", Toast.LENGTH_LONG).show();
    }*/
}
