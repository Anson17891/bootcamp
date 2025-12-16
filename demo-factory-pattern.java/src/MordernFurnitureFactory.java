public class MordernFurnitureFactory implements FurnitureFactory{
  @Override
  public Chair createChair(){
  return new MordernChair();
  }

  @Override
  public Sofa createSofa(){
  return new MordernSofa();
  }
}
