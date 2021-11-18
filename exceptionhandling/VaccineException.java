package com.exceptionhandling;

/*Write a class VaccineException which extends from Exception.
Write a method isEligibleForVaccine(int age). If Age given is less than 18, throw VaccineException,
catch the exception in calling method and show “Not eligible for Vaccination” else show “Eligible for Vaccination”*/

public class VaccineException extends Exception {

    public void isEligibleForVaccine(int age) throws VaccineException  {

      try{
          if(age < 18) {
              throw new VaccineException();
          }
          else {
              System.out.println("Eligible for vaccination");
          }
        } catch (VaccineException e) {
          System.out.println("Not Eligible for vaccination");
          throw e;
         // e.printStackTrace();
      }

    }
    public static void main(String[] args) {
        VaccineException vaccineException = new VaccineException();
        try {
            vaccineException.isEligibleForVaccine(20);
        } catch (VaccineException e) {
            e.printStackTrace();
        }
    }
}
