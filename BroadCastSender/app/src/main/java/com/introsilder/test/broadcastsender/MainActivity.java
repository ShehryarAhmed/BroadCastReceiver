package com.introsilder.test.broadcastsender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button senderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);
        senderBtn = (Button) findViewById(R.id.btn_broad_cast);
        senderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.codinginflow.EXAMPLE_ACTION");
                intent.putExtra("com.codinginflow.EXTRA_TEXT","Broadcast received");
                sendBroadcast(intent);
            }
        });

    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String receivedText = intent.getStringExtra("com.codinginflow.EXTRA_TEXT");
            textView.setText(receivedText);
        }
    };


    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter("com.codinginflow.EXAMPLE_ACTION");
        registerReceiver(receiver, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(receiver);
    }
}
