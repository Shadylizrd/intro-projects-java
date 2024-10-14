/*
There was already a file called Dog.java so I named this one
DogReview since its the review task for the oop section of 
the java course

This shows how you can create a class then run the main method
 */
public class DogReview {
    String breed;
    boolean hasOwner;
    int age;
    
    public DogReview(String dogBreed, boolean dogOwned, int dogYears) {
      System.out.println("Constructor invoked!");
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
    }
    
    public static void main(String[] args) {
      System.out.println("Main method started");
      DogReview fido = new DogReview("poodle", false, 4);
      DogReview nunzio = new DogReview("shiba inu", true, 12);
      boolean isFidoOlder = fido.age > nunzio.age;
      int totalDogYears = nunzio.age + fido.age;
      System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
      System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
      System.out.println("The total age of the dogs is: " + totalDogYears);
      System.out.println("Main method finished");
    }
  }