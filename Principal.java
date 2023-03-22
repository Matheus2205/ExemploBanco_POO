import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        int numero;
        double saldo, limite, rendimento;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupanca<3>Sair\n"));
        switch (opcao){
            case 1:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                limite = Double.parseDouble(JOptionPane.showInputDialog("Limite:"));
                ContaCorrente cc1 = new ContaCorrente(numero, saldo, limite); // criando o objeto
                JOptionPane.showMessageDialog(null, "Saldo:"+cc1.getSaldo() +"\nSaldo com o limite: "+cc1.consultaSaldoTotal(),"Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento:"));
                ContaPoupanca cp1 = new ContaPoupanca(numero, saldo, rendimento); // criando o objeto
                cp1.atualizaRendimento();
                JOptionPane.showMessageDialog(null, "Saldo: "+cp1.getSaldo(),"Conta Poupanca", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null,"Escolha invalida","Erro",JOptionPane.ERROR);
        }


    }


}
