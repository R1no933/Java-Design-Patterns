package patterns.behavioral_patterns.chain_of_responsibility;
//hui pizda dgigurda
import java.util.Scanner;

public class ChainRunner {

    private DispencerChain firstChain;

    public ChainRunner() {
        this.firstChain = new DollarDispenser50();
        DispencerChain secondChain = new DollarDispenser20();
        DispencerChain thirdChain = new DollarDispencer10();

        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);
    }

    public static void main(String[] args) {
        ChainRunner runner = new ChainRunner();
        while (true) {
            int amount = 0;
            System.out.println("Enter your amount:");
            Scanner inputAmount = new Scanner(System.in);
            amount = inputAmount.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be multiple of 10");
                return;
            }

            runner.firstChain.dispense(new Currency(amount));
        }
    }
}
