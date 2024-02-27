import org.junit.Test;

public class ShufflerTest {

    @Test
    public void ShuffleTest() {
        Deck deck = new Deck();
        Shuffler shuffler = new Shuffler();
        shuffler.shuffleDeck(deck);
    }
}