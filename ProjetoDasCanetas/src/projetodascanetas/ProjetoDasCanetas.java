
package projetodascanetas;
import java.util.Scanner;
import java.util.Arrays;
public class ProjetoDasCanetas {

    public static void main(String[] args) {
        // TODO code application logic here);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho máximo do vetor de canetas!");
        System.out.print("Max: ");
        int max;
        
        max = sc.nextInt();
        
        Lista canetas = new Lista(max);        
        
        String cor;
        int op;
        do{
            System.out.printf("Digite!%n"
                    + "1 adcionar caneta.%n"
                    + "2 para selecionar uma caneta do vetor.%n"
                    + "3 para ordenar vetor.%n"
                    + "4 para imprimir vetor.%n"
                    + "5 para enserrar programa.%n");
            op = sc.nextInt();
            switch(op){
                case 1://adcionar caneta
                    sc.nextLine();
                    cor = sc.nextLine(); 
                    canetas.addCaneta(cor);
                break;
                case 2://para selecionar uma caneta do vetor
                    int pos;
                    System.out.print("Digite Posição de retorno: ");
                    pos = sc.nextInt();
                    
                    System.err.println("#"+ pos + ": " + canetas.retornaItem(pos));
                break;
                case 3://para ordenar vetor
                    canetas.ordenar();//O vetor só será ordenado caso todas as posições dele estiverem ocupadas
                break;
                case 4://para imprimir vetor
                    canetas.imprimir();
                break;
                default:
                    System.out.println("Este não é um dia válido!");                    
            }           
        }while(op != 5);
        
        
        sc.close();
    }
    
}
