# design-pattern-edu-builder
Exercise to showcase the builder pattern

This is a solution to a software dev interview assignment. The task was to create an exercise that helps beginner programmers understand the concept of the Builder design pattern.

________________________________________________________

Create an exercise that helps students understand the use of an object-oriented design pattern of your choice! The exercise is defined by these parts:
- A reference solution that can be expected from OOP learners (1-5 short classes).
- A starter code to be shared with students at the beginning (usually created from the above by deleting lines).
- 1-3 paragraphs of instruction text that describes students what to do.
A good exercise not just requires a certain way of coding but tries to make it visible why that design is preferable in professional coding practice.

________________________________________________________

Builder pattern exercise:
The builder design pattern is used to create complex objects in a step-by-step manner. We as humans tend to make mistakes in complex or convoluted code, so a general rule is to make our own codebase as foolproof as possible.
Using builder classes helps simplify creating objects that would otherwise have a long list of constructors and we also have the option of making the end object immutable (unable to change it after creation).
Suppose we have the following class that represents a user in our database. We are asked to make the first 2 fields mandatory, and the other 3 are optional.

public class SampleUser {

    private String name;
    private String email;
    private int age;
    private String phone;
    private String address;

    public SampleUser(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public SampleUser(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public SampleUser(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.phone = address;
    }

    public SampleUser(String name, String email, int age, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public SampleUser(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public SampleUser(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public SampleUser(String name, String email, int age, String phone, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

Now, on top of this being a constructor mess that is error prone, if you try to compile this in an IDE it will show multiple errors. This is because there are multiple constructors with the same blueprint (String, String, String for example). In Java this is not allowed.
So why would we not use setter methods to circumvent this problem? Well, some object fields should only be set once, if the logic dictates, and setter methods expose the object to modifications that might not be required. On top of that, we want to use a lot of abstractions in complex projects, and abstract objects cannot be instantiated, therefore using setters would be pointless. 

Motivation: we want to refactor the previous code so that we fit the criteria of the 2 mandatory and 3 optional fields, into a class that utilizes the builder design pattern. Use Demo.java to test the code's validity.

