import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Radio {

    @XmlAttribute
    private String label;

    private String a;
    private List<Row> row;
    private List<Col> col;
    public Radio() {

    }
    public Radio(String a, List<Row> row, List<Col> col, String label) {
        setLabel(label);
        this.a = a;
        this.row = row;
        this.col = col;
    }

    public void setLabel(String label) {
        if(label.charAt(0) - '0' >= 0 && label.charAt(0) - '0' <= 9)
            this.label = "Q" + label;
        else
            this.label = label;
    }
}
