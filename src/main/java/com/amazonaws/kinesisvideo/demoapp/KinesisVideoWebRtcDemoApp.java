package com.amazonaws.kinesisvideo.demoapp;

import android.app.Application;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;

public class KinesisVideoWebRtcDemoApp extends Application {
    private static final AWSCredentials CREDENTIALS = new BasicAWSCredentials("YOUR ACCESS KEY ID", "YOUR ACCESS KEY SECRET");
    // If you want to use session token
    // private static final AWSCredentials CREDENTIALS = new BasicSessionCredentials("YOUR ACCESS KEY ID", "YOUR ACCESS KEY SECRET", "YOUR SESSION TOKEN");
    private static final StaticCredentialsProvider CREDENTIALS_PROVIDER = new StaticCredentialsProvider(CREDENTIALS);

    public static AWSCredentialsProvider getCredentialsProvider() {
        return CREDENTIALS_PROVIDER;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
