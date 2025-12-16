public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();

  public static FurnitureFactory create(Furniture.Style style){
      FurnitureFactory factory = switch(style){
      case MORDERN -> new MordernFurnitureFactory();
      case VICTORIAN -> new VictorianFurnitureFactory();
    };
    return factory;
  }
}
