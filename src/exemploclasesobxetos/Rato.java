
package exemploclasesobxetos;


public class Rato {
    private String tipo;
    private Mouse mouse;
    public Rato() {
    }

    public Rato(String tipo,Mouse mouse) {
        this.tipo = tipo;
        this.mouse=mouse;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Tipo=" + tipo + ", Mouse= "+mouse;
    }
    
}
