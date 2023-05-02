public class Guitar {
    // These are all the
    // properties we saw from
    // the class diagram for
    // the Guitar class.
    private String serialNumber;
    private double price;
    public GuitarSpec spec;
  
    public Guitar(String serialNumber, double price, GuitarSpec gSpec) {
      this.spec = new GuitarSpec(gSpec);
      this.serialNumber = serialNumber;
      this.price = price;
  
    }
  
    public String getSerialNumber() {
      return serialNumber;
  
    }
  
    public double getPrice() {
      return price;
    }
  
    public void setPrice(double newPrice) {
      this.price = newPrice;
    }
  
    public GuitarSpec getSpec() {
  
      return this.spec;
    }
  
  }