public class PlataformaTaTeTi {
    public static void main(String[] args){
        Tateti t1=new Tateti();
        t1.generarTablero();

        t1.mostarTablero();

        Jugador j1=new Jugador("X","Pedro",t1);
        Jugador j2=new Jugador("O","Juan",t1);

        boolean gan=false;
        while(gan==false){
            j1.jugar();
            t1.mostarTablero();
            if(!(gan=t1.hayTateti())){
                j2.jugar();
                t1.mostarTablero();
                gan=t1.hayTateti();

            }
        }
        if(gan==true){
            System.out.println("Hay un ganador y es: "+t1.getFichaGan());
        }


    }
}
