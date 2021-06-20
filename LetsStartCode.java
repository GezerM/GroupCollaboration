public class Car{
  public String model;
  public Car(int year, String model){
    this. model = model;
  }
  public void acceleration(){
    System.out.println(model + "'s 0-100 is 6.7 seconds");
  }
  public static void main(String [] args){
    acceleration();
  }
    
