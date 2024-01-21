package oo.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

   final String nome;

   final List<Compra> compras = new ArrayList<>();

    Cliente (String nome){
        this.nome = nome;
    }

    void adcionarCompra(Compra compra){
        this.compras.add(compra);
    }

    Double obterValorTotal(){
        double total;
        total = 0;

        for (Compra compra: compras){
            total += compra.obterValorTotal();
        }

        return total;

    }
}
