package ex_2_3;


public class DigitarLogCons extends DigitarLog {

    protected FerramentaLog criarFerramentaLog() {
        return new FerramentaLogCons();
    }
}
