/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdijkstra;

/**
 *
 * @author darlei
 */
public class Dijkstra {
    private int[][] custo;
    private int[] distancia,predecessor;  
    private boolean[] visitado;
    private int count,distanciaMinima, proximoVertice;
    private final int infinito = 99999999;
    private int origem,destino;
    
    /*
    *@Construtor, atribuo todos o valos às variáveis que serão utilizadas 
    */
    public Dijkstra(int[][] grafo,int vertices, int origem ,int destino) {
        this.custo = new int[vertices][vertices];
        for(int i = 0; i < custo.length; i++) {
		for(int j = 0; j < custo[i].length; j++) {
			this.custo[i][j] = grafo[i][j];
                }
        }
        
        this.destino = destino;
        this.origem = origem;
        this.distancia = new int[vertices];
        this.visitado = new boolean[vertices];
        this.predecessor = new int[vertices];
        
    }
    /*
    *Procura os caminhos que não são possiceis na matriz e joga os valores deles para infinio
    */
    public void matrizDeCustos(){
	
	for(int i = 0; i < custo.length; i++) {
		for(int j = 0; j < custo[i].length; j++) {
                    if(this.custo[i][j] == 0) { //joga o valor dos caminhos que não são possiveis para infinito
			this.custo[i][j] = infinito;
                    }
                }
        }
    }
    /*
    *Calcula as distancias para cada nó a partir da origem
    *Inicializa a variável visitado como 0 para cada nó ainda não visitado
    */
    public void inicializaDistanciaEVisitado(){
        // inicializa distancia[] e visitado[]
	for(int j = 0; j < this.custo.length; j++) {
		distancia[j] = custo[origem][j];
		predecessor[j] = origem;
		visitado[j] = false;
	}
	
	distancia[origem] = 0; // distancia do nó origem para ele mesmo
	visitado[origem] = true; // marcado como visitado para não ser incluso nos cálculos de menor caminho
	count = 1;
    }
    public void procuraMelhorCaminho(){
        while(count < this.custo.length - 1) {
		distanciaMinima = infinito;//inicializa distancia minima como 0 para usar nos calculos futuros
		
		//proximoVertice representa o nó de distância mínima
		for(int i = 0; i < this.custo.length; i++) {
			if((distancia[i] < distanciaMinima) && !visitado[i] ) {
                            
				distanciaMinima = distancia[i];
				proximoVertice = i;
			}
                }
			
		// marca o vertice seguinte como visitado			
		visitado[proximoVertice] = true;

		// verifica se existe um caminho menor 
		for(int i = 0; i < this.custo.length; i++) {
			if(!visitado[i]) {
				// se o vertice ainda não foi visitado, verifica se a distancia minima atual + custo da aresta é menor que a distancia até o proximo vertice
				if(distanciaMinima + custo[proximoVertice][i] < distancia[i]) {
					distancia[i] = distanciaMinima + custo[proximoVertice][i];
					predecessor[i] = proximoVertice;
					//  no fim desse laço, distancia[i] é a distancia ótima de um vertice origem até um vértice destino i
				}
            }
        }
        count++;
	}      
    }
    public void printaMenorDistanciaECaminho(){
            // printa a menor distância e o caminho que deve ser percorrido para se obter a mesma
            int j;
            for(int i = 0; i < this.custo.length; i++){
                
		if(i == destino) {
                    System.out.printf("Distancia minima entre os nos: %d", distancia[i]);
                    System.out.printf("\nCaminho: %d", i);
			
                    j = i;
                    do {
                            j = predecessor[j];
                        System.out.printf(" <- %d", j);

                    }while(j != origem);
                }
            }
            System.out.println();
        }
    
    
    public void imprimeDijkstra(){
        for(int i = 0; i < custo.length; i++) {
		for(int j = 0; j < custo[i].length; j++) {
                    
                    System.out.print(custo[i][j] + " ");
                }
            System.out.println(" ");
        }
    }
    
}
