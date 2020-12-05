import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> rowStrings = new ArrayList<String>();
        rowStrings.add("row 1");
        rowStrings.add("row 2");

        ArrayList<String> colStrings = new ArrayList<>();
        colStrings.add("col 1");

        String label = "123";

        try {
            JAXBContext context = JAXBContext.newInstance(Radio.class);
            Marshaller marshaller = context.createMarshaller();

            ArrayList<Row> rows = new ArrayList<>();
            for (int i = 0; i < rowStrings.size(); ++i){
                rows.add(new Row("r"+(i+1),rowStrings.get(i)));
            }

            ArrayList<Col> cols = new ArrayList<>();
            for (int i = 0; i < colStrings.size(); ++i){
                cols.add(new Col("c"+(i+1),colStrings.get(i)));
            }
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(new Radio("tex123t", rows, cols, label), new File("radio.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
