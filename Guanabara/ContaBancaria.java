package javaapplication2;                                      //aula05.2

public class Conta {

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldo;
    private boolean status;

    //métodos personalizados;
    public void estadoAtual() {
        System.out.println("Conta " + this.getNumConta());
        System.out.println("TIpo conta" + this.getTipoConta());
        System.out.println("Status da conta " + this.getStatus());
        System.out.println("O saldo da conta " + this.getSaldo());
        System.out.println("O dono da conta " + this.getDonoConta());
    }

    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatus(true);
        if (t == "CC ") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        this.setStatus(true);
        if (this.getSaldo() > 0) {
            //Não pode fechar a conta por ainda ter dinheiro;
        } else if (this.getSaldo() <= 0) {
            //não pode fechar a conta pois o saldo está negativo;
        } else {
            this.setStatus(false);
            //A conta será fechada com êxito;
        }
    }

    public void depositar(double v) {

        if (getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            //Deposito realizado com sucesso!
        } else {
            //impossível depositar se a conta não está aberta;
        }
    }

    public void sacar(double saque) {
        if (getStatus()) {
            if (this.saldo > saque) {
                //this.saldo = this.saldo - saque;
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque efetuado com sucesso!");
            } else {
                //Não tem todo esse dinheiro na conta;
            }
        } else {
            //A conta está fechada;
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!" + this.getDonoConta());
        } else {
            //Não dá para pagar a conta se ela n estiver aberta;
        }
    }

    public Conta(String donoConta,int numConta,boolean status, String tipoConta,double saldo) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.setSaldo(0);
        this.setStatus(false);

        this.donoConta = donoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

}

package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setDonoConta("jubilosca apenas");
        p1.setNumConta(101010);
        p1.setStatus(true);
    }
    
}
