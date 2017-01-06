package io.github.powersavere.powersaving.receiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by sumit on 6/1/17.
 */

public class Governor extends Service {
    private String Tag="Governor";
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(Tag,"Governor service started");
        return START_STICKY;
    }
    }
