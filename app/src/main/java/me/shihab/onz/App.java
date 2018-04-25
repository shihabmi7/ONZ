package me.shihab.onz;

import android.app.Application;
import android.hardware.SensorManager;
import android.widget.Toast;

//import com.squareup.seismic.ShakeDetector;

public class App extends Application /*implements ShakeDetector.Listener */{

    @Override
    public void onCreate() {
        super.onCreate();

        /*SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);*/
    }

    /*@Override
    public void hearShake() {

        Toast.makeText(getApplicationContext(), "Shake Detected...", Toast.LENGTH_LONG).show();

    }*/
}
