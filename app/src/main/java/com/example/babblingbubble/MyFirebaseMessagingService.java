package com.example.babblingbubble;

/*
Copyright (C) 2019 Vedant K

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.

*/

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Random;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MessagingService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.w(TAG, "Received Notification Title - " + remoteMessage.getNotification().getTitle());
        Log.w(TAG, "Received Notification Body-" + remoteMessage.getNotification().getBody());

        if (!remoteMessage.getNotification().getTitle().contains(FirebaseAuth.getInstance().getCurrentUser().getDisplayName())) {

            int notificationId = new Random().nextInt(3000);

            Intent intent = new Intent(this, ChatActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
                    PendingIntent.FLAG_ONE_SHOT);

            String channelId = getString(R.string.default_notification_channel_id);
            Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            NotificationCompat.Builder notificationBuilder =
                    new NotificationCompat.Builder(this, channelId)
                            .setSmallIcon(R.drawable.chat)
                            .setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent))
                            .setColorized(true)
                            .setContentTitle(remoteMessage.getNotification().getTitle())
                            .setContentText(remoteMessage.getNotification().getBody())
                            .setAutoCancel(true)
                            .setSound(defaultSoundUri)
                            .setContentIntent(pendingIntent);

            NotificationManager notificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

            // Since android Oreo notification channel is needed.
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel(channelId,
                        "Babbling Bubble",
                        NotificationManager.IMPORTANCE_DEFAULT);
                notificationManager.createNotificationChannel(channel);
            }

            notificationManager.notify(notificationId, notificationBuilder.build());

        } else {
            // Do nothing, or else you will be sending self-notifications
        }

    }

    /*@Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        String notificationTitle = "";
        String notificationBody = "";

        sendNotification("YAY BRO", "YAY");

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Log.w(TAG, "MESSAGE NOTIFICATION BODY NOW NOW -  " + remoteMessage.getNotification().getBody());
            notificationTitle = remoteMessage.getNotification().getTitle();
            notificationBody = remoteMessage.getNotification().getBody();
        }

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
        sendNotification(notificationTitle, notificationBody);

    }


    private void sendNotification(String notificationTitle, String notificationBody) {

        Intent intent = new Intent(this, ChatActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setAutoCancel(true)
                .setSmallIcon(R.mipmap.chat)
                .setContentIntent(pendingIntent)
                .setContentTitle(notificationTitle)
                .setContentText(notificationBody)
                .setSound(defaultSoundUri);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // Since android Oreo notification channel is needed.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("Babbling Bubble",
                    "Babbling Bubble",
                    NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }

        notificationManager.notify(new Random().nextInt(3000), notificationBuilder.build());

    }*/
}
