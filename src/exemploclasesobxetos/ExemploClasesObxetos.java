
package exemploclasesobxetos;


public class ExemploClasesObxetos {


    public static void main(String[] args) {
        Cpu cpu1=new Cpu(2000,1000);
        Pantalla pant1=new Pantalla("Philips",15.5F);
        Rato rato1=new Rato("Con cable",new Mouse("Con laser"));
        Ordenador ord=new Ordenador(cpu1,pant1,rato1);
        System.out.println(ord.toString());
        
        Ordenador ord2=new Ordenador(new Cpu(2500,2000),new Pantalla("Samsung",17.2F),new Rato("Sen cable",new Mouse("Con roda")));
        System.out.println(ord2.toString());
        //Modificamos la velocidad de procesador del ordenador 1
        //cpu1.setVelocidade(5000);
        //System.out.println(ord.toString());
        ord.getProcesador().setVelocidade(5000);
        System.out.println(ord.toString());
        //Visualizar la marca de la pantalla del segundo ordenador
        System.out.println(ord2.getPantalla().getMarca());
        //Creamos un ordeador con contructor por defecto y luego metemos valores.
        Ordenador ord3=new Ordenador();
        System.out.println(ord3.toString());
        ord3.getProcesador().setVelocidade(3000);
        ord3.getProcesador().setMemoria(1500);
        ord3.getPantalla().setMarca("Asus");
        ord3.getPantalla().setPulgadas(13.2F);
        ord3.getRato().setTipo("sen cables");
        System.out.println(ord3.toString());
    }
    
}
