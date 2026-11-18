package oops;

public class Polymorphism {
    //Compile time polymorphism or Method overloading
    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }


    public static void main(String[] args) {

        //Compile time
        int sum = add(5,4,3);
        System.out.println(sum);

        //Runtime
        Animal animal = new Dog();
        animal.sound();
    }
}

class Animal{

    Animal(){
        System.out.println("Hello from Animal");
    }

    void sound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{

    Dog(){
        System.out.println("Hello from Dog");
    }

    @Override
    void sound() {
        System.out.println("Dog sound");
    }
}
