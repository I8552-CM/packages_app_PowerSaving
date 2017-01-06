package io.github.powersavere.powersaving.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by sumit on 6/1/17.
 */

public class Receiver extends BroadcastReceiver {
    private static final String TAG = "UpdateCheckReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        Log.i(TAG, "Starting");
        Intent i = new Intent(context, Governor.class);
        context.startService(i);
    }
}