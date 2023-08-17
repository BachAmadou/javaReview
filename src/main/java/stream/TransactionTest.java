package stream;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        // 1 - Find all transactions in 2011 and sort by value
        System.out.println("********* Task 1 ***********");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(TraderTransaction::getValue))
                .forEach(System.out::println);

        // 2 - What are all the unique cities where the traders work?
        System.out.println("********* Task 2 ***********");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        // 3 - Find all traders from Laval and sort them by name
        System.out.println("********* Task 3 ***********");
        TransactionData.getAll().stream()
                .map(TraderTransaction::getTrader)
                .filter(trader -> trader.getCity().equals("Laval"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        // 4 - Return a string of all trader's names sorted alphabetically
        System.out.println("********* Task 4 ***********");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce(" ", (name1, name2) -> name1 + name2 + " ");
        System.out.println(result);

        // 5 - Are any traders base in Montreal
        System.out.println("********* Task 5 ***********");
        boolean city = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Montreal"));
        System.out.println(city);

        // 6 - Print the values of all transactions from the traders living in Laval
        System.out.println("********* Task 6 ***********");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Laval"))
                .map(TraderTransaction::getValue)
                .forEach(System.out::println);

        // 7 - What is the highest value of all the transactions
        System.out.println("********* Task 7 ***********");
        Optional<Integer> high = TransactionData.getAll().stream()
                .map(TraderTransaction::getValue)
                .reduce(Integer::max);
        System.out.println(high);

        // 8 - Find the transaction with the smallest value
        System.out.println("********* Task 8 ***********");
        Optional<TraderTransaction> smValue = TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smValue.get());

        // Another method
        Optional<TraderTransaction> smallValue = TransactionData.getAll().stream()
                .min(comparing(TraderTransaction::getValue));
        System.out.println(smallValue.get());


    }
}













