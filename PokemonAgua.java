// Antônio Costa Satiro de Souza 10723636
public class PokemonAgua extends Pokemon{

    public PokemonAgua(String nome, int nivel, int hp){
        super(nome, nivel, hp);
    }

    @Override
    public void atacar(Pokemon pokemon){

        if(pokemon instanceof PokemonFogo){
            pokemon.receberDano(15);
            System.out.println(nome + " atacou " + pokemon.nome + ". SUPER EFETIVO!!!");
        }else{
            pokemon.receberDano(10);
            System.out.println(nome + " atacou " + pokemon.nome + ". EFETIVO");
        }
    }
}