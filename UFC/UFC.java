package aula7Luta;
public class UFC {
    public static void main(String[]args) {

        Lutador [] l  = new Lutador[5];
        l[0] = new Lutador("Luanzin","Br",22,1.80,110,5,10,2);
        l[1] = new Lutador("deyvin","Senegalês ", 21,1.95,120,2,10,0);
        l[2] = new Lutador("Lucaslol","Japonês", 22,1.85,80,4,4,4);
        l[3] = new Lutador("Marina","yordle",20,1.50,55,2,2,2);
        l[4] = new Lutador("Cabeça" , "Gigante",16,1.80,53,2,3,5);
        Luta novaLuta= new Luta();
        novaLuta.marcarLuta(l[3],l[4]);
        novaLuta.luta();

    }
}
