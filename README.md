# Java_Basic_Fundamentals

STEP1 : BASIC CONCEPTS

Keywords ::: If we want to build an application in Java, we first must understand the basic vocabulary of the language. Java's keywords will provide us with that core, predefined words of the Java language.

Variables ::: Variables provide us with a way to store data for our application. We'll learn how to use variables in Java and then we'll consider some key ways in which Java variables differ from those of other languages (such as Python).

Loops ::: Loops allow us to iterate over data structures, executing the same code repeatedly until a condition is met, making it possible to process large data structures with only a few lines of code.

Methods ::: The central idea behind methods is that we want to write a block of code once that we we can then re-use many times.

Access Modifiers ::: We learned how to use access modifiers to restrict access to variables and methods, so that users of our applications cannot access all of the data directly and in an unsafe manner.

Javadoc ::: How do we know how to communicate with an existing Java application? Or, once we create our own application, how do we share it with others? JavaDoc produces a searchable HTML document that defines the classes and interfaces of an application, making it easy for you or any developer to understand how to use the code.

Arrays ::: Arrays provide us with a way to easily and efficiently store and retrieve collections of data, such as a list of phone numbers.

CLASSES VS OBJECTS

Class ::: A class is like a blueprint for a kind of object. The class defines the state and behavior that an object of that class will have

Object ::: It is a data structure that we create that bundles together and encapsulates two key things

Final Keyword ::: The final keyword means that the class cannot be changed and cannot be overridden or inherited.

Super() Keyword ::: It is used to call superclass methods, and to access the superclass constructor

toString() Method ::: We override the toString method to provide a better description of the class by defining its state variables so when youu print it out, you can see the values that the class actually has.

A Singleton Class ::: We use singleton class for utility classes and services when we only want one instance. This is to ensure that the state data or methods are shared with all of the other objects in the JVM.
To make a class a Singleton, we do the following:: Make the constructor private and create a static reference.

GARBAGE COLLECTION ::: Every new object that we instantiate is added to the heap and consumes memory.
Java has a background process called Garbage Collection (GC) that checks all instantiated objects, and destroys them if they do not have any references—thus freeing up memory, even without any active management on the part of the developer.

PACKAGES ::: which are essentially like folders you can use to organize your code and identify exactly which file (or class) you are referring to.

INHERITANCE ::: Inheritance is one class acquiring properties and methods from another class.

ABSTRACT CLASSES ::: which cannot be directly instantiated themselves, but that allow us to define the behavior for each of the subclasses.

INTERFACES ::: In interfaces we can implement more than one interface at a time

POLYMORPHISM ::: which is the ability for an object to take on many forms.


STEP2 : ADVANCE CONCEPTS

Exceptions                  :: which help us handle errors.

Enums                       :: which help us set variables from a list of predefined values.

Dates and Calendar          :: which help us store and retrieve dates.

Regular Expressions (RegEx) :: which help us look for string patterns.

Advanced String features    :: which will help us manipulate and process strings more efficiently.

GENERICS ::: Generics are a way to parameterize class types into classes, methods and variables so that we eliminate the need for casting, have stronger type checks at compile time, and develop generic algorithms.

COLLECTIONS ::: Collections are data structures that were created to provide improved interoperability and performance. Collections provides a more effective framework and architecture for storing, retrieving, and processing data.

ADVANCED COLLECTIONS

MAPS :: are collections that use key-value pairs, making it possible for us to find an element more efficiently (in constant time rather than linear time).

SETS :: are collections that avoid duplicate elements.

QUEUES :: are collections that support a First-In, First-Out order, so that we can process elements in the order they arrive.

OVERRIDING HASHCODE AND EQUALS ::: the Hashcode is used when inserting objects into a Hash structure. There is a contract we must ensure we meet when overriding the equals and hashcode. If we change one of them, we must always change both.

 
