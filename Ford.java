class Ford extends Car {
    int year;
    int manufacturerDiscount;
    
    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
      super(speed, regularPrice, color);
      this.year = year;
      this.manufacturerDiscount = manufacturerDiscount;
    }
    
    @Override
    double getSalePrice() {
      return super.getSalePrice() - manufacturerDiscount;
    }
  }
  