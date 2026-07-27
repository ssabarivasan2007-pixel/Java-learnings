//Program for abstraction:
//package Day14;
//abstract class Animal{                        //we cannot create an object to access this we can access it via reference;
//    abstract public void makeSound();
//    void makingsound(){
//        System.out.println("making sound");
//    }
//}
//class Cat extends Animal{                     //here is an reference class to access it via new object:
//    @Override
//    public void makeSound() {
//        System.out.println("Meow Meow");
//    }
//}
//class Dog extends Animal{
//    @Override
//    public void makeSound() {
//        System.out.println("Bow Bow");
//    }
//}
//public class Abstraction{
//    public static void main(String[] args){
//        Animal Cat = new Cat();               //here we can access the abstract class with second class object:
//        Animal Dog = new Dog();
//        Cat.makeSound();
//        Dog.makeSound();
//        Cat.makingsound();                    //this is the method to access or print abstract class:
//        Dog.makingsound();
//    }
//}

