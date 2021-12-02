package avaliacao.model;

import java.util.ArrayList;

import java.util.List;

public class SistemaDisciplinas {

		private List<Disciplina> disciplina = new ArrayList<Disciplina>();
	
		public void adicionar(Disciplina e) {
			disciplina.add(e);
		}
	
		public List<Disciplina> listarDisciplinas(){
			return disciplina;
		}
}
