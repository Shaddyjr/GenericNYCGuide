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
public class ShopsFragment extends Fragment {
    final ArrayList<Location> locations = new ArrayList<>();

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        Resources res = getResources();
        locations.add(new Location(res.getStringArray(R.array.Store), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Bing), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Veneta), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Hatch), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Gavriel), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Konekt), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.RealReal), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Sézane), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Totokaelo), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Upton), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.AllSaints), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Century), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Supreme), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Webster), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Alumnae), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Boutique), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Connexion), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Intimissimi), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Krewe), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Pretty), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Lou), getString(R.string.shop),R.drawable.output));
        locations.add(new Location(res.getStringArray(R.array.Balenciaga), getString(R.string.shop),R.drawable.output));
        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
