package com.example.just_scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_on_boarding_screen);
        addFragment(new Step.Builder().setTitle("Extract text from images using ML")
                .setContent("Recognize text in images with ML kit on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboard1) // int top drawable
                .setSummary("you can use ML kit to recognize text in images or video, such as text of street sign ")
                .build());
        addFragment(new Step.Builder().setTitle("Copy and Use the extracted text in seconds")
                .setContent("Recognize text in images with ML kit on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboard2) // int top drawable
                .setSummary("you can use ML kit to recognize text in images or video, such as text of street sign")
                .build());
        addFragment(new Step.Builder().setTitle("Extract text from images using ML")
                .setContent("Recognize text in images with ML kit on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboard1) // int top drawable
                .setSummary("you can use ML kit to recognize text in images or video, such as text of street sign")
                .build());
    }

    @Override
    public void finishTutorial() {
        // This method is called when the tutorial is finished.
        // You can add code here to navigate to the MainActivity.
        Intent intent = new Intent(OnBoardingScreen.this, MainActivity.class);
        startActivity(intent);

        // Finish the current activity to remove it from the back stack
        finish();
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}