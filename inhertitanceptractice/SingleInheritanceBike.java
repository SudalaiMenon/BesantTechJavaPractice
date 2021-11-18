package com.inhertitanceptractice;

 class SingleInheritanceBike {
     String bikeBrand = "HeroHonda";
     int bikeModelNumber = 1001;
     int bikeSeatCapacity = 2;

     public void bikeSpeed() {
         int bikeTopSpeed = 70;
         System.out.println("Top Bike Speed Kilometer per Hour: " + bikeTopSpeed);
     }

     public static void bikeSeatCapacity() {
         SingleInheritanceBike singleInheritanceBike = new SingleInheritanceBike();
         System.out.println("Bike Seat Capacity : " + singleInheritanceBike.bikeSeatCapacity);

     }

     SingleInheritanceBike() {
         String bikeModel = "Splendor";
         System.out.println("Bike Models is : " + bikeModel);

     }

     static {
         SingleInheritanceBike singleInheritanceBike = new SingleInheritanceBike();
         System.out.println("Bike Brand is : " + singleInheritanceBike.bikeBrand);
         System.out.println("Bike Model Number is: " + singleInheritanceBike.bikeModelNumber);
     }
 }
    class Bikes extends SingleInheritanceBike {
        String bikeModel2 = "Super Spendor";
        String bikeModel3 = "Passion Pro";
        {
            super.bikeSpeed();
            SingleInheritanceBike.bikeSeatCapacity();
            System.out.println("Bikes model number2: " +bikeModel2);
            System.out.println("Bike model number3: " +bikeModel3);
        }


    public static void main(String[] args) {
       //SingleInheritanceBike singleInheritanceBike = new SingleInheritanceBike();
      // singleInheritanceBike.bikeSpeed();
        //new  SingleInheritanceBike();
       new Bikes();


    }
}
