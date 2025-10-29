
//Ref: https://www.pref.yamanashi.jp/documents/24527/budou.pdf
public class Grape {
  private String species;
  private int brix;
  private double pH;
  private double weight;


  public Grape(String species, int brix, double pH, double weight){
    this.species = species;
    this.brix = brix;
    this.pH = pH;
    this.weight = weight;
  }

  public String getSpecies(){
    return this.species;
  }
  public int getBrix(){
    return this.brix;
  }
  public double getPH(){
    return this.pH;
  }
  public double getWeight(){
    return this.weight;
  }

  public void setSpecies(String species){
    this.species = species;
  }

  public void setBrix(int brix){
    this.brix = brix;
  }
  public void setpH(double pH){
    this.pH = pH;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  
  public static String findRipeness(String species, int brix, double pH){
    if("Delaware".equals(species)){
      if(brix >= 18 && pH >= 3.2){
        return "Excellent";
      }else if (brix >=17 && pH >= 3.2){
        return "Good";
      }else {return "Normal";}
    }return "Other species";
  }

    public static String findGradeOfWeight(String species, double weight){
      if("Delaware".equals(species)){
        if(weight >= 150){
          return "2L";
        }else if(weight >= 110){
          return "L";
        }else if(weight >= 75){
          return "M";
        }else if(weight >= 50){
          return "S";
        }return "Lower than standard";
      }return "Other species";
    }


    
}
