package com.project.gimohub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cat cat=new Cat();
        cat.setName("Gio");
        System.out.println(cat.getName());

        Dog dog = new Dog();
        dog.setName("Bailey");
        dog.setAction("Byte");
        dog.getAction();

    }
}


