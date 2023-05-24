public class Personaggio{

	private String nome;	

  private Classe classe;

	private Razza razza;

	private Statistiche stastistiche;

	public Personaggio(String nome, Classe classe, Razza razza){

	this.nome=nome;

	this.classe=classe;

	this.razza=razza;

	this.statisiche=statistiche.statisticheAllaCreazione(classe, razza);

	}

}
