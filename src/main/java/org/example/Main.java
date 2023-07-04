package org.example;

public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Eduardo", 20, "135.764.951-62", "M",24, "Noturno", 10.50f );

        Cliente c1 = new Cliente("Wesley", 20, "895.762.430-24", "M");
        Cliente c2 = new Cliente("Pedro", 20, "715.668.344-65", "Não");
        Cliente c3 = new Cliente("Wanderson", 20, "13.878.684-71", "Não por opção (delas)");

        Calcado cal1 = new Calcado(1, "adibas", "tênis", "preto", "40", 5, true, 105.50f);
        Calcado cal2 = new Calcado(2, "bike", "tênis", "branco", "41", 5, true, 203.75f);

        Compra co1 = new Compra(v1, c1);
        co1.adicionarCalcado(cal1);
        co1.adicionarCalcado(cal2);
        co1.detalhes();
        co1.removerCalcado(cal2);
        co1.detalhes();
        co1.concluirVenda();
        c1.detalhes();
        v1.detalhes();

        System.out.println("\n");

        Compra co2 = new Compra(v1, c2);
        co2.adicionarCalcado(cal2);
        co2.detalhes();
        co2.concluirVenda();
        c2.detalhes();
        v1.detalhes();

        System.out.println("\n");

        Compra co3 = new Compra(v1, c3);
        co3.adicionarCalcado(cal1);
        co3.adicionarCalcado(cal1);
        co3.adicionarCalcado(cal2);
        co3.detalhes();
        co3.limparCarrinho();
        co3.detalhes();
        co3.adicionarCalcado(cal2);
        co3.detalhes();
        co3.cancelarVenda();
        c3.detalhes();
        v1.detalhes();
    }
}