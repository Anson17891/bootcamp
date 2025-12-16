public interface Furniture {
  boolean hasLegs();

  public enum Style{
    MORDERN,VICTORIAN,;
  }

  public static Furniture create(int type, FurnitureFactory factory){ //can use enum instead
return switch(type){
  case 1 -> factory.createChair();
  case 2 -> factory.createSofa();
  default -> null;
};

}
}
