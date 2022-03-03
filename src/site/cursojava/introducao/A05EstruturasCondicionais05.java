package site.cursojava.introducao;

public class A05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo
        int dia = 10;
        int dia_semana;
        if (dia > 7 ) {
            dia_semana = dia - ((dia / 7) * 7);
        } else {
            dia_semana = dia;
        }
        switch (dia_semana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println(dia_semana);

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
