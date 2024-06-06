public class Teacher extends Person{

    // name , age, displayInformation এখানে চলে এসেছে মানে extends করলে সব auto চলে আসে।

    String qualification;

    @Override
    void displayInformation() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Qualifications :" + qualification);
    }
}

/*
Code reuse
One interface, multiple implements
Run time polymorphism.


Q. What is Method overriding
 ** Declaring a method in subclass which is already present in superclass known
 as method Overriding.

 Q. Why do we need method overriding?
   ** Code reuse
   ** One interface, multiple implement.
   ** Run time polymorphism

  Q. What are rules for method overriding?
    ** Name, Signature , Parameter must be same.
    ** If a method can't be inherited, then it can't be overridden.
    ** A method declared as final or static can't be overridden.
    ** Constructor can't be overridden.




 */