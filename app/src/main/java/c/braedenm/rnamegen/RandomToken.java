package c.braedenm.rnamegen;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Braeden on 2017.12.13.
 * @version 1.0
 */

class RandomToken {
    private ArrayList<String> tokens;
    private Random rng;

    RandomToken(InputStream stream){
        tokens = new ArrayList<>();
        Scanner parser = new Scanner(stream);
        rng = new Random();

        while (parser.hasNext()) {
            tokens.add(parser.next());
        }
    }

    String get() {
        return tokens.get(rng.nextInt(tokens.size()));
    }
}
