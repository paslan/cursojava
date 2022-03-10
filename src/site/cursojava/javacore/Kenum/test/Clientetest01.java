package site.cursojava.javacore.Kenum.test;

import site.cursojava.javacore.Kenum.domain.Cliente;
import site.cursojava.javacore.Kenum.domain.Cliente.TipoPagamento;
import site.cursojava.javacore.Kenum.domain.TipoCliente;

public class Clientetest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jonas", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Jeremias", TipoCliente.PESSOA_JURIRICA, TipoPagamento.CREITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
