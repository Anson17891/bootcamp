public class DemoFurnitureSystem {

  //! Pros of Factory Pattern:
  //1. When have new type of furniture, no need to revise the existing class 
  //-> open close coding pattern
  //2. main logic can be de-coupled (line 12,13)
  //3. Attribute -> Class
  public static void main(String[] args) {
    Furniture.Style style = Furniture.Style.MORDERN;
    int furnitureType = 1; //1=chair 2=Sofa

    FurnitureFactory factory = FurnitureFactory.create(style);//->MordernFactory
    Furniture furniture = Furniture.create(furnitureType, factory);//->Type of furniture
    System.out.println(furniture.hasLegs());
  }
}
