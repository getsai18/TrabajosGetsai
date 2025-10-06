package classTow;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static <T> void printArray(T[] array){
        for(T v : array){
            System.out.println(v);
        }
    }

    public static <T> void printArrayNew(T[] array){
        for(T v: array){
            if(v instanceof Student){
                System.out.println(v);
            }

        }
    }




    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Esta es una caja de Strings");
        List<String> lista = new ArrayList<>();
        System.out.println("El valor de box1 es: "+box1.getValue());

        Box<Integer> box2 = new Box<>(3);
        System.out.println("El valor de box2 el valor es "+box2.getValue());

        Pair<String, Integer> pair = new Pair<>("id",3);
        System.out.println("La key es: "+pair.getKey());
        System.out.println("Valor "+pair.getKey());


        String[] arrayString={"Hola1","Hola2","Hola3"};
        Integer[] arrayInt={1,2,3,4,5};

        printArray(arrayString);
        printArray(arrayInt);
        System.out.println("***********************************************************************");
        Student[] students = new Student[2];
        Student st1=new Student(1,"getsai");
        Student st2=new Student(2,"Juan");
        students[0] = st1;
        students[1] = st2;
        printArray(students);


        System.out.println("*******************************************************************");
        Worker[] workers = new Worker[2];
        Worker w1 = new Worker(1,"lopez");
        Worker w2 = new Worker(2,"carranza");
        workers[0] = w1;
        workers[1] = w2;
        printArrayNew(workers);

    }
}
