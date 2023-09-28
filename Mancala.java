public class Mancala {

    private int[] gameboard = new int[14];
    
    private static final int P1_TROUGH = 6;
    private static final int P2_TROUGH = 13;

    public Mancala() {
        for (int i = 0; i < gameboard.length; i++) {
            gameboard[i] = 4;
        }
        gameboard[P1_TROUGH] = 0;
        gameboard[P2_TROUGH] = 0;
    }

    public Mancala(Mancala prevState) {
        
    }



}