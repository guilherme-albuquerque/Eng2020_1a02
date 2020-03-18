package ex_2_3;

public class DigitarArq extends DigitarLog {
    protected FerramentaLog criarFerramentaLog() {
        return new FerramentaArq();
    }
}
