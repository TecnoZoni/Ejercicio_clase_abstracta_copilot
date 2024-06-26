package ejercicioabstractclasscopilot;

public abstract class LivingThing {

    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println("El ser vivo está respirando...");
    }

    public void eat() {
        System.out.println("El ser vivo está comiendo...");
    }

    public abstract void walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
