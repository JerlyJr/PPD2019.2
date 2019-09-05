public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(){

    }
    public Conta(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean testarSaldo(double valor){
        if (this.saldo < valor){
            System.out.println("saldo insuficiente");
            return false;
        }return true;
    }

    public void  sacar(double valor){
        if (testarSaldo(valor)== true){
            this.saldo -= valor;
        }else{
            System.out.println("Não posso sacar essa quantia");
        }

    }
    public void calculaRendimento(){
        this.saldo = this.saldo * 1.00;

    }
}
