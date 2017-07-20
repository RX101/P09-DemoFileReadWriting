package com.example.a15041867.p09_demofilereadwriting;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

public class MyService extends Service {
    boolean started;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Service","Created");
    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        if(started == false){
            started = true;
            Log.d("Service", "Started");
        }else{
            Log.d("Service","Still running");
        }
        return Service.START_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service","Exited");

    }

}
