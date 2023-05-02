import java.util.Iterator;
import java.util.List;
public class FindGuitarTester {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();
    initializeInventory(inventory);
    GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
    List < Guitar > guitarsList = inventory.search(whatErinLikes);

    if (!guitarsList.isEmpty()) {
      System.out.println("Erin you might like these guitars ");;

      for (Iterator < Guitar > i = guitarsList.iterator(); i.hasNext();) {
        Guitar guitar = (Guitar) i.next();
        GuitarSpec guitarSpec = guitar.getSpec();

        System.out.println(" " + guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " + guitarSpec.getType() + " guitar:\n " +
          guitarSpec.getBackWood() + " back and sides,\n " + guitarSpec.getTopWood() + "top.\nYou can have it for only $ " + guitar.getPrice() + "!");

      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
  }

  private static void initializeInventory(Inventory inventory) {
    GuitarSpec db1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

    inventory.addGuitar("V95693", 1499.5, db1);

    GuitarSpec db2 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

    inventory.addGuitar("V95695", 1466.5, db2);

  }
}