package legoset;

import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        var legoset = new LegoSet();
        legoset.setNumber("75211");
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setPackaging(LegoSet.Packaging.BOX);
        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));

        var minifigs = new ArrayList<Minifig>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
        legoset.setMinifigs(minifigs);

        legoset.setRatings(new Ratings(468, 4.4));

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));

    }

}
