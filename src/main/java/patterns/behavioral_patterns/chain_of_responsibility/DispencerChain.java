package patterns.behavioral_patterns.chain_of_responsibility;

public interface DispencerChain {

    void setNextChain(DispencerChain nextChain);

    void dispense(Currency currency);
}
