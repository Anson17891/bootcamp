public class MordernChair implements Chair{
  @Override
public boolean hasLegs(){
  System.out.println("am Mordern Chair, hasLegs().");
  return false;
}

@Override
public boolean sitOn(){
  return false;
}
}
