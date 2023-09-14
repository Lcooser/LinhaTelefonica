package telefonia;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente("João", "Rua Duque de Caxias");
        Cliente cliente2 = new Cliente("Maria", "Rua Farroupilha");

        System.out.println("Informe a quantidade de minutos excedentes da Linha Fixa do João: ");
        int minutosExcedentesJoao = scanner.nextInt();
        LinhaTelefonica linhaFixaJoao = new Fixa("84051408", minutosExcedentesJoao);

        System.out.println("O plano de dados está habilitado para a Linha Móvel do João? (true/false): ");
        boolean planoDeDadosJoao = scanner.nextBoolean();
        
       
        System.out.println("Informe a quantidade de minutos gastos na Linha Móvel do João: ");
        int minutosGastosJoao = scanner.nextInt();
        LinhaTelefonica linhaMovelJoao = new Movel("98452519", planoDeDadosJoao);
        linhaMovelJoao.setqtdMinutosGastos(minutosGastosJoao);

        System.out.println("Informe a quantidade de minutos excedentes da Linha Fixa da Maria: ");
        int minutosExcedentesMaria = scanner.nextInt();
        LinhaTelefonica linhaFixaMaria = new Fixa("97034605", minutosExcedentesMaria);

        System.out.println("O plano de dados está habilitado para a Linha Móvel da Maria? (true/false): ");
        boolean planoDeDadosMaria = scanner.nextBoolean();
        
        
        System.out.println("Informe a quantidade de minutos gastos na Linha Móvel da Maria: ");
        int minutosGastosMaria = scanner.nextInt();
        LinhaTelefonica linhaMovelMaria = new Movel("84387203", planoDeDadosMaria);
        linhaMovelMaria.setqtdMinutosGastos(minutosGastosMaria);

        cliente1.adicionarLinhaTelefonica(linhaFixaJoao);
        cliente1.adicionarLinhaTelefonica(linhaMovelJoao);
        cliente2.adicionarLinhaTelefonica(linhaFixaMaria);
        cliente2.adicionarLinhaTelefonica(linhaMovelMaria);

        System.out.println(cliente1);
        for (LinhaTelefonica linha : cliente1.getLinhasTelefonicas()) {
            System.out.println(linha + ", Custo: R$" + linha.calcular());
        }

        System.out.println();

        System.out.println(cliente2);
        for (LinhaTelefonica linha : cliente2.getLinhasTelefonicas()) {
            System.out.println(linha + ", Custo: R$" + linha.calcular());
        }

        scanner.close();
    }
}
