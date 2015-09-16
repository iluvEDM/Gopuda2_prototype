package com.example.kangingu.testapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by kangingu on 15. 9. 2..
 */
public class OnLockBroadcastReceiver extends BroadcastReceiver{
    private static boolean SCREEN_OFF;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            SCREEN_OFF = true;

            Intent changeIntent = new Intent(context,MainActivity.class);

        }
    }
}
