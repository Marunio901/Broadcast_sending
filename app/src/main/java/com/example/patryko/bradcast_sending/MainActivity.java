package com.example.patryko.bradcast_sending;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RemoteViews;

public class MainActivity extends Activity {

   EditText et_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_message = (EditText)findViewById(R.id.ed_message);

    }

    public void sendOutBroadcoast(View view){

        Intent intent = new Intent();
        intent.setAction("com.example.patryko.bradcast_sending.MY_CUSTOM_INTENT");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        String message = et_message.getText().toString();
        intent.putExtra("Message",message);
        sendBroadcast(intent);

    }
}
