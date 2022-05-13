public class ControleRemoto implements SistemaControle {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;

    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar()
    {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("-------Menu-------");
        System.out.println("O controle está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("O volume está em: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i = i + 10) {
            System.out.print(" |");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechar menu!");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume!");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            setVolume(this.getVolume() - 5);
            System.out.println("Impossível diminuir o volume!");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(10);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() == true && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
        this.setTocando(false);
        }
    }
    @Override
    public void tv() {


    }
}
