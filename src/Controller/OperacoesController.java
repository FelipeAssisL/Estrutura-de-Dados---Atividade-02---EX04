package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
    public int Contagem(int n, int digito) {
        if (n == 0) { // PARADA QUANDO N FOR IGUAL A 0
            return 0;
        }
        int digitofim = n % 10;
        if (digitofim == digito) { // CASO O RESTO DA DIVISÃO SEJA IGUAL AO DIGITO RETORNA 1 SOMADO A FUNÇÃO COM N/10 COMO PARAMETRO
            return 1 + Contagem(n/10, digito);
        } else {
            return Contagem(n/10, digito); // CASO CONTRARIO RETORNA APENAS A FUNÇÃO COM N/10 COMO PARAMETRO
        }
    }
}

