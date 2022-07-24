package day54_abstraction.animal;

import day54_abstraction.language.Language;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat(){
        System.out.println("Parrot wobble over to the seed");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HELLO HELLO");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE");
    }
}
