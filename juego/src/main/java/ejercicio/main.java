package ejercicio;

public class main {


    public static void main (String args []){
        Juego juego = new Juego(5);
        System.out.println(juego.getVidasJugador());
        juego.quitaVidas();
        juego.actualizarRecord();
        System.out.println(juego.getVidasJugador());
        juego.actualizarRecord();

    }
}
