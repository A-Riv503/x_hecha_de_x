import java.util.Scanner;

public class Main {
    /*Escribir un programa en Java que imprima una X construida a base de la letra X y utilizar el carácter de subrayado como espacio. El tamaño de la x se basa
     en una variable n que indicará el tamaño de la letra para imprimir (en una matriz de n x n). Por ejemplo, para n = 5 se obtiene:
    X___X
     X_X
     _X_
     X_X
    X___X

    y para n=6 se obtiene:

    X____X
     X__X
     _XX_
     _XX_
     X__X
    X____X

    Si n es igual a cero imprimir "ERROR"

    Tenga en cuenta que el código debe imprimir los resultados exactamente como se muestra con el fin de que la pregunta sea considerada válida durante la prueba
    (El carácter "X" en mayúscula y el guion bajo "_" para los espacios).

     */
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        llenarMatriz();
    }


    public static void llenarMatriz(){
        int longitud;
        System.out.println("ingrese el tamaño de su matriz");
        longitud=scan.nextInt();

        char matriz[][]=new char[longitud][longitud];
        if(longitud==0){
            System.out.println("ERROR");
        }else{
           formarX(matriz,longitud);
        }

    }

    public static void formarX(char matriz[][],int longitud){
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j< matriz.length;j++){
                if(i==j || i+j==longitud-1){
                    System.out.print("X");
                }else if(j>=1 && j<longitud-1){
                    System.out.print("_");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}