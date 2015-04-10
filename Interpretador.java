/* Nome : Interpretador.java
 * Autores: Emerson Martins  <emer-martins@hotmail.com>
 * 			Leonardo Vargas  <leu1607@hotmail.com>
 * Versão: 1.0
 * Descrição: Classe Main da Toon World, linguagem baseada em java.*/

class Interpretador{
    private String linhas[];
	public Inteiro [] vetor1;
	public Double [] vetor2;
	public Stringg [] vetor3;
	
	Inteiro novo1;
	Double novo2;
	Stringg novo3;
	//novo1 = new Inteiro();
	//novo2 = new Double();
	//novo3 = new Stringg();
			
	public Interpretador() {
		vetor1 = new Inteiro [100];
		vetor2 = new Double [100];
		vetor3 = new Stringg [50];
	}
	
	public void VerificarConteudo(String linha){
		int i,j,k,x;
		char [] nome;
		nome = new char [20];
		char [] copia = linha.toCharArray();
		String teste;
		if(linha.contains("main")){
			return;
		}else if(linha.contains("int")){
			if(linha.contains("<-")){
				//fazer
			}else{
				for(i=0;i<linha.length();i++){
					if(linha.charAt(i) ==' ' && linha.charAt(i-1) == 't'){
						for(k=i,j=0;j<(linha.length()-i);k++){
							if(copia[k]==' ' || copia[k]== '?'){
								continue;
							}else{
								nome[j] = copia[k];
								j++;
								//teste = copia.toString();
								System.out.println(nome);
							}
						}
					}
				}
			}
		}
	}
	
	
	
    public void interpreta(String l[]) {
        this.linhas = l;
		
		for(int i = 0; i < this.linhas.length; i++) {
            if(this.linhas[i] != null) {
				for(int x = 0; x < linhas[i].length(); x++ ){
					if(linhas[i].charAt(x) == '-' || linhas[i].charAt(x) == '+' || linhas[i].charAt(x) == '/' || linhas[i].charAt(x) == '*'){
						Operacao OP = new Operacao();
						OP.setA(linhas[i].charAt(x-1) - 48);
						OP.setB(linhas[i].charAt(x+1) - 48);
						if (linhas[i].charAt(x) == '-'){
							OP.Sub();
						} else if (linhas[i].charAt(x) == '+') {
							OP.Soma();
						} else if (linhas[i].charAt(x) == '/') {
							OP.Div();
						} else if (linhas[i].charAt(x) == '*') {
							OP.Mult();
						}
						System.out.println("Oh resultado da op eh: " + OP.Result);
					}	
				}
            }
        }
		
        for(int i = 0; i < this.linhas.length; i++) {
            int x = 0;
            if(this.linhas[i] != null) {
				//System.out.println("entrou aqui1");
				//aqui a magica acontece! (ou não!)
				while(linhas[i].charAt(x) != '?' || linhas[i].charAt(x) != '['){
					VerificarConteudo(linhas[i]);
					break;
					//System.out.println("entrou aqui2");
					/*if(linhas[i].charAt(x) == '<' && linhas[i].charAt(x+1) == '-'){
						//atribuição
						System.out.println("entrou aqui3");
						System.out.println(" " + linhas[i].length());
						break;
					}else if(linhas[i].charAt(x) == '<' && linhas[i].charAt(x+1) == '<'){
						//comparaçao menor
					}else if(linhas[i].charAt(x) == '>' && linhas[i].charAt(x+1) == '>'){
						//comparaçao maior
					}else if(linhas[i].charAt(x) == '<' && linhas[i].charAt(x+1) == '|'){
						//comparaçao menor igual
					}else if(linhas[i].charAt(x) == '>' && linhas[i].charAt(x+1) == '|'){
						//comparaçao maior igual
					}else if(linhas[i].charAt(x) == '|' && linhas[i].charAt(x+1) == '=' && linhas[i].charAt(x+2) == '|'){
						//igual
					}else if(linhas[i].charAt(x) == '=' && linhas[i].charAt(x+1) == '|' && linhas[i].charAt(x+2) == '='){
						//diferente
						System.out.println(" " + linhas[i].length());
						break;
					}else if(linhas[i].charAt(x) == '+' && linhas[i].charAt(x+1) == '='){
						//i++
					}else if(linhas[i].charAt(x) == '-' && linhas[i].charAt(x+1) == '='){
						//i--
					}else{
						//é uma linha de "escopo"
						x++;
					}*/
				}
			}
		}
	}
}