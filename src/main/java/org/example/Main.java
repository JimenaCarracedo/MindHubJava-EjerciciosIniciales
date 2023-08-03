package org.example;





import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        System.out.println(ejercicio11());


    }


    public static void ejercicio1() {
        String name = "Jimena";
        String lastname = "Carracedo";
        int age = 35;
        System.out.println("Mi nombre es " + name + " " + lastname + " y tengo " + age + " años");
    }
    public static void ejercicio2(){
        Scanner read = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Elija el primer numero");
        number1 = read.nextInt();
        System.out.println("Elija el segundo numero");
        number2 = read.nextInt();
        System.out.println("Elija el tercer numero");
        number3 = read.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
    public static void ejercicio3(){
        int number4;
        Scanner read = new Scanner(System.in);
        System.out.println("Elija un numero");
        number4 = read.nextInt();
        if (number4 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }
    }
    public static void ejercicio4(){
        String phrase1, phrase2;
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba una frase");
        phrase1 = read.next();
        System.out.println("Escriba una frase");
        phrase2 = read.next();
        if (phrase1.equals(phrase2)) {
            System.out.println("Las frases son iguales");
        } else {
            System.out.println("Las frases son distintas");
        }
    }
    public static void ejercicio5(){
        Integer numbers;
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numbers2 =new ArrayList<Integer>();
        System.out.println("Ingrese un numero");
        numbers = read.nextInt();
        while (numbers != 0) {
            System.out.println("Ingrese un numero");
            numbers = read.nextInt();
            numbers2.add(numbers);
        }
        System.out.println("Ingreso un 0");
    }
    public static void ejercicio6(){
        String wellcome = "Bienvenido";
        System.out.println(welcomef(wellcome));
    }
    public static void ejercicio7(){
        int pair;
        Scanner read = new Scanner(System.in);
        System.out.println("Elija un numero");
        pair = read.nextInt();
        System.out.println(apair(pair));
    }
    public static void ejercicio8(){
        int primo, i;
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese un numero primo");
        primo= read.nextInt();
        double div;
        String warn="a";

        for(i=2; i<primo; i++){
            div=primo%i;
            if(div==0){
                warn="el numero no es primo";

            }else{
                warn="bien hecho ;)";

            }
            System.out.println(warn);
        }

    }


    public static void ejercicio9(){
        ArrayList numbers1 = new ArrayList<Integer>();
        int i;
        for (i = 1; i < 10; i++) {
            numbers1.add(i);
        }
        System.out.println(sum((ArrayList) numbers1));
    }
    public static String ejercicio11() {
        String op, answer;
        int a, b, c;
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el primer numero a operar");
        a=read.nextInt();
        System.out.println("ingrese el segundo numero a operar");
        b= read.nextInt();
        System.out.println("Ingrese s para sumar, r para restar, m para multiplicar d para dividir o 0 para salir");
        op = read.next();

        switch (op) {
            case "s":
                c=(a + b);
                answer= ("el resultado es "+c);
                break;
            case "r":
                c=(a - b);
                answer=("el resultado es "+c);
                break;
            case "m":
                c=(a * b);
                answer=("el resultado es "+c);
                break;
            case "d":
                if(b!=0) {
                    c = (a / b);
                    answer = ("el resultado es " + c);
                }else{
                    answer= ("no es posible la operación");
                }
                break;
            case "0":
                answer=("Ha salido de la calculadora");
                break;
            default:
                answer=("opción invalida");
                break;

        }
        return answer;
    }
    public static String welcomef(String wellcome) {

        return wellcome;
    }


    public static String apair(int pair) {
        if (pair % 2 == 0) {
            return "El numero es par";
        } else {
            return "El numero no es par";
        }
    }

    public static int sum(ArrayList<Integer> numbers1) {

        Integer result;
        int i;

        result=0;
        for(i=0; i<numbers1.size(); i++){
            if(numbers1.get(i)%2==0) {
                numbers1.remove(i);
            }

        }
        for(i=0; i<numbers1.size(); i++){
            result+= numbers1.get(i);
        }

           return result;
    }

    }








