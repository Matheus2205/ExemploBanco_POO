public class ContaCorrente extends Conta {  // usar chave extends e nome da classe mãe

    private double limite;

        public ContaCorrente(int numero, double saldo, double limite) { // herdou as variaveis "numero" e "saldo" da classe mãe
        super(numero, saldo); // referencia o construtor da classe mae
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double consultaSaldoTotal(){ // retorna o quanto tenho na conta: saldo + limite
            return getSaldo() + getLimite(); //pode ser usado o this.limite
    }


}
