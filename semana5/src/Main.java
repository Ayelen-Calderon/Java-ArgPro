import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




/*
        Scanner scanner = new Scanner(System.in);
        int [] arrayDeNumero = new int[3];

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        arrayDeNumero[0] = num1;

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        arrayDeNumero[1] = num2;

        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        arrayDeNumero[2] = num3;

  System.out.print("Ingrese A para indicar que los numeros ingresados se muestres ordenados de manera ASCENDENTE. \n"
          +"Ingrese D para indicar que los numeros ingresados se muestres ordenados de manera DESCENDENTE.");
        String letraDeOrdenamiento = scanner.next().toUpperCase();*/

        int n1 = 2;
        int n2= 100;
        int n3= 25;
        char letra = 'a';

        ordenarNum();
        ordenarNum(n1 , n2, n3, letra);



    }

    private static void ordenarNum(){


        Scanner scanner = new Scanner(System.in);
        int [] arrayDeNumero = new int[3];

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        arrayDeNumero[0] = num1;

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        arrayDeNumero[1] = num2;

        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        arrayDeNumero[2] = num3;

        System.out.print("Ingrese A para indicar que los numeros ingresados se muestres ordenados de manera ASCENDENTE. \n"
                +"Ingrese D para indicar que los numeros ingresados se muestres ordenados de manera DESCENDENTE.");
        String letraDeOrdenamiento = scanner.next().toUpperCase();

        if(letraDeOrdenamiento.equals("A")){

            for (int i = 0; i < arrayDeNumero.length; i++) {
                for (int j = 0; j < arrayDeNumero.length - 1; j++) {
                    if (arrayDeNumero[j] > arrayDeNumero[j + 1]) {
                        int temp = arrayDeNumero[j];
                        arrayDeNumero[j] = arrayDeNumero[j + 1];
                        arrayDeNumero[j + 1] = temp;
                    }
                }
            }

        }else if (letraDeOrdenamiento.equals("D")){
            for (int i = 0; i < arrayDeNumero.length; i++) {
                for (int j = 0; j < arrayDeNumero.length - 1; j++) {
                    if (arrayDeNumero[j] < arrayDeNumero[j + 1]) {
                       int temp = arrayDeNumero[j];
                        arrayDeNumero[j] = arrayDeNumero[j + 1];
                        arrayDeNumero[j + 1] = temp;
                    }
                }
            }
        }else System.out.println("la letra ingresada no es valida ");



        for (int num : arrayDeNumero) {
            System.out.println(num);
        }

    };
    private static void ordenarNum(int num1, int num2 ,int num3, char let){
        String letra = String.valueOf(let).toUpperCase();
        int [] arrayDeNum = new int[3];
        arrayDeNum[0] = num1; arrayDeNum[1] = num2; arrayDeNum[2] = num3;
        if(letra.equals("A")){

            for (int i = 0; i < arrayDeNum.length; i++) {
                for (int j = 0; j < arrayDeNum.length - 1; j++) {
                    if (arrayDeNum[j] > arrayDeNum[j + 1]) {
                        int temp = arrayDeNum[j];
                        arrayDeNum[j] = arrayDeNum[j + 1];
                        arrayDeNum[j + 1] = temp;
                    }
                }
            }

        }else if (letra.equals("D")){
            for (int i = 0; i < arrayDeNum.length; i++) {
                for (int j = 0; j < arrayDeNum.length - 1; j++) {
                    if (arrayDeNum[j] < arrayDeNum[j + 1]) {
                        int temp = arrayDeNum[j];
                        arrayDeNum[j] = arrayDeNum[j + 1];
                        arrayDeNum[j + 1] = temp;
                    }
                }
            }
        }else System.out.println("la letra ingresada no es valida ");



        for (int num : arrayDeNum) {
            System.out.println(num);
        }

    }





}