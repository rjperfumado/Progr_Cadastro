package br;

public class Cadastro {

	Produto produto = new Produto();
	
	public void cadastrarProduto(String nome, float preco, int qtde)
	{
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setQuantidade(qtde);
	}
	
	public float calcularValorAPagar()
	{
		return produto.getPreco()*produto.getQuantidade();
	}
	
	public Produto visualizarProduto()
	{
		return produto;
	}
}
