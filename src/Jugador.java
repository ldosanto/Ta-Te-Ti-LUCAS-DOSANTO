import java.util.Scanner;

public class Jugador {
    private String ficha;
    private String nombre;
    private Tateti t;

    public void jugar(){
        int f=0; int c=0;
        Scanner s= new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 9"+" jugador "+ficha);
        int j = s.nextInt();
        switch(j){
            default: System.out.print("valor incorrecto");break;
            case 7: f=0;c=0;break;
            case 8: f=0;c=1;break;
            case 9: f=0;c=2;break;

            case 4: f=1;c=0;break;
            case 5: f=1;c=1;break;
            case 6: f=1;c=2;break;

            case 1: f=2;c=0;break;
            case 2: f=2;c=1;break;
            case 3: f=2;c=2;break;
        }
        if (t.ponerFicha(f,c,ficha)==false){
            System.out.println("Jugada incorrecta, pierde turno");
        }

    }
    Jugador(String ficha,String nombre, Tateti t){
        this.ficha=ficha;
        this.nombre=nombre;
        this.t=t;
    }
}
