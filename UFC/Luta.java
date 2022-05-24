package aula7Luta;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria()==(l2.getCategoria())){
            this.aprovado = true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println ("Lutadores de categorias diferentes,impossibilitado dá luta acontecer.");
        }
    }
    public void luta() {
        if (this.aprovado == true) {
            System.out.println("#######DESAFIADO#######");
            this.desafiado.apresentar();
            System.out.println("#######DESAFIANTE#######");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("============RESULTADO DA LUTA=============");
            switch (vencedor) {
                case 0:
                    System.out.println("Vitória do: " +this.desafiado.getNome());
                    this.desafiado.getVitorias();
                    this.desafiante.getDerrotas();
                    break;
                case 1:
                    System.out.println("Vitória do : " + this.desafiante.getNome());
                    this.desafiante.getVitorias();
                    this.desafiado.getDerrotas();
                    break;
                case 2:
                    System.out.println(this.desafiado.getNome() + " e " + this.desafiante.getNome() + " Empatarma.");
                    this.desafiado.getEmpates();
                    this.desafiante.getEmpates();
                    break;
            }
            System.out.println("=====================");
        } else {
            System.out.println("A luta não irá acontecer.");
        }
    }
}
