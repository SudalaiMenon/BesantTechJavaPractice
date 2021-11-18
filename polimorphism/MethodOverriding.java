package com.polimorphism;

class RoyalEnfield {

    void bikeSpeed()
    {
        System.out.println("Royal Enfield Maximum Speed 200");
    }
}

class ThunderBird extends RoyalEnfield {

    void bikeSpeed()
    {
        System.out.println("RoyalEnfield thundarbird Maximum speed 145");
    }
}

class Classic extends RoyalEnfield {

    void bikeSpeed()
    {
        System.out.println("Royal Enfield classic350 Maximum speed 125");
    }
}

class MethodOverrding {
    public static void main(String[] args) {
        RoyalEnfield royalEnfield = new Classic();
        royalEnfield.bikeSpeed();
        RoyalEnfield royalEnfield1 = new ThunderBird();
       royalEnfield1.bikeSpeed();
        RoyalEnfield royalEnfield2 = new RoyalEnfield();
        royalEnfield2.bikeSpeed();

    }

}