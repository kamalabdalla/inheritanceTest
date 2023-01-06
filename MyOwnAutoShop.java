  
  class MyOwnAutoShop {
    public static void main(String[] args) {
      Sedan sedan = new Sedan(100, 10000, "red", 25);
      Ford ford1 = new Ford(130, 14000, "blue", 2018, 400);
      Ford ford2 = new Ford(130, 30000, "black", 2023, 600);
      Car car = new Car(70, 8100, "white");
      
      System.out.println("Sedan sale price is: " + sedan.getSalePrice());
      System.out.println("Ford 1 sale price is: " + ford1.getSalePrice());
      System.out.println("Ford 2 sale price is: " + ford2.getSalePrice());
      System.out.println("Car sale price is: " + car.getSalePrice());
    }
  }