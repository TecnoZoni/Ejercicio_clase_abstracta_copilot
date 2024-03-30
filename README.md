# Ejercicio_clase_abstracta_copilot
Ejercicio de clases abstractas que le pedí a la IA de Microsoft Copilot

## Ejercicio: Clase Abstracta en Java

Supongamos que estamos construyendo una aplicación para una tienda en línea llamada "MyOnlineShop". Queremos modelar diferentes tipos de seres vivos que interactúan con nuestra tienda. Para ello, vamos a crear una **clase abstracta** llamada `LivingThing` que representará a todos los seres vivos. Además, definiremos un método abstracto llamado `walk()` que deberá ser implementado por las subclases.

Aquí está el esqueleto de la clase abstracta `LivingThing`:

```java
package myabstractclassproject;

// La clase LivingThing es una clase abstracta porque
// algunos de sus métodos están declarados como métodos abstractos.
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

    // Método abstracto walk()
    // Queremos que este método sea implementado por las subclases de LivingThing.
    public abstract void walk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Ahora, tu tarea es crear una subclase llamada `Human` que herede de `LivingThing`. En la clase `Human`, debes implementar el método `walk()` de acuerdo a cómo caminan los humanos.

Recuerda que una **clase abstracta** no puede ser instanciada directamente, pero puede ser heredada por otras clases concretas. En este caso, `Human` será una subclase concreta que extiende la funcionalidad de `LivingThing`.
