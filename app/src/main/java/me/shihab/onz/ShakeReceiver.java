package me.shihab.onz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ShakeReceiver extends BroadcastReceiver {
    private static final String TAG = "ShakeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (null != intent && intent.getAction().equals("shake.detector")) {
            Log.d(TAG, "ShakeReceiver CALLED");

            Intent newAct = new Intent(context, WakeUpActivity.class);
            newAct.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(newAct);
//            Log.d(TAG," Called..");
        }
    }
}
