
package projetodascanetas;
import java.util.Scanner;

public class ProjetoDasCanetas {

    public static void main(String[] args) {
        // TODO code application logic here);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantas canetas vc dezeja add ao seu vetor!");
        System.out.print("Quantidade: ");
        int quantidade;
        
        quantidade = sc.nextInt();
        
        Lista canetas = new Lista(quantidade);
        
        
        System.out.println("Agora que vc definiu o tamanho máximo do vetor vc ja pode add canetas no seu vetor");
        String cor;
        int op = 1;
        do{
            sc.nextLine();
            cor = sc.nextLine(); 
            canetas.addCaneta(cor);
            
            System.out.print("Digite != de 0 para add mais uma caneta: ");
            op = sc.nextInt();
        }while(op != 0);
        canetas.imprimir();
        
        sc.close();
    }
    
}
