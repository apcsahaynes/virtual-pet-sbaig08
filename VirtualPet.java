public class VirtualPet {
  private String name;
  private int energy;
  private int weight;
  private int happiness;
  private int ageMonths;
  private int ageYears;

  public VirtualPet(String name){
    this.name = name;
    this.energy = 0;
    this.weight = 5;
    this.happiness = 0;
    this.ageMonths = 0;
    this.ageYears = 0;
  }

  public String getName(){
    return name;
  }
  
  public int getEnergyLevel(){
    return energy;
  }

  public int getHappinessLevel(){
    return happiness;
  }
  
   public int getWeight(){
    return weight;
  }
  
   public int getAgeYears(){
    return ageYears;
  }



  public void feed(Food other){
    if (energy < 50){
      energy++;
      weight++;
    }
  }

  public void play(Game other){
    if (happiness < 10){
      happiness++;
    }
    if (weight > 5){
      weight--;
    }
  }
  public void sleep(){
    this.energy+=10; 
    this.happiness+=5;
  }
  public void updateStatus(){
    if (happiness > 0){
      happiness--;
    }
    if (energy > 0){
      energy--;
    }
    ageMonths++;
    ageConverter();
  }

  private void ageConverter(){
    if (ageMonths >= 12){
      ageYears++;
      ageMonths = 0;
    }
  } 

  public String toString(){
    return name + "'s information: \nEnergy: " + energy 
    + "\nweight: " + weight + "\nHappiness: " + happiness
    + "\nAge: " + ageYears + " years and " + ageMonths + " months.";
  }
}
