package appdijkstra;

import java.util.Scanner;

public class AppDijkstra {

    public static void main(String[] args) {
        int MAX = 20;
        Scanner sc = new Scanner(System.in);
        Dijkstra dijkstra;
       
        int[][] grafo = new int[MAX][MAX];//inicializando e dando tamanho maximo para matriz
        int vertices, origem, destino;
       
        System.out.print("Digite o número de vertices do Grafo: ");
        vertices = sc.nextInt();
        if(vertices <= 0 || vertices > 20) {
            System.out.println("!Erro...Numero de Vertices precisa ser maior que 0 e menos que 20!");
       	}
        
        System.out.println("Insira a Matriz de Adjcencia!");
	for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
		grafo[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite");
        System.out.print("Origem: ");
        origem = sc.nextInt();
        System.out.print("Destino: ");
        destino = sc.nextInt();
        
        dijkstra = new Dijkstra(grafo,vertices,origem,destino);
        dijkstra.imprimeDijkstra();
        
        dijkstra.matrizDeCustos();
        dijkstra.inicializaDistanciaEVisitado();
        dijkstra.procuraMelhorCaminho();
        dijkstra.printaMenorDistanciaECaminho();
        
        
    sc.close();
    }   
    
}
