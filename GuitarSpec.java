public class GuitarSpec {

    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private String model;
    private int numStrings;
  
    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
  
      this.builder = builder;
      this.model = model;
      this.type = type;
      this.backWood = backWood;
      this.topWood = topWood;
      this.numStrings = numStrings;
    }
  
    public GuitarSpec(GuitarSpec gSpec) {
      this.builder = gSpec.builder;
      this.model = gSpec.model;
      this.type = gSpec.type;
      this.backWood = gSpec.backWood;
      this.topWood = gSpec.topWood;
      this.numStrings = gSpec.numStrings;
    }
  
    public boolean matches(GuitarSpec otherSpec) {
      if (builder != otherSpec.builder)
        return false;
      if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
        return false;
      if (type != otherSpec.type)
        return false;
      if (numStrings != otherSpec.numStrings)
        return false;
      if (backWood != otherSpec.backWood)
        return false;
      if (topWood != otherSpec.topWood)
        return false;
      return true;
    }
  
    public String getBuilder() {
      return builder.toString();
    }
    public String getModel() {
      return model;
    }
    public String getType() {
      return type.toString();
    }
    public String getBackWood() {
      return backWood.toString();
    }
    public String getTopWood() {
      return topWood.toString();
    }
    public int getNumStrings() {
      return numStrings;
    }
  
  }