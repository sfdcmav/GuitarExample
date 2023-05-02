import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

  private List < Guitar > guitars;

  public Inventory() {
    guitars = new LinkedList < Guitar > ();
  }

  public void addGuitar(String serialNumber, double price, GuitarSpec gSpec) {
    Guitar guitar = new Guitar(serialNumber, price, gSpec);
    guitars.add(guitar);
  }

  public Guitar getGuitar(String serialNumber) {
    for (Iterator < Guitar > i = guitars.iterator(); i.hasNext();) {
      Guitar guitar = (Guitar) i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  public List < Guitar > search(GuitarSpec searchSpec) {
    List < Guitar > guitarList = new LinkedList < Guitar > ();

    for (Iterator < Guitar > i = guitars.iterator(); i.hasNext();) {
      Guitar guitar = (Guitar) i.next();
      if (guitar.getSpec().matches(searchSpec))
        guitarList.add(guitar);

    }
    return guitarList;
  }

}