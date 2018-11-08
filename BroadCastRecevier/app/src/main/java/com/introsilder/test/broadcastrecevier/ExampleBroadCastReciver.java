package com.introsilder.test.broadcastrecevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class ExampleBroadCastReciver extends BroadcastReceiver {
    private static final String TAG = "ExampleBroadCastReciver";
    @Override
    public void onReceive(Context context, Intent intent) {

        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context, "Boot Completed", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ACTION_BOOT_COMPLETED: run ");
        }

        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            Toast.makeText(context, "Connnected manager change", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "CONNECTIVITY_ACTION: run ");
        }

    }
}
