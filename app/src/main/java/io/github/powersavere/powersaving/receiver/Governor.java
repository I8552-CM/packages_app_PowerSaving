package io.github.powersavere.powersaving.receiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import static io.github.powersavere.powersaving.util.PowerUtil.isConnected;

/**
 * Created by sumit on 6/1/17.
 */

public class Governor extends Service {
    private String Tag="Governor";
    private boolean ChargerConnected;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(Tag,"Governor service started");
        if(isConnected(this)==true){
            ChargerConnected=true;
            Log.i(Tag,"Charger is connected");
        }
        else {
            ChargerConnected=false;
            Log.i(Tag,"Charger is not connected");

        }
        return START_STICKY;
    }
}
