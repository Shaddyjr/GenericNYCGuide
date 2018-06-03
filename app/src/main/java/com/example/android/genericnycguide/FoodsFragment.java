package com.example.android.genericnycguide;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodsFragment extends Fragment {
    final ArrayList<Location> locations = new ArrayList<>();

    public FoodsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        Resources res = getResources();
        locations.add(new Location(res.getStringArray(R.array.Amada),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Augustine),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Cipriani),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Cut),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Delmonicos),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Nobu),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.One),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Osteria),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Schilling),getString(R.string.food),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Temple),getString(R.string.food),R.drawable.output));

        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
