// Antônio Costa Satiro de Souza 10723636
public class Pokemon {
    
    public String nome ;
    public int nivel;
    public int hp;
    public int totalHP;

    public Pokemon(String nome, int nivel, int hp){
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.totalHP = hp;
    }

    public void atacar(Pokemon pokemon){

    }

    public void receberDano(int dano){

        if(dano > hp){
            hp = 0;
        } else {
            hp = hp - dano;
        }
    }

    public void recuperarHp(){
        int cura  = 5;
        if((cura + hp) > totalHP){
            System.out.println(nome + " curou " + (hp - totalHP));
            hp =  totalHP;
        }else{
            hp = hp + cura;
            System.out.println(nome + " curou " + cura);
        }


    }

    public void recuperarHp(int qualidade){
        int cura = 5 + qualidade;
        if((cura + hp) > totalHP){
            System.out.println(nome + " curou " + (hp - totalHP));
            hp =  totalHP;
        }else{
            System.out.println(nome + " curou " + cura);
            hp = hp + cura;
        }
    }

    public boolean estaVivo(){
        if(hp <= 0){
            return false;
        }else{
            return true;
        }
    }
}