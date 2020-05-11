
public class Diretor {
	private String nome;
	private String DataDeNascimento;
	public static void manin (String [] args) {
		
		Diretor diretor = new Diretor();
		diretor.setNome("Jonas");
		diretor.setDataDeNascimento("07/04/1990");
		
	}
	public String getNome() {
		this.nome = "Jonas";
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		this.DataDeNascimento = "07/04/1990";
		return DataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}
}