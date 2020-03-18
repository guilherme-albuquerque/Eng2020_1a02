package ex_2_3;



import java.util.Date;

public class FerramentaLogCons extends FerramentaLog {

    public void registrarLog(String mensagem) {
        System.out.println(dateFormat.format(new Date(System.currentTimeMillis())) + mensagem);
    }
}
