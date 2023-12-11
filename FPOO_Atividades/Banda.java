package atividade_heloa_goularte;

import java.util.List;

public class Banda {
		private String nome;
		private List<MembroBanda> membros;

		Banda() {
		}
		
		Banda(String nm, List<MembroBanda> mbr) {
			this.nome = nm;
			this.membros = mbr;
		}

		public String getNome() {
			return this.nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
	}
		

		public List<MembroBanda> getMembros() {
			return this.membros;
		}
		public void setMembros (List<MembroBanda> membros) {
			this.membros= membros;
	}

		public void AdicionarMembro() {
		}
		
		public void RealizarShow() {
			System.out.println("A banda começou a tocar!!");
		}
	}
