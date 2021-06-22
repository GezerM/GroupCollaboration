public class Car{
  public String model;
  public Car(int year, String model){
    this. model = model;
  }
  public void acceleration(){
    System.out.println(model + "'s 0-100 is 6.7 seconds");
  }
  public void stop(){
    System.out.println("Current velocity is zero");
  }
  public static void main(String [] args){
    acceleration();
    stop();
  }
  public class Dog {

    String breed;
    int age;
    String color;
    String name;

    public String getInfo() {
      return "This is my dog";
    }

    public void barking() {
      System.out.println(name + " is barking");
    }

    public void hungry() {
      System.out.println(name + " is hungry");
    }

    public void sleeping() {
      System.out.println(name + " is sleeping");
    }


  }
    
