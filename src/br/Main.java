package br;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome = new String();
		float preco;
		int qtde;
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		

		for (int i = 0; i < 1; i++) {
			
		
			
			Cadastro cadastro = new Cadastro();
			
			System.out.println("\nInforme nome do produto");
			nome = input.nextLine();
			
			System.out.println("Informe o pre�o do produto");
			preco = input.nextFloat();
			
			System.out.println("\nInforme quantidade");
			qtde = input.nextInt();

			input.nextLine(); 
			
			cadastro.cadastrarProduto(nome, preco, qtde);
			
			Produto produto = cadastro.visualizarProduto();
			produto.setValorTotal(cadastro.calcularValorAPagar());
			
			listaProduto.add(produto);
		
			
		}

		
		for (Produto produto : listaProduto) {
						
			FileWriter arq = new FileWriter("Produtos.txt",true);
			 PrintWriter gravarArq = new PrintWriter(arq);
			 
			System.out.println("\nnome do produto = "+produto.getNome());
			System.out.println("pre�o do produto = "+produto.getPreco());
			System.out.println("quantidade = "+produto.getQuantidade());
			System.out.println("\nvalor total = "+produto.getValorTotal());
			
			gravarArq.println(produto.getNome());;
//			gravarArq.println(produto.getPreco());;
//			gravarArq.println(produto.getQuantidade());;
//			gravarArq.println(produto.getValorTotal());;
//			
			
	        //gravarArq.printf("\n+--Resultado--Lista: %s %.0f %d \n\n",nome,preco,qtde);
			
			arq.close();
		}
		
	}

}
