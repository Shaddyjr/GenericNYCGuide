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
public class ShopsFragment extends Fragment {
    final ArrayList<Location> locations = new ArrayList<>();

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        locations.add(new Location("180 The Store","180 Duane St., Tribeca, Manhattan ","It’s difficult to put a label on what 180 The Store actually is. It bills itself as a “unique retail environment” where different brands come to host pop-up shops, presentations, installations and events. The offerings here are so varied, in fact, patrons can come in to shop for clothing, housewares, jewelry, beauty products and some leafy plants or succulents—all from one store. It’s sort of a small-scale, independent department store, which is what the owners were going for. Also worth noting: they promote young, up-and-coming talent who are new to the NYC scene.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Anine Bing","81 Greene St., Soho, Manhattan","Unlike its sister store on Bleecker Street, which is solely dedicated to black, white and gray neutral tones, the Soho Anine Bing shop introduces pops of color via the shoes and accessories lining its metal shelves. The brand calls itself a “fusion between Scandinavian heritage and American spirit” and includes everything from delicate silk camisoles and lingerie to motorcycle chic styles like leather biker jackets, ripped jeans and military jackets. The line also features shoes, jewelry and other accessories.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Bottega Veneta","740 Madison Ave., Midtown East, Manhattan","Bottega Veneta’s New York City flagship store takes up three landmark 19th-century townhouses, covering five floors and nearly 15,000 square feet, and is appropriately known as “Maison.” Throughout floors one to four, expect to find the brand’s signature leather pieces, ready-to-wear, shoes, jewelry and accessories. Expect exclusive city-inspired accessories that you won’t find at the brand’s other locations. The fifth floor—known as “The Apartment”—is dedicated to Bottega Veneta’s home and furniture collection and has the feel of a private home, with rotating artwork for decor.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Hatch","17 Bleecker St., Noho, Manhattan","Hatch is more than just maternity clothing; it’s maternity fashion. Founded in 2011 by Ariane Goldman who, after working on Wall Street, saw a void in this area of women’s wear. The brand focuses on clothing for “before, during and after” pregnancy, helping moms to navigate the fashion world with their changing bodies. In addition to selling their popular clothing and accessories, the Noho store prides themselves on being very community-driven, hosting events like a Mother’s Day celebration, chats with experts and inspiring panel discussions.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Mansur Gavriel","620 Madison Ave., Midtown East, Manhattan","It’s hard to miss a Mansur Gavriel store—all of them clad in bubblegum pink from top to bottom. And this Midtown East location is no exception. The airy shop, with high ceilings and large, light-filled windows, looks extremely inviting on its Midtown corner. Inside, shoppers will find a neatly organized selection of the Italian company’s ready-to-wear clothing, shoes, bags and other accessories for women, all courtesy of owners Rachel Mansur and Floriana Gavriel, who founded the brand in 2012.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Konekt","41 Elizabeth St., Chinatown","The furniture pieces at Konekt are so stunning they resemble works of art. The company prides itself on taking a modern approach to building while maintaining centuries-old techniques to ensure the highest quality products. Konekt—which was founded by a mother and daughter in 2015—uses natural materials to produce furniture that engages the senses, and embodies all the imperfections and beauty that nature intended. Each piece is made to order by craftsmen and artisans working in Pennsylvania.", "shop",R.drawable.nyc_1));
        locations.add(new Location("The RealReal","80 Wooster St., Soho","Luxury comes at a price that can be prohibitive. If your pockets are not as deep as your high-end tastes, you may be The RealReal’s target customer. This Soho shop is the brick-and-mortar manifestation of its namesake e-retailer’s highly successful online shop, which sells secondhand luxury items including jewelry, clothes, handbags, accessories, furniture and art. You can find premium brands from A.P.C. to Zac Posen, and on-staff authenticators ensure that what you see is what you get. While listings are more affordable than the original price, this still doesn’t qualify as bargain shopping.  ", "shop",R.drawable.nyc_1));
        locations.add(new Location("Sézane","254 Elizabeth., Nolita","Parisian brand Sézane is known for its chic, affordable clothing and accessories, and now NYC is lucky enough to have the first US outpost of this beloved company. The artfully designed NoLIta store carries all the fashion fans love, including women’s clothing, shoes, jewelry and accessories. There are also home goods on hand, such as coffee-table books and decorative candles. And the warmth and welcoming vibe of the store extends to the gracious service offered by the staff.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Totokaelo","190 Bowery., Nolita","The architecture and design of Totokaelo’s new NYC store are striking. Located in a former turn-of-the-century bank building with vaulted dressing rooms, its large arched windows and abundant natural light make for a lovely shopping experience. And the multilevel space means there’s plenty of menswear and women’s clothing to choose from. The store carries brands such as Jill Sander, Rachel Comey, Issey Miyake, Calvin Klein and Acme. Customer service is also a priority here, and the thoughtful layout means you’ll never encounter huge crowds.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Upton","224 Mulberry St., Nolita","High-end leather goods maker Upton is known for belts—made in Texas from American leather tanned in Italy—and other small leather items. Their belts are handmade and numbered, offering a most luxurious and personalized shopping experience for those who can afford it. Though they are typically an online presence, they opened this NoLIta pop-up shop in order to give customers a face-to-face experience, and also to collaborate with other brands every few weeks to offer up a different selection of goods in what they call The Collective.", "shop",R.drawable.nyc_1));
        locations.add(new Location("AllSaints","636 Fifth Ave., Midtown, Manhattan","British fashion retailer AllSaints is known for its biker jackets, knits and premium leather goods, but you’ll find much more at its Rockefeller Center store—the newest of the import’s three Manhattan locations. Shop signature ready-to-wear lines for men and women along with jewelry and accessories, assisted by the stellar customer service for which the brand is known.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Next Century","21 Dey St., Lower Manhattan","The owners of mega department store Century 21 have opened Next Century adjacent to their downtown location, offering a carefully curated selection of clothing and accessories. The assortment of items from up-and-coming designers is aimed at the younger set—particularly millennials—who can also sort through back stock of established labels and vintage pieces (including finds from upscale brands like Fendi, Balenciaga and Dior). Take time out from shopping to pamper yourself at the in-house nail bar and matcha café. ", "shop",R.drawable.nyc_1));
        locations.add(new Location("Supreme","152 Grand St., Bedford-Stuyvesant, Brooklyn","A giant skate bowl dominates this skateboarding brand’s retail shop, where in addition to testing out your skills you can purchase boards, accessories, clothing, hats and shoes. Supreme offers its own line of merchandise but has partnered with brands like Hanes, Timberland and Polartec to bring customers affordable options. On the higher end of things, look for a capsule collection collaboration between Supreme and Louis Vuitton.", "shop",R.drawable.nyc_1));
        locations.add(new Location("The Webster","29 Greene St., Soho, Manhattan","Miami-based luxury boutique The Webster opened this Soho space—its fifth retail store—after building out a six-story cast-iron structure on Greene Street. The sparsely stocked but artistically designed shop carries women’s and men’s clothing and accessories from Alexander Wang, Givenchy, Eddie Borgo, Proenza Schouler, Gucci, Valentino, Stella McCartney and many others. Shoes, jewelry, children’s clothing, home furnishings, a shoe salon and a hair salon round out the list.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Alumnae","60 Hudson St., Tribeca, Manhattan​","The name Alumnae is a cheeky nod to the fact that co-founders Kari Sigerson and Eliza Axelson-Chidsey matriculated from women’s luxury shoe brand Sigerson Morrison, perhaps most famous for its gladiator sandal and Sex and the City appearances. This new line takes a step away from its predecessor by being more subdued. The shoes are well crafted, impeccably made and the designs lean classically cool—so much so that even when they get a bit a kooky, they remain tasteful.   ", "shop",R.drawable.nyc_1));
        locations.add(new Location("Dior Beauty Boutique","185 Greenwich St., Lower Manhattan, Manhattan","The beauty (pun intended) of this conceptual makeup boutique, the first from Dior in NYC, is its innovative approach to cosmetics. In a space meant to evoke the ambiance of backstage at a fashion show, shoppers can peruse an assortment of lipsticks, nail lacquers, mascaras and facial products. Also, there are six workstations staffed by pros, where visitors can have their lashes and brows transformed. There's a high-tech Mix & Match display, featuring a model whose lip and nail color will change just by placing the product on the tabletop. A small section is dedicated to fragrances, with Dior’s most recognized and coveted scents.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Faith Connexion","27 Mercer St., Soho, Manhattan","How to define the Faith Connexion brand, which defies conventional labels? Think punk—specifically of the art school variety—mixed with high-end runway fashion, ritzy glam rock and the downtown feel of every urbane “it” city from Berlin to Vancouver. This New York City shop is the local flagship store for the Paris-based label. The store itself has a fairly downplayed cool vibe, with minimal decorative distractions to take away from the clothes-as-centerpiece concept.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Intimissimi","601 Fifth Ave., Midtown, Manhattan","It’s no secret (wink) which company dominates the intimate apparel market in the US, but Intimissimi is out to change the game. The Italian label offers undergarments, swimwear and lingerie like its primary competitor, but often using more sumptuous materials and with an emphasis on classic elegance. Not to worry, though, the prices are fully compatible. And their spacious New York City flagship in Midtown is stocked with endless choices.   ", "shop",R.drawable.nyc_1));
        locations.add(new Location("Krewe","39 1/2 Crosby St., Soho, Manhattan","If eyes are the windows to the soul, then Krewe is where to pick up the best window dressings. This Soho shop is just the third permanent location opened by this New Orleans–based purveyor of stylish frames. The interior has a hushed beauty: bare white walls mixed with exposed brick, huge windows and potted foliage interspersed here and there. It’s worth mentioning that every unique design—collection names include Stella, Cool Cat and Shuck Yeah—is crafted from a plant-based acetate.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Spark Pretty","333 E. 9th St., East Village, Manhattan","Spark Pretty founder Amanda Dolan worked as a stylist for Betsey Johnson for several years, with some very obvious overlaps in the two fashion mavens’ stylistic visions. But Dolan also has her own outlook clearly reflected in her shop’s collection of vintage designs from around the world. The retro emphasis is on the 1980s and '90s, with popping colors and electro-vibrancy dominating the aesthetic feel. There’s also a collection of original designs created in-house with the same ultra-vivid flair. If this all sounds overwhelming, Dolan and her team are happy to offer advice to customers, and you can even schedule a one-on-one guided shopping experience.", "shop",R.drawable.nyc_1));
        locations.add(new Location("Alison Lou","20 East 69th St., Upper East Side, Manhattan​","Jewelry designer Alison Chemla is the creative director and designer behind this brand, which features contemporary fine jewelry that often includes the latest trends, such as emoticons and other pop-culture influences. Her designs include a large selection of smiley faces, rings with “Mrs.” spelled out on them (insert your own initial following) and simpler, more timeless designs. The cheeky, of-the-minute jewelry line is all presented inside a cozy, elegant and simply designed Upper East Side store. ", "shop",R.drawable.nyc_1));
        locations.add(new Location("Balenciaga","840 Madison Ave., Upper East Side, Manhattan","French luxury brand Balenciaga—known for its chic, ready-to-wear designer fashions for men and women—has opened a flagship Madison Avenue store, its third Manhattan shop (there are two in Soho). The 1,800-square-foot industrial space—made from concrete and glass, with the brand’s name stamped into the flooring—carries men’s and women’s clothing and accessories. Clothes hang from racks suspended in a ceiling that’s covered in foil, fitting rooms are covered in silicone and aluminum display tables are spread throughout, giving the space a minimalist, sleek aesthetic.", "shop",R.drawable.nyc_1));

        // setting up list adapter
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_items_container);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
