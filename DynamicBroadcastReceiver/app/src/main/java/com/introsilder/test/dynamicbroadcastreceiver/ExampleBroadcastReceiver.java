package com.introsilder.test.dynamicbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "ExampleBroadCastReciver";
    @Override
    public void onReceive(Context context, Intent intent) {

//        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
//            boolean noConnectivity = intent.getBooleanExtra(
//                    ConnectivityManager.EXTRA_NO_CONNECTIVITY, false
//            );
//            if(noConnectivity){
//                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
//            }else{
//                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
//
//            }
//        }

        if("com.codinginflow.EXAMPLE_ACTION".equals(intent.getAction())){

            String receviedText = intent.getStringExtra("com.codinginflow.EXTRA_TEXT");
            Toast.makeText(context, receviedText, Toast.LENGTH_SHORT).show();
        }

    }
}