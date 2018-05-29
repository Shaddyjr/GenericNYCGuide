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
public class EventsFragment extends Fragment {
    final ArrayList<Location> locations = new ArrayList<>();

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        locations.add(new Location("Free Kayaking at Brooklyn Bridge Park","Pier 2, Brooklyn Bridge Park","Welcome warmer weather with a free kayaking session on the East River and explore your wet and wild side.","Jun 02, 10:00 AM — Aug 26, 3:00 PM","event",R.drawable.output));
        locations.add(new Location("Party Like It’s 1999: The Summer #1s of the 90s Edition","The Bell House","Get down to the hottest songs of the 1990s, with “Waterfalls,” “Baby Got Back,” “Genie in a Bottle,” “California Love,” and more keeping the good times going all night long.","Jun 02, 10:00 PM — Jun 03, 1:00 AM","event",R.drawable.output));
        locations.add(new Location("Discovery Day at Freshkills Park","Freshkills Park","Staten Island's Freshkills Park is still being developed, but you can check out its progress with a full day of activities that include photography, bicycling, kite-flying, tours, and more.","June 03, 11:00 AM — 4:00 PM","event",R.drawable.output));
        locations.add(new Location("Museum Mile Festival","Fifth Ave between 82nd and 105th streets","For three hours, seven of the city’s museums along Fifth Avenue will open their doors for New Yorkers to get cultured without spending a dime.","June 12, 6:00 PM — 9:00 PM","event",R.drawable.output));
        locations.add(new Location("Pitbull at GMA’s Summer Concert Series","Rumsey Playfield","See Mr. Worldwide in the heart of NYC before you even go to work and prepare to shake what your mama gave you.","June 15, 7:00 AM — 9:00 AM","event",R.drawable.output));
        locations.add(new Location("The 36th Annual Mermaid Parade","Coney Island","Mermaids will take over the streets of Coney Island for the 35th year of the country’s largest art parade. Start planning your under-the-sea outfits now","June 16, 1:00 PM — 5:00 PM","event",R.drawable.output));
        locations.add(new Location("Egg Rolls, Egg Creams & Empanadas Festival","Museum at Eldridge Street","Head to this free multicultural fest that celebrates Jewish, Chinese, and Puerto Rican culture with a day of food and street performances.","June 17, 12:00 PM — 4:00 PM","event",R.drawable.output));
        locations.add(new Location("Bryant Park Yoga with Dan Nevins","The Lawn","Get your zen on in the heart of Midtown at an hour-long yoga class presented by KeVita.","June 21, 6:00 PM — 7:00 PM","event",R.drawable.output));
        locations.add(new Location("FIGMENT NYC","Colonels Row","Take your imagination and hop aboard the ferry to Governor’s Island for a weekend of collaborative art projects that are all free.","Jun 23, 10:00 AM — Jun 24, 6:00 PM","event",R.drawable.output));
        locations.add(new Location("PrideFest","University Place between 13th Street & Waverly Place","Help celebrate the 25th anniversary of this epic LGBT street festival that features performances, vendors, and tons of activities all in honor of love and equality.","June 24, 11:00 AM — 6:00 PM","event",R.drawable.output));
        locations.add(new Location("Titanic: Free Screening at Brooklyn Bazaar","Brooklyn Bazaar","Fall in love with Leonardo DiCaprio and Kate Winslet all over again as you watch this 1997 classic in Brooklyn Bazaar's Main Ballroom. Seating is first come, first served, so arrive early!","June 27, 8:00 PM — 11:00 PM","event",R.drawable.output));
        locations.add(new Location("Nathan’s Famous 2018 Hot Dog Eating Contest","Nathan's Famous, Coney Island","Why watch the meaty action on TV when you can see it in real life? Make the trip to Coney Island to see if defending champ Joey Chestnut can eat enough dogs to win yet another Mustard Belt.","July 04, 12:00 PM — 2:00 PM","event",R.drawable.output));
        locations.add(new Location("Backstreet Boys at GMA’s Summer Concert Series","Rumsey Playfield","Backstreet's Back, alright! And this time, they're in the heart of Central Park as the guys start your Friday off with a free show that will rock your body right.","July 13, 7:00 AM — 9:00 AM","event",R.drawable.output));
        locations.add(new Location("FAD Market: Summer Pop-up","The Invisible Dog Art Center","Browse the offerings from a rotation of 50 independent makers who will be showcasing their art, jewelry, apparel, bath and body care, tableware, and home furnishings.","July 14, 11:00 AM — 6:00 PM","event",R.drawable.output));
        locations.add(new Location("Shakespeare in the Park: Twelfth Night","The Delacorte Theater in Central Park","The popular Shakespeare in the Park series at Central Park’s Delacorte Theater continues with a production of Twelfth Night. Enter the lottery for your chance to score free tix!","Jul 17, 8:00 PM — Aug 19, 10:00 PM","event",R.drawable.output));
        locations.add(new Location("NYC Tasting at Ten","Counter Culture Coffee New York Training Center","Get your morning caffeine boost for free when you swing by this tasting that features a different coffee and brewing method each week.","July 27, 10:00 AM — 11:00 AM","event",R.drawable.output));
        locations.add(new Location("Karaoke Happy Hour at Offside Tavern","Offside Tavern","Sing your heart out and snag a free shot if you're brave enough to sing with the DJ!","Aug 04, 9:30 PM — Aug 05, 4:00 AM","event",R.drawable.output));
        locations.add(new Location("Meditation on the High Line","On the High Line at 22nd St.","Kick off the day by focusing on your breath, high above the city's streets.","August 14, 8:00 AM — 9:00 AM","event",R.drawable.output));
        locations.add(new Location("Bar None Comedy Show","Bar None","Some of the city’s best talent will showcase their latest routines at this free comedy show—and drinks will be priced two-for-one during the performance.","August 19, 8:00 PM — 10:00 PM","event",R.drawable.output));
        locations.add(new Location("NYRR Open Run","Astoria Park","You could spend your Saturday sleeping in. Or, you could get up and join this fun run like a total baller. We encourage you to choose the latter!","August 25, 9:00 AM — 10:00 AM","event",R.drawable.output));
        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
