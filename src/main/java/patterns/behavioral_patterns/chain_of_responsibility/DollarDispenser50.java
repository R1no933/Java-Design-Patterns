package patterns.behavioral_patterns.chain_of_responsibility;

public class DollarDispenser50 implements DispencerChain {

    private DispencerChain chain;

    @Override
    public void setNextChain(DispencerChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if(remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(currency);
        }
    }
}
