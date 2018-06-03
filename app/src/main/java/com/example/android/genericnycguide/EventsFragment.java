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
public class EventsFragment extends Fragment {
    final ArrayList<Location> locations = new ArrayList<>();

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        Resources res = getResources();
        locations.add(new Location(res.getStringArray(R.array.Free),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Party),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Discovery),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Museum),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Pitbull),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.The),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Egg),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Bryant),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.FIGMENT),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.PrideFest),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Titanic),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Nathans),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Backstreet),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.FAD),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Shakespeare),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.NYC),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Karaoke),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Meditation),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Bar),getString(R.string.event),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.NYRR),getString(R.string.event),R.drawable.output));
        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
