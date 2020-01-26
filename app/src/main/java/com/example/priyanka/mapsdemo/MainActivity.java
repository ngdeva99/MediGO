package com.example.priyanka.mapsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static ImageView imgview;
    private static Button button;
    ImageButton geoloc,chat,disease,sos;
    private int curent_img;
    Button b1,b2;
    int[] images = {R.drawable.one,R.drawable.two};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button)findViewById(R.id.details);
     //   b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.profile);
     //   b2.setOnClickListener(this);



        geoloc=(ImageButton)findViewById(R.id.geoloc);
        geoloc.setOnClickListener(this);

        chat=(ImageButton)findViewById(R.id.chat);
        chat.setOnClickListener(this);

        disease=(ImageButton)findViewById(R.id.disease);
        disease.setOnClickListener(this);

        sos=(ImageButton)findViewById(R.id.SOS);
        sos.setOnClickListener(this);


        // butonclick();
    }

    public void setDetails(View V)

    {
        b1.setBackgroundColor(Color.rgb(255,255,255));
        b2.setBackgroundColor(Color.rgb(59,120,206));

        b1.setTextColor(Color.rgb(59,120,206));
        b2.setTextColor(Color.rgb(255,255,255));

        imgview = (ImageView) findViewById(R.id.image_place);
        imgview.setImageResource(R.drawable.about2);
    }

    public void setAbout(View V)
    {
        b2.setBackgroundColor(Color.rgb(255,255,255));
        b1.setBackgroundColor(Color.rgb(59,120,206));

        b2.setTextColor(Color.rgb(59,120,206));
        b1.setTextColor(Color.rgb(255,255,255));

        imgview = (ImageView) findViewById(R.id.image_place);
        imgview.setImageResource(R.drawable.details);

    }

    @Override
    public void onBackPressed() {
        //finish();
        startActivity(new Intent(this,MainActivity.class));
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.geoloc){
            startActivity(new Intent(this,MapsActivity.class));
        }

        if(v.getId()==R.id.chat){
            startActivity(new Intent(this,Chatbot.class));
        }

        if(v.getId()==R.id.disease){
            startActivity(new Intent(this,diseasepredictor.class));
        }

        if(v.getId()==R.id.SOS){
            //Youtube code

            //linking one app to another

            Intent i = getPackageManager().getLaunchIntentForPackage("com.quickblox.sample.videochat.java");
            startActivity(i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.merchant_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.merchant_toolbar_logout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, Main3Activity.class));
        }

        return false;
    }





}
