package site.cursojava.introducao;

public class A05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Recebendo o dia do mês informe se é dia útil ou final de semana
        // Considerando 1 como Domingo
        int dia = 14;
        int dia_semana;
        if (dia > 7){
            dia_semana = dia - ((dia / 7) * 7);
        } else {
            dia_semana = dia;
        }
        if (dia_semana == 0) {
            dia_semana = 1;
        }
        System.out.println(dia_semana);
        switch (dia_semana){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
