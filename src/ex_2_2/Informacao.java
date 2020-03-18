package ex_2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Informacao {
    protected abstract String recuperarInfo();

    public void exibiInfo(){
        System.out.println(recuperarInfo());
    }
    protected Scanner novoScanner(File arquivo){
        try{
            return new Scanner(arquivo);
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não obtido" + arquivo.getPath());
            System.exit(1);

        }
        return null;
    }
}
