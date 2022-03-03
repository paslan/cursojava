package site.cursojava.introducao;

public class A05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // Operador ternário
        // (condicao) ? verdadeiro : falso

        double salario = 6000;
        String mensagemDoar = "Vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado;
        if (salario > 5000){
            resultado = mensagemDoar;
        }
        else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
