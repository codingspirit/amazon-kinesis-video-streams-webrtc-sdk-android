# Amazon Kinesis Video Streams Android WebRTC SDK
[![Build Status](https://travis-ci.org/awslabs/amazon-kinesis-video-streams-webrtc-sdk-android.svg?branch=master)](https://travis-ci.org/awslabs/amazon-kinesis-video-streams-webrtc-sdk-android)
[![Coverage Status](https://codecov.io/gh/awslabs/amazon-kinesis-video-streams-webrtc-sdk-android/branch/master/graph/badge.svg)](https://codecov.io/gh/awslabs/amazon-kinesis-video-streams-webrtc-sdk-android)

## About

This repository aims to provide a sample to use AK/SK/STS with Amazon Kinesis Video Stream WebRTC SDK without Cognito.

## Running KinesisVideoWebRTCDempApp Sample with AK/SK/STS

### 1. Download the WebRTC SDK for Android

 To download the Kinesis Video Streams WebRTC SDK in Android, run the following command:

 `git clone https://github.com/codingspirit/amazon-kinesis-video-streams-webrtc-sdk-android.git`


### 2. Build and run the demo application using Android Studio

 1.  Import the downloaded SDK into the Android Studio integrated development environment by opening the **amazon-kinesis-video-streams-webrtc-sdkandroid/build.gradle** with `Open an existing Android Studio project`.
 2.  You will need to put your **access key id** and **access key secretKey** at [KinesisVideoWebRtcDemoApp.java](https://github.com/codingspirit/amazon-kinesis-video-streams-webrtc-sdk-android/blob/master/src/main/java/com/amazonaws/kinesisvideo/demoapp/KinesisVideoWebRtcDemoApp.java#L12).
 3.  Click gradle __Sync__ and __Build__
 4.  Run the demo application in simulator or in Android device (connected through USB).


### 3. Peer to Peer Streaming

  On your Android device, open AWSKinesisVideoWebRTCDemoApp and sign up with `Create New Account` or sign in with existing accounts.

Note: This account information is stored in your Cognito User Pool and is not your AWS Console user name/password.

Once login is successful, you will entering the following channel information to start peer to peer streaming.

  1. Enter a channel name: e.g. `demo-channel`
  2. Enter AWS region: e.g. `us-west-2`
  3. Select `audio` if you would like to send both audio or video data.
  4. Optionally, when using it in `viewer` mode, you can enter a unique `Client Id` . Client ID is required only if multiple viewers are connected to a channel. This helps channel's master identify respective viewers.

 To verify peer to peer streaming, do any of the following setup. In these setup, ensure that  the _signaling channel name_, _region_, _viewer ID_,  and the AWS account ID are the __same__.

  #### 3.1 Peer to Peer Streaming between two Android device: Master and Viewer

 *  Start one Android device in `master` mode for starting a new session. Remote peer will be joining as viewer to this master. There should be only one master for any given channel.
 *  Use another Android device to connect to the same channel name (started up in the step above as `master`)  in `viewer` mode; this will connect to an existing session (channel) where a master is connected.
  * Verify media showing up in both Android devices.

   #### 3.2 Peer to Peer Streaming between Embedded SDK as master and Android device as viewer

  * Run Kinesis Video Streams [WebRTC embedded SDK](https://github.com/awslabs/amazon-kinesis-video-streams-webrtc-sdk-c/tree/master/samples) in `master` mode on a camera device.
  * Start the Android device in `viewer` mode - you should be able to check the video (and audio if selected both in embedded SDK) showing up in the Android device from the camera.
  * Verify media showing up from the Embedded SDK to the Android.

  #### 3.3 Peer to Peer Streaming between Android device as master and Web browser as viewer

  * Start one Android device in `master` mode for starting a new session.
  * Start the web browser using the [Javascript SDK](https://github.com/awslabs/amazon-kinesis-video-streams-webrtc-sdk-js) and start it as `viewer`.
  * Verify media showing up from the Android device to the browser.

## License

This library is licensed under the [Apache 2.0 License](https://github.com/awslabs/amazon-kinesis-video-streams-webrtc-sdk-android/blob/master/LICENSE).
