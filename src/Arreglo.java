public class Arreglo {

   public void arreglos(){
       //declaracion
       int[] arrA;
       //inicializacioin
       arrA = new int[5];

       //declaración y inicializacin
       int[] arrB = new int[5];

       //declaracion y inicializacion
       double[] arrD={2,2,54,54};
       int[] arrC = new int[] {4,4,4,4};

       //acceso
       System.out.println(arrA[2]);
       System.out.println(arrD[4]);

       //modificacion
       arrA[0] = 10;



       //recorrido
       for(int i = 0; i < arrA.length;i++){
           System.out.println(arrA[i]);
       }

       //con for each
       int i = 0;
       for (int num: arrC){
           System.out.println(num);
           i++;
       }

       System.out.println();

   }

    public static void main(String[] args) {

    }
}
