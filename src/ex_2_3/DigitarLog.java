package ex_2_3;


public abstract class DigitarLog {
    private FerramentaLog log;

    protected abstract FerramentaLog criarFerramentaLog();

    public void digitarLog(String mensagem) {
        if (log == null)
            log = criarFerramentaLog();
        log.registrarLog(mensagem);
    }
}
