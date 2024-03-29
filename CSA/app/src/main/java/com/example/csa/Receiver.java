package com.example.csa;

import android.content.Context;
import android.content.Intent;
import com.parse.ParseAnalytics;
import com.parse.ParsePushBroadcastReceiver;

public class Receiver extends ParsePushBroadcastReceiver {

 @Override
 public void onPushOpen(Context context, Intent intent) {

  ParseAnalytics.trackAppOpenedInBackground(intent);
  // Anlik Bildirim acildiginda MainActivity'imizi baslatiyoruz.
  Intent i = new Intent(context, MainActivity.class);
  i.putExtras(intent.getExtras());
  i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
  context.startActivity(i);
 }
}