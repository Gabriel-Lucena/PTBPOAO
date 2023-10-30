package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.produto.CabecaAve;
import model.produto.MacaEnvenenada;
import model.produto.MacaPodi;
import model.produto.OssadaBoi;
import model.produto.PataGoblin;
import model.produto.PresasLobo;

import model.produto.base.Item;

public class App {
  public static void main(String[] args) {

    ArrayList<Item> itens = new ArrayList<Item>();

    Scanner entrada = new Scanner(System.in);

    int quantidade;
    double desconto;

    System.out.println("Bem-vendo ao mercado!");
    System.out.println("Digite quantas unidades");
    System.out.println("deseja e use seus cupons!");

    System.out.println("Quantidade de Ossada de boi?");
    quantidade = entrada.nextInt();
    System.out.println("Desconto?");
    desconto = entrada.nextDouble();

    OssadaBoi ossadaBoi = new OssadaBoi(quantidade, desconto);
    itens.add(ossadaBoi);

    System.out.println("Quantidade de Cabeça de ave?");
    quantidade = entrada.nextInt();
    System.out.println("Desconto?");
    desconto = entrada.nextDouble();

    CabecaAve cabecaAve = new CabecaAve(quantidade, desconto);
    itens.add(cabecaAve);

    System.out.println("Quantidade de Pata de goblin?");
    quantidade = entrada.nextInt();
    System.out.println("Desconto?");
    desconto = entrada.nextDouble();

    PataGoblin pataGoblin = new PataGoblin(quantidade, desconto);
    itens.add(pataGoblin);

    System.out.println("Quantidade de maçã podi?");
    quantidade = entrada.nextInt();
    System.out.println("Desconto?");
    desconto = entrada.nextDouble();

    MacaPodi macaPodi = new MacaPodi(quantidade, desconto);
    itens.add(macaPodi);

    System.out.println("Quantidade de presas de lobo?");
    quantidade = entrada.nextInt();
    System.out.println("Desconto?");
    desconto = entrada.nextDouble();

    PresasLobo presasLobo = new PresasLobo(quantidade, desconto);
    itens.add(presasLobo);

    System.out.println("Quantidade de maçã envenenada?");
    quantidade = entrada.nextInt();
    System.out.println("Desconto?");
    desconto = entrada.nextDouble();

    MacaEnvenenada macaEnvenenada = new MacaEnvenenada(quantidade, desconto);
    itens.add(macaEnvenenada);

    entrada.close();

    double precoTotal = 0;

    for (Item item : itens) {

      double precoUnitario = item.getPrecoUnitario();
      int quantidade_item = item.getQuantidade();
      double desconto_item = item.getDesconto();

      precoTotal += precoUnitario * quantidade_item * (1 - desconto_item / 100);
    }

    System.out.println("O preço total é: " + precoTotal);
  }
}
