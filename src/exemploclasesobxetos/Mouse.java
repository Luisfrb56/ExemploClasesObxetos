
package exemploclasesobxetos;


public class Mouse {
    private String movemento;

    public Mouse() {
    }

    public Mouse(String movemento) {
        this.movemento = movemento;
    }

    public String getMovemento() {
        return movemento;
    }

    public void setMovemento(String movemento) {
        this.movemento = movemento;
    }

    @Override
    public String toString() {
        return "Movemento=" + movemento ;
    }
    
}
