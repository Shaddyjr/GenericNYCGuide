package com.example.android.genericnycguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FullLocationActivity extends AppCompatActivity {

    Intent mIntent;

    ImageView image;

    TextView
            name,
            address,
            time,
            description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_location);

        // getting data
        mIntent = getIntent();
        String location_name = mIntent.getStringExtra("name");
        int location_imageResourceID = mIntent.getIntExtra("imageResourceID", -1);
        String location_address = mIntent.getStringExtra("address");
        String location_description = mIntent.getStringExtra("description");
        String location_locationType = mIntent.getStringExtra("locationType");

        String location_time = null;
        if(getIntent().hasExtra("time")){
            location_time = mIntent.getStringExtra("time");
        }

        // setting up xml elements
        image       = findViewById(R.id.image);
        name        = findViewById(R.id.name);
        address     = findViewById(R.id.address);
        time        = findViewById(R.id.time);
        description = findViewById(R.id.description);

        // adding content
        image.setImageResource(location_imageResourceID);
        name.setText(location_name);
        address.setText(String.format(getResources().getString(R.string.address), location_address));
        description.setText(String.format(getResources().getString(R.string.description), location_description));
        this.setTitle(location_locationType.toUpperCase());

        if(location_time!=null){
            time.setText(String.format(getResources().getString(R.string.time), location_time));
        }else{
            time.setVisibility(View.GONE);
        }
    }

}
