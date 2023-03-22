public class Conta {

    //atributos
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) { // criando o construtor alt + insert
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() { //  mostrar o saldo
        return saldo;
    }

    public void setNumero(int numero) { // alterar ou atualizar
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){ //metodo
        if (valor <=this.saldo)
          this.saldo = this.saldo - valor;
    }

    public void depositar(double valor){ //metodo
        this.saldo = this.saldo + valor;
    }


}
