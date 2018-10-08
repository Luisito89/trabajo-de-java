
package utcd1;

public class Utcd1 {
    
    public static void ejercicio1(){
        cuenta c1=new cuenta("Juanito");
        cuenta c2=new cuenta("Estela",300);
        //Ingresa dinero en las cuentas//
        c1.ingresar(1000);
        c2.ingresar(400);
        //Retiramos dinero de las cunetas//
        c1.retirar(1500);
        c2.retirar(100);
        //VER ESTADO DE CUENTAS
        System.out.println(c1);
        System.out.println(c2);
    }

    public static void main(String[] args) {
       ejercicio1();
        System.out.println("Hola mundo");
    }
    
    
    
}
