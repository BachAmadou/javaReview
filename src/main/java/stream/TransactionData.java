package stream;

import java.util.Arrays;
import java.util.List;

public class TransactionData {
    public static List<TraderTransaction> getAll() {
        Trader Bob = new Trader("Bob", "Montreal");
        Trader Bach = new Trader("Bach", "Laval");
        Trader Ben = new Trader("Ben", "Laval");
        Trader Meth = new Trader("Meth", "Sherbrooke");
        return Arrays.asList(
                new TraderTransaction(Meth, 2011, 300),
                new TraderTransaction(Bob, 2012, 400),
                new TraderTransaction(Bach, 2020, 900),
                new TraderTransaction(Ben, 2018, 1000),
                new TraderTransaction(Meth, 2012, 600),
                new TraderTransaction(Bach, 2011, 200)
        );

    }
}















