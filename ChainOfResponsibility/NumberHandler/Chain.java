package ChainOfResponsibility.NumberHandler;

public interface Chain {
    void setNext(Chain c);
    void process(Num request);
}
