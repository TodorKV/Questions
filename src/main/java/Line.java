import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public abstract class Line {


    @XmlAttribute
    private String label;

    @XmlValue
    private String text;

    public Line(){

    }

    public Line(String label, String text) {
        this.label = label;
        this.text = text;
    }
}
