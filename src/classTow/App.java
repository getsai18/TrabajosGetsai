package classTow;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Esta es una caja de Strings");
        List<String> lista = new ArrayList<>();
        System.out.println("El valor de box1 es: "+box1.getValue());

        Box<Integer> box2 = new Box<>(3);
        System.out.println("El valor de box2 el valor es "+box2.getValue());

        Pair<String, Integer> pair = new Pair<>("id",3);
        System.out.println("La key es: "+pair.getKey());
        System.out.println("Valor "+pair.getKey());
    }
}
