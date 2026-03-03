// Antônio Costa Satiro de Souza 10723636
public class PokemonFogo extends Pokemon{

    public PokemonFogo(String nome, int nivel, int hp){
        super(nome, nivel, hp);
    }

    @Override
    public void atacar(Pokemon pokemon){

        if(pokemon instanceof PokemonGrama){
            pokemon.receberDano(15);
            System.out.println(nome + " atacou " + pokemon.nome + ". SUPER EFETIVO!!!");
        }else{
            pokemon.receberDano(10);
            System.out.println(nome + " atacou " + pokemon.nome + ". Efetivo");
        }
    }
}