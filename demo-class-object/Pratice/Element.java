public class Element {
  private String name;
  private double density;
  private double boilingPoint;
  private double meltingPoint;
  private byte group;

  public Element(){
    this.name = "Unknown";
    this.density = 0;
    this.boilingPoint = 0;
    this.meltingPoint = 0;
    this.group = 0;
  }

public static void main(String[] args) {
    Element H = new Element();
    H.name = "Hydrogen";
    H.density = 0.082;
    H.boilingPoint = -252.879;
    H.meltingPoint = -259.16;
    H.group = 1;

    Element Na = new Element();
    Na.name = "Sodium";
    Na.density = 971;
    Na.boilingPoint = 883;
    Na.meltingPoint = 207.9;
    Na.group = 1;

    Element Hg = new Element();
    Hg.name = "Mercury";
    Hg.density = 13534;
    Hg.boilingPoint = 356.73;
    Hg.meltingPoint = -38.83;
    Hg.group = 12;

    Element[] elements = new Element[]{H, Na, Hg};

      for (Element element : elements) {
          System.out.println(element.name);
          System.out.println(floatOnWater(element.density, element.group));
          System.out.println(findPhase(element.meltingPoint, element.boilingPoint, 25.0));
      }

}

public static String floatOnWater (double density, byte group) {
    double densityWater = 1000;
    if(group != 1){
      if(density < densityWater){
        return "It floats on Water!";
    }else{
        return "It sinks in water.";
      }
    }else{
      return "Don't try it at home!!" ;
    }
  }

    public static char findPhase (double meltingPoint, double boilingPoint, double temp){
      if(meltingPoint > temp){
        return 'S';
      }else if (boilingPoint > temp){
        return 'L';
      }else {
        return 'G';
      }
    }


  }


