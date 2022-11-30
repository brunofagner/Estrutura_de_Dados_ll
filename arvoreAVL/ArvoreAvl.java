import java.util.ArrayList;

public class ArvoreAvl {

	NoAvl raiz;

	public void inserir(int k) {
		NoAvl n = new NoAvl(k);
		inserirAVL(this.raiz, n);
	}

	public void inserirAVL(NoAvl aComparar, NoAvl aInserir) {

		if (aComparar == null) {
			this.raiz = aInserir;

		} else {

			if (aInserir.chave < aComparar.chave) {

				if (aComparar.esquerda == null) {
					aComparar.esquerda = aInserir;
					aInserir.pai = aComparar;
					verificarBalanceamento(aComparar);

				} else {
					inserirAVL(aComparar.esquerda, aInserir);
				}

			} else if (aInserir.chave > aComparar.chave) {

				if (aComparar.direita == null) {
					aComparar.direita = aInserir;
					aInserir.pai = aComparar;
					verificarBalanceamento(aComparar);

				} else {
					inserirAVL(aComparar.direita, aInserir);
				}

			} else {
				// O nó já existe
			}
		}
	}

	public void verificarBalanceamento(NoAvl atual) {
		setBalanceamento(atual);
		int balanceamento = atual.balanceamento;

		if (balanceamento == -2) {

			if (altura(atual.esquerda.esquerda) >= altura(atual.esquerda.direita)) {
				atual = rotacaoDireita(atual);

			} else {
				atual = duplaRotacaoEsquerdaDireita(atual);
			}

		} else if (balanceamento == 2) {

			if (altura(atual.direita.direita) >= altura(atual.direita.esquerda)) {
				atual = rotacaoEsquerda(atual);

			} else {
				atual = duplaRotacaoDireitaEsquerda(atual);
			}
		}

		if (atual.pai != null) {
			verificarBalanceamento(atual.pai);
		} else {
			this.raiz = atual;
		}
	}

	public void remover(int k) {
		removerAVL(this.raiz, k);
	}

	public void removerAVL(NoAvl atual, int k) {
		if (atual == null) {
			return;

		} else {

			if (atual.chave > k) {
				removerAVL(atual.esquerda, k);

			} else if (atual.chave < k) {
				removerAVL(atual.direita, k);

			} else if (atual.chave == k) {
				removerNoAvlEncontrado(atual);
			}
		}
	}

	public void removerNoAvlEncontrado(NoAvl aRemover) {
		NoAvl r;

		if (aRemover.esquerda == null || aRemover.direita == null) {

			if (aRemover.pai == null) {
				this.raiz = null;
				aRemover = null;
				return;
			}
			r = aRemover;

		} else {
			r = sucessor(aRemover);
			aRemover.chave = r.chave;
		}

		NoAvl p;
		if (r.esquerda != null) {
			p = r.esquerda;
		} else {
			p = r.direita;
		}

		if (p != null) {
			p.pai = r.pai;
		}

		if (r.pai == null) {
			this.raiz = p;
		} else {
			if (r == r.pai.esquerda) {
				r.pai.esquerda = p;
			} else {
				r.pai.direita = p;
			}
			verificarBalanceamento(r.pai);
		}
		r = null;
	}

	public NoAvl rotacaoEsquerda(NoAvl inicial) {

		NoAvl direita = inicial.direita;
		direita.pai = inicial.pai;

		inicial.direita = direita.esquerda;

		if (inicial.direita != null) {
			inicial.direita.pai = inicial;
		}

		direita.esquerda = inicial;
		inicial.pai = direita;

		if (direita.pai != null) {

			if (direita.pai.direita == inicial) {
				direita.pai.direita = direita;

			} else if (direita.pai.esquerda == inicial) {
				direita.pai.esquerda = direita;
			}
		}

		setBalanceamento(inicial);
		setBalanceamento(direita);

		return direita;
	}

	public NoAvl rotacaoDireita(NoAvl inicial) {

		NoAvl esquerda = inicial.esquerda;
		esquerda.pai = inicial.pai;

		inicial.esquerda = esquerda.direita;

		if (inicial.esquerda != null) {
			inicial.esquerda.pai = inicial;
		}

		esquerda.direita = inicial;
		inicial.pai = esquerda;

		if (esquerda.pai != null) {

			if (esquerda.pai.direita == inicial) {
				esquerda.pai.direita = esquerda;

			} else if (esquerda.pai.esquerda == inicial) {
				esquerda.pai.esquerda = esquerda;
			}
		}

		setBalanceamento(inicial);
		setBalanceamento(esquerda);

		return esquerda;
	}

	public NoAvl duplaRotacaoEsquerdaDireita(NoAvl inicial) {
		inicial.esquerda = rotacaoEsquerda(inicial.esquerda);
		return rotacaoDireita(inicial);
	}

	public NoAvl duplaRotacaoDireitaEsquerda(NoAvl inicial) {
		inicial.direita = rotacaoDireita(inicial.direita);
		return rotacaoEsquerda(inicial);
	}

	public NoAvl sucessor(NoAvl q) {
		if (q.direita != null) {
			NoAvl r = q.direita;
			while (r.esquerda != null) {
				r = r.esquerda;
			}
			return r;
		} else {
			NoAvl p = q.pai;
			while (p != null && q == p.direita) {
				q = p;
				p = q.pai;
			}
			return p;
		}
	}

	private int altura(NoAvl atual) {
		if (atual == null) {
			return -1;
		}

		if (atual.esquerda == null && atual.direita == null) {
			return 0;

		} else if (atual.esquerda == null) {
			return 1 + altura(atual.direita);

		} else if (atual.direita == null) {
			return 1 + altura(atual.esquerda);

		} else {
			return 1 + Math.max(altura(atual.esquerda), altura(atual.direita));
		}
	}

	private void setBalanceamento(NoAvl no) {
		no.balanceamento = altura(no.direita) - altura(no.esquerda);
	}

	final protected ArrayList<NoAvl> inorder() {
		ArrayList<NoAvl> ret = new ArrayList<NoAvl>();
		inorder(raiz, ret);
		return ret;
	}

	final protected void inorder(NoAvl no, ArrayList<NoAvl> lista) {
		if (no == null) {
			return;
		}
		inorder(no.esquerda, lista);
		lista.add(no);
		inorder(no.direita, lista);
	}

	public void imprmirEmOrdem(NoAvl node) {
		if (node != null) {
		    imprmirEmOrdem(node.esquerda);
		    System.out.print(" " + node.chave);
		    imprmirEmOrdem(node.direita);
		}
	  }
    
	  public void imprimirPreOrdem(NoAvl node) {
		if (node != null) {
		    System.out.print(" " + node.chave);
		    imprimirPreOrdem(node.esquerda);
		    imprimirPreOrdem(node.direita);
		}
	  }
    
	  public void imprimirPosOrdem(NoAvl node) {
		if (node != null) {
		    imprimirPosOrdem(node.esquerda);
		    imprimirPosOrdem(node.direita);
		    System.out.print(" " + node.chave);
		}
	  }
}