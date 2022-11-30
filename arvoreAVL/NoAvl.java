public class NoAvl {
  
	NoAvl esquerda;
	NoAvl direita;
	NoAvl pai;
	int chave;
	int balanceamento;

	public NoAvl(int chave) {
		this.pai = null;
		this.direita = null;
		this.esquerda = null;
		balanceamento = 0;
		this.chave = chave;
	}

	public String toString() {
		return Integer.toString(chave);
	}
}