package com.example.android.genericnycguide;


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

        locations.add(new Location("Amada","Brookfield Place, 250 Vesey St. Manhattan, NY, 10281","This tapas spot in Battery Park City comes courtesy of chef Jose Garces, who opened the restaurant’s first successful outpost in Philadelphia in 2005. Andalusian small plates (patatas bravas, lamb tartare, ham croquettes) headline the menu alongside house specialties like lobster paella and roasted suckling pig. Pair them with a Spanish wine, sangria or custom concoction from the gin-and-tonic bar.","food",R.drawable.output));
        locations.add(new Location("Augustine","5 Beekman St. Manhattan, NY, 10038","Keith McNally, the veteran restaurateur behind Minetta Tavern, Cherche Midi and Balthazar, knows what it takes to run a French brasserie in downtown Manhattan. Augustine, his latest venture, features vintage Parisian charm and a menu of impeccable French classics—Nicoise salad, duck à l’orange and steak frites among them.","food",R.drawable.output));
        locations.add(new Location("Cipriani Wall Street","55 Wall St. Manhattan, NY, 10005","This restaurant, a downtown outpost of an NYC Italian dining empire, makes its home behind the towering columns of the landmarked National City Bank Building, which dates back to 1841. The menu is populated with the likes of grilled branzino, veal Milanese and ricotta ravioli, all worthy fare for a sophisticated business lunch or celebratory dinner. ","food",R.drawable.output));
        locations.add(new Location("Cut by Wolfgang Puck","Four Seasons Hotel New York Downtown, enter at 99 Church St. Manhattan, NY, 10007","Behind its celebrity-chef name and swank location in the Four Seasons Hotel, Cut by Wolfgang Puck delivers where it matters most: on the menu. Enjoy modern, elegant steakhouse fare like grilled wagyu beef and roasted bone marrow, plus seafood and sashimi options, from the comfort of the dining room’s plush velvet seats.","food",R.drawable.output));
        locations.add(new Location("Delmonico’s Restaurant","56 Beaver St. Manhattan, NY, 10004","A meal at Delmonico’s has been a game changer since the steakhouse’s doors first opened in 1837. The restaurant invented dishes like chicken à la Keene (better known these days as à la king) and lobster Newberg, and still serves flawless versions along with other classics like whipped potatoes, creamed spinach and, naturally, steak. ","food",R.drawable.output));
        locations.add(new Location("Nobu Downtown","195 Broadway Manhattan, NY, 10007","After a recent relocation from Tribeca to the Financial District, Nobu remains a flagship of Japanese fine dining in the City. Sample “Nobu Classics” (rock shrimp tempura, black cod with miso) and “Nobu Now” (scallops with jalapeño salsa, uni yaki) under the dining room’s dramatic canopy ceiling.","food",R.drawable.output));
        locations.add(new Location("One Dine","One World Trade Center, 285 Fulton St., 101st fl. Manhattan, NY, 10007","Plenty of NYC restaurants offer impressive views, but One Dine—situated on the 101st floor of One World Observatory—may take the prize for its unparalleled panorama. The sky-high bistro is a picturesque spot to enjoy a crispy chicken sandwich, Long Island duck or the OWO burger.  ","food",R.drawable.output));
        locations.add(new Location("Osteria della Pace","4 World Trade Center, 101 Liberty St., 3rd fl. Manhattan, NY, 10007","Colorful ceramic plates line the teal walls of this Southern Italian restaurant, located in Eataly NYC Downtown. Try the house-made taglietelle, oven-roasted sea bream or roast lamb loin with pomegranate reduction. ","food",R.drawable.output));
        locations.add(new Location("Schilling","109 Washington St. Manhattan, NY, 10006","This all-day bistro from Michelin-starred chef Eduard Frauneder specializes in Austrian fare with a Mediterranean twist. For example: wiener schnitzel is paired with cucumber salad and risotto comes with bass, chorizo and cockles. Inventive cocktails like the Ciao! Vienna (grappa, Disaronno and passionfruit) and Oaxaca smash (mezcal, vermouth, citrus and ginger) add to the appeal of the airy restaurant’s stylish back bar. ","food",R.drawable.output));
        locations.add(new Location("Temple Court","5 Beekman St. Manhattan, NY, 10038","Celebrity chef Tom Colicchio’s newest establishment takes its name from the landmarked Temple Court building it occupies. The building, now home to the Beekman Hotel, retains some of its striking original finishes. Chef Bryan Hunt creates reinvigorated classics like chopped steak with hen-of-the-woods mushrooms, blue cheese and watercress; rabbit schnitzel with garlic confit; and diver scallops with leeks and black truffle vinaigrette.","food",R.drawable.output));

        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
