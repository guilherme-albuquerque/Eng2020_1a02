package ex_2_2;

import java.io.File;
import java.util.Scanner;


public class Confidencial extends Informacao {



    protected String recuperarInfo(){
        String pacote = getClass().getPackage().getName().toString().replace('.','/');

        File arquivo = ResourceUtils.getResourceAsFile(pacote +"/condifencial.txt");

        StringBuffer buffer = new StringBuffer();

        Scanner scanner = novoScanner(arquivo);
        while (scanner.hasNextLine()) {
            buffer.append(scanner.nextLine());
            buffer.append("\n");
        }
        scanner.close();
        return  buffer.toString();
        }
    }

