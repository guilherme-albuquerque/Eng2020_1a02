package ex_2_2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog(null,"Qual é a senha malandrão?");

        if (senha.isEmpty()) {
            System.out.println("Digite a senha");
            System.exit(1);
        }

        Informacao informacao = ("designpatterns".equals((senha))? new Confidencial(): new Publico());
        informacao.exibiInfo();

    }


}
