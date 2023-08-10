package patterns.behavioral_patterns.chain_of_responsibility;

public class DollarDispenser20 implements DispencerChain {

    private DispencerChain chain;

    @Override
    public void setNextChain(DispencerChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if(remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(currency);
        }
    }
}
