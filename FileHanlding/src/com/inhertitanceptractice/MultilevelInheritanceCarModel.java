package com.inhertitanceptractice;

public class MultilevelInheritanceCarModel {
    int carModelNO = 1001;
    String carColor = "Black";
    static double carPrice = 700000.00;
    MultilevelInheritanceCarModel(){
        int carSpeed = 120;
        System.out.println("Maximum car speed: " +carSpeed);
        System.out.println("The car color is: " +carColor);
        System.out.println("The car price is :" +carPrice);
    }

    static {
        MultilevelInheritanceCarModel multilevelInheritanceCarModel = new MultilevelInheritanceCarModel();
        System.out.println("Car Model No:"+ multilevelInheritanceCarModel.carModelNO );
    }



    public static class MurutiSuzuki extends MultilevelInheritanceCarModel {
        String carModel1 = "Maruti Suzuki Swift";
        public void carCompany(){
            System.out.println("The car Model one is :" + carModel1);
        }


        public static class Volveswagan extends MurutiSuzuki {
            {
                String carModel2 = "polo";
                System.out.println("The car Model two is :"+ carModel2);
                carCompany();

            }

        }

    }
    public static void main(String[] args) {
       new MurutiSuzuki.Volveswagan();
    }
}
