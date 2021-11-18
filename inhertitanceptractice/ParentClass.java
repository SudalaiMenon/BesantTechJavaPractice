package com.inhertitanceptractice;

public class ParentClass {
    public int sum(int a,int b){
        return a + b;
    }
}
class ChildClass extends ParentClass {
    public int calculate(int a, int b) {
        return (sum(a,b)*100);
    }
    public static void main(String[] args){
        ChildClass childClass = new ChildClass();
       // System.out.println(parentClass.sum(10,20));
        System.out.println(childClass.calculate(10,20));
    }


}
