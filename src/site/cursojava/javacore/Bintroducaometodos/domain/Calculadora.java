package site.cursojava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoiNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return (num1 / num2);
    }

    public void imprimeDivisaoDeDoisNumeros(int num1, int num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoiNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro de altera dois numeros");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }
}
