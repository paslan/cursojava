package site.cursojava.introducao;

public class A04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // %

        int resto = 21 % 2;
        System.out.println(resto);

        // Operadores de comparação - sempre retorna valores booleanos
        // < >  <= >= == !=
        boolean valor = 10 < 20;
        System.out.println("Valor-> " + valor);

        // Operadores lógicos
        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 2000;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //operadores de atribuição
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador++);
        System.out.println(contador);
        System.out.println(++contador);
    }
}
