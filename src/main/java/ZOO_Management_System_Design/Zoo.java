package ZOO_Management_System_Design;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList<>();
    }

    public List<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(List<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}
