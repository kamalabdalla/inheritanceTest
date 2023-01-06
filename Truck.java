class Truck extends Car {
    int weight;
    
    Truck(int speed, double regularPrice, String color, int weight) {
      super(speed, regularPrice, color);
      this.weight = weight;
    }
    
    @Override
    double getSalePrice() {
      if (weight > 2000) {
        return 0.9 * regularPrice;
      } else {
        return 0.8 * regularPrice;
      }
    }
  }