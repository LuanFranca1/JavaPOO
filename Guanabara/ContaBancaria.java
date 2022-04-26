package aula05;

public class Secundaria {

    public int numConta;
    private char abrirConta;
    private String donoConta;
    private double saldo = 0;
    private boolean status = falso;
    public Secundaria(int numConta, String abrirConta, String donoConta, double saldo, boolean status) {
        this.numConta = numConta;
        this.abrirConta = abrirConta;
        this.donoConta = donoConta;
        this.saldo = saldo;
        this.status = status;
    }
    public void setAbrirConta(char abrirConta) {
        this.abrirConta = abrirConta;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getDonoConta() {
        return donoConta;
    }
    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public char getAbrirConta() {
        this.setAbrirConta(t);
        this.setStatus(true);
        if (t == "CC") {
            saldo = 50; //setsaldo(50);
        } else if (t == "CP") {
            saldo = 150;
        }
        return this.abrirConta;
    }
    public char getFecharConta() {
        if (saldo > 0) {
            //Aconta ainda tem saldo;
        } else if (saldo < 0) {
            //não pode fechar a conta
        } else if (saldo == 0) {
            //está apto a fechar a conta;
        }
    }
    public boolean depositar(double dinheiro) {
        if (status == true) {
            setSaldo(getSaldo() + dinheiro);
        } else {
            //IMpossível depositar se a conta n estiver aberta
        }
        return this.saldo;
    }
    public double saldo(double dinheiro) {
        if (stauts == true) {
            if (saldo > dinheiro) {
                saldo = saldo - dinheiro;
            }
        } else {
            //não tem como tirar dinheir se essa porra for falsa;
        }
        return this.saldo;
    }
    public double PagarMensalidade(char t) {
        double valor;
        if (t == "CC") {
            valor = 12;
        } else if(t="CP") {
            valor = 20;
        }
        if(status=true) {
            if(saldo>valor){
                saldo = saldo - valor;
        }else if(saldo <= 0) {
            }else  {
                //impossível pagar se a conta n está aberta;
            }
            }
        return ;
    }
}
package aula05;

public class Principal {
    public static void main(String[]args){
        Secundaria c1 = new Secundaria();
        c1.status = true;
    }
}

