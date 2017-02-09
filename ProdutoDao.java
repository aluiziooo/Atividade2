public class ProdutoDao{
	
	public void Cadastrar(Produto produto){
		produto.setId("01");
		produto.setNome("Arroz");
		produto.setTipo("A");
		produto.setMarca("Amerika");
		produto.setDescricao("É um arroz branquinho e gostoso, cabe no seu bolso e veio da asia");
		}
	public void Atualizar(Produto produto){
		System.out.println("Função de atualizar");
	}
	public void Excluir(Produto produto){
		System.out.println("Metodo de excluir");
	} 
	public Produto listar(Produto produto){
		return produto;
	}
}