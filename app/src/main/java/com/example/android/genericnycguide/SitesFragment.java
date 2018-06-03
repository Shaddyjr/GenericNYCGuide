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
public class SitesFragment extends Fragment {
    final ArrayList<Location> locations = new ArrayList<>();

    public SitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        Resources res = getResources();
        locations.add(new Location(res.getStringArray(R.array.FrauncesTavern),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.BowlingGreen),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.WallStreet),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.CastleClinton),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.SchermerhornRow),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.FederalHall),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.TrinityChurch),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.IndiaHouse),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.StockExchange),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.CustomHouse),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.InternationalBuilding),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.LibertyPlaza),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.NationalMonument),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.byGehry),getString(R.string.site),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.TradeCenter),getString(R.string.site),R.drawable.output));
        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
