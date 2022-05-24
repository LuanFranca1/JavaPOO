package aula7Luta;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;

//atributos
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //métodos públicos
    public void apresentar( ){
        System.out.println("----------------------------");
        System.out.println("Próximo  combate a apresentar é do lutador : ");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates : " + this.getEmpates());
    }
    public void status(){
        System.out.println("--------------------------------");
        System.out.println(getNome());
        System.out.println("Da categoria:" + getCategoria());
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura,double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        //this.categoria = categoria;
        if (this.peso < 52.2) {
            this.categoria = "inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.9) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        //this.vitorias = vitorias;
        setVitorias(getVitorias() + 1);
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        //this.derrotas = derrotas;
        setDerrotas(getDerrotas() +1 );
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        //this.empates = empates;
        setEmpates(getEmpates() + 1);
    }

}
