package day54_abstraction.language;

public interface Language {

    // ===RULE===
    // Variables are static and final by default
    // can have static method, abstract methods and default methods only
    // public is the only access modifier that can be used in interface and given by default
    // Abstract keyword is given by default to the abstract methods of interface


    // ===CANNOT HAVE===
    // cannot have -> instance variables
    // cannot have -> instance methods
    // cannot have -> constructions
    // cannot have -> code blocks
    // cannot have -> create project from interface


    String PLANET = "Earth"; // public static final String PLANET


    void hi();

    void bye();

}
