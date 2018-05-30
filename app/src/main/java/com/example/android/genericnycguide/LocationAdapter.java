package com.example.android.genericnycguide;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    // had to change context to Activity
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // hacking super
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Location location = getItem(position);

        // setting location content
        ImageView imageView = convertView.findViewById(R.id.list_item_image);
        imageView.setImageResource(location.getImageResourceID());

        TextView textView = convertView.findViewById(R.id.list_item_text);
        textView.setText(location.getName());

        convertView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getContext(), FullLocationActivity.class);

                intent.putExtra("name",location.getName());
                intent.putExtra("imageResourceID",location.getImageResourceID());
                intent.putExtra("address",location.getAddress());
                intent.putExtra("description",location.getDescription());
                intent.putExtra("locationType",location.getLocationType());

                if(location.hasTime()){
                    intent.putExtra("time",location.getTime());
                }

                getContext().startActivity(intent);
            }
        });

        return convertView;
    }
}
