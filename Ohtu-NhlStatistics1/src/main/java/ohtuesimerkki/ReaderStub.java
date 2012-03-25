package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JKosk2
 */
public class ReaderStub implements Reader{
    Reader readerStub;
    public ReaderStub(){
        
    }
    public List<Player> getPlayers(){
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Semenko", "EDM", 4, 12));
        players.add(new Player("Lemieux", "PIT", 45, 54));             
        players.add(new Player("Kurri",   "EDM", 37, 53));             
        players.add(new Player("Yzerman", "DET", 42, 56));             
        players.add(new Player("Gretzky", "EDM", 35, 89)); 
        return players;
    }
}
