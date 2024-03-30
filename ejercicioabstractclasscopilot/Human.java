package ejercicioabstractclasscopilot;

public class Human extends LivingThing {

    public Human(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("El Humano esta caminando...");
    }

}
