package Ejercicio27_impuestosItems;

public abstract class ItemFacturable {
    protected String nombre;
    protected double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        if (precioBase < 0) {
            throw new IllegalArgumentException("El precio base no puede ser negativo.");
        }
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularImpuesto();

    public double calcularPrecioFinal() {
        return precioBase + calcularImpuesto();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
