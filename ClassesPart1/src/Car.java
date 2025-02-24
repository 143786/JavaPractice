public class Car {

    private String make = "Tesla";
    private String model = "Model Y";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true ;

    public void describeCar () {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                        (convertible ? "convertible" : ""));

    }


    }



    /*
    here we create some variables that are part of this
    class. variables used inside a method or code block
    These were called local variables because they were
    local to, or belonged to, that method or code blck.

    Classes allows us to create variables that can be
    seen or are accessible by any code block within
    that class.
    But  we can also allow access from outside the
    class itself.

    When we're designing our class, there are some
    things we want the public to know, and some
    things that aren't necessary for the public to
    know.
    We can have a public interface. THis is only the
    information the outside world needs to know to
    use our class.

    Non-public interface : This is information we may
    want to share but not always and not with everyone.
    WE MAY need to share some information with our own
    company and other departments, while other data might
    need to be shared with our manufactures and dealers,
    but not with the public. Java gives us the ability to
    have this kind of control by specifying different
    access modifiers for each member in a class.

    Access modifiers for class members :
    an access modifier at the member level allows
    granular control over class members.


    ********* Encapsulation :
    Encapsulation in OOP usually has two meaning :
     1) bundling of behavior and attributes on a single
     object.
     2) The practice of hiding fields and some methods
     from public access.
       ** In general, when we talk about encapsulation,
       we're talking about information hiding, or hiding
       the internal working of a particular object.
       WHen we make our attributes private, we can then
       create methods to access the data, each with
       different degrees of access allowed, as needed.


        In here what I'm going to do first is create some
        fields for my class. This going to look familiar
        to me and is a lot like the way I've created local
        variable previously. I'll add some fields, which
        are characteristics of the car. What kind of things
        might you be interested in when describing a car ?
        Maybe, things like the make or manufacturer,
        the model, its color, how many doors does it have,
        is it a convertible or not.

        There I've created five fields. Theses are fields
        because they are defined in the class's code block
        or

        ***
    private String make = "Tesla";
    private String model = "Model Y";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true ;

    SO, now, every car object I create will have these values
    by default.

     */