package ejercicio;

public class Juego {
    private int vidasJugador;
    private int vidasIniciales ;
    private int record = 0;
    private boolean siQuedanMasVidas;


    public Juego(int vidasJugador) {
        this.vidasJugador = vidasJugador;
        this.vidasIniciales = vidasJugador;
    }


    public int getVidasJugador() {
        return vidasJugador;
    }

    public boolean quitaVidas(){
        if (vidasJugador <= 0){
           siQuedanMasVidas = false;
           System.out.println("juego terminado");
        }else {
            siQuedanMasVidas = true;
            vidasJugador = vidasJugador -1;
        }
        return  siQuedanMasVidas;
    }

    public void actualizarRecord(){
        if(vidasJugador > record){
            record = vidasJugador;
            System.out.println("Haz superado el record");
        }else if(vidasJugador == record){
            System.out.println("Sigues teniendo el mismo record");
        }

    }

    public void reiniciaPartida(){
        this.vidasJugador = vidasIniciales;
    }

}
