package edu.orangecoastcollege.cs273.treasuredlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TreasureActivity extends AppCompatActivity {

    //TODO (1): Add Firebase member variables (auth and user)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);



        //TODO (2): Initialize Firebase authentication
        //TODO (3): Initialize current user

        TextView welcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        //TODO (4): Set the text view's text to "Welcome " + user's email address

    }


    // TODO (5): Create a public void handleSignOut(View v) that signs out of Firebase authentication,
    // TODO (5): finishes this activity and starts a new Intent back to the LoginActivity.
}
