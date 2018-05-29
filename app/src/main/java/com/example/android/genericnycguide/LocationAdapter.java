package com.example.android.genericnycguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location location = getItem(position);

        // setting background image
        RelativeLayout relativeLayout = convertView.findViewById(R.id.list_item_container);
        relativeLayout.setBackgroundResource(R.drawable.output);
//        relativeLayout.setBackgroundResource(location.getImageResourceID());

        TextView textView = convertView.findViewById(R.id.list_item_text);
        textView.setText("soemthing else");
//        textView.setText(location.getName());

        return convertView;
    }
}
