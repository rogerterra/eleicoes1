
import model.Candidato;
import controller.ControladorCandidato;
import model.CandidatoPesquisa;
import controller.ControladorCandidatoPesquisa;
import model.Pesquisa;
import controller.ControladorPesquisa;


public class Principal {
	
	public static void main(String[] args){
		
		Candidato();
		CandidatoPesquisa();
		Pesquisa();
	}	
	
	public static void Candidato() {
		
		Candidato c1 = new Candidato();
		c1.setId(1);
		c1.setNomeCandidato("João Cabeleira");
		c1.setPartidoCandidato("Barbeiro nunca");
		c1.setFichaLimpa("Não pode se candidatar");
		
		ControladorCandidato controlador = new ControladorCandidato();
		
		try {
			controlador.salvar(c1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Candidato c : controlador.listar()) {
			System.out.println(c.toString());
		}
		
		controlador.listar();
	}
	
	public static void CandidatoPesquisa() {
		
		CandidatoPesquisa cp1 = new CandidatoPesquisa();
		cp1.setId(1);
		cp1.setVotos(5000);
		
		ControladorCandidatoPesquisa controlador = new ControladorCandidatoPesquisa();
		
		try {
			controlador.salvar(cp1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (CandidatoPesquisa cp : controlador.listar()) {
			System.out.println(cp.toString());
		}
		
		controlador.listar();
		
	}
	
	public static void Pesquisa() {
		Pesquisa p1 = new Pesquisa();
		p1.setId(1);
		p1.setInstituto("");
		p1.setData("");
		p1.setLocalVoto("");
		p1.setMediaIdade(0);
		
		ControladorPesquisa controlador = new ControladorPesquisa();
		
		try {
			controlador.salvar(p1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (CandidatoPesquisa p : controlador.listar()) {
			System.out.println(p.toString());
		}
		
		controlador.listar();
	}
	
}
	
	