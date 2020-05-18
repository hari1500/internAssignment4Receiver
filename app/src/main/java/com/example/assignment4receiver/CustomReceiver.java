package com.example.assignment4receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    public static final String intentAction = "com.assignment4.ACTION_SEND_MESS";
    public static final String messageKey = "com.assignment4.ACTION_SEND_MESS.MESS";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "onReceive", Toast.LENGTH_LONG).show();
        if (intentAction.equals(intent.getAction())) {
            String receivedMessage = intent.getStringExtra(messageKey);
            Toast.makeText(context, receivedMessage, Toast.LENGTH_LONG).show();
        }
    }
}
