package legoset;

import java.util.List;
import java.time.Year;
import java.util.Set;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import jakarta.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "packaging", "tags", "minifigs", "ratings"})
@Data
public class LegoSet {

    public enum Packaging{
        BOX,
        POLYBAG
    }
    private Packaging packaging;
    private int pieces;
    private String name;
    private String theme;
    private String subtheme;
    private Ratings ratings;

    @XmlAttribute
    private String number;

    @XmlAttribute
    private String url;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

}
