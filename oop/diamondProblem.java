package oop;

interface College {
    void display();
}

interface BeComp extends College {
    default void display() {
        System.out.println("This is my math subject");
    }
}

interface BeCivil extends College {
    default void display() {
        System.out.println("This is my computer subject");
    }
}

class EngiMath implements BeComp, BeCivil {
    // Since both BeComp and BeCivil interfaces have default display methods,
    // EngiMath should provide its own implementation to resolve the conflict.
    @Override
    public void display() {
        // Provide a specific implementation for EngiMath
        System.out.println("This is my favourite subject");
    }
}

public class diamondProblem {
    public static void main(String[] args) {
        EngiMath engiMath = new EngiMath();
        engiMath.display();
    }
}
