
package projetodascanetas;

public class Caneta implements Comparable<Caneta>{
    private String cor; 
    
    public Caneta (String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }   

    @Override
    public String toString() {
        return cor;
    }
    
    
    /**
     *
     * @param t
     * @return
     */
    @Override
    public int compareTo(Caneta t) {
        return this.cor.compareTo(t.getCor());
    }
}
