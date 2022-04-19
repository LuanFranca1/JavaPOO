package aula2;
public class Aula02 {
    public static void main(String[]args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crystal";
        c1.cor ="Azul";
        // c1.ponta = 0.5;
        c1.carga = 80;
       // c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
package aula2;
public class Caneta {
    public String cor;
    public String modelo;
    private double ponta;
    protected int carga;
    private  boolean tampada;
    public void status() {
        System.out.print("\nA cor da caneta é " + this.cor);
        System.out.println(",ela está aberta? " + this.tampada);
        System.out.println("O tamanho da caneta é :" + this.ponta );
        System.out.println("O modelo é: " + this.modelo);
        System.out.println("Carga " + this.carga);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro!Não posso rabiscar.");
        } else {
            System.out.println("Posso rabiscar.");
        }
    }
        public void tampar() {
            this.tampada = true;
        }
        public void destampar() {
            this.tampada = false;
        }
    }
    /*void tamanho(){
        this.ponta=0.5;
    }*/

