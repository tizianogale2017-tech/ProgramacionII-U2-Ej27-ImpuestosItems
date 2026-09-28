package Ejercicio27_impuestosItems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ItemFacturable> items = new ArrayList<>();
        items.add(new ProductoImportado("Consola de videojuegos", 500000.0));
        items.add(new ServicioProfesional("Consultoría contable", 120000.0));
        items.add(new AlimentoBasico("Bolsón de verduras", 15000.0));

        double total = 0;
        for (ItemFacturable item : items) {
            System.out.printf("%-24s base: %10.2f | impuesto: %10.2f | final: %10.2f%n",
                    item.getNombre(), item.getPrecioBase(), item.calcularImpuesto(), item.calcularPrecioFinal());
            total += item.calcularPrecioFinal();
        }
        System.out.printf("TOTAL A PAGAR: %.2f%n", total);
    }
}
