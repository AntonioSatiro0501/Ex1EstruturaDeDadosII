public class Main{
    public static void main(String[] arg){

        PokemonFogo pokemon1 = new PokemonFogo("Larvesta", 10, 40);
        PokemonGrama pokemon2 = new PokemonGrama("Simisage", 10, 55);

        while(pokemon1.estaVivo() || pokemon2.estaVivo()){
            pokemon1.recuperarHp();
            pokemon2.recuperarHp(3);
            pokemon1.atacar(pokemon2);
            if(!pokemon2.estaVivo()){
                break;
            }
            pokemon2.atacar(pokemon1);
        }

        if(pokemon1.estaVivo()){
            System.out.println("\n" + pokemon2.nome + " atingiu 0 de hp. " + pokemon1.nome + " venceu");
        }else{
            System.out.println("\n" + pokemon1.nome + " atingiu 0 de hp. " + pokemon2.nome + " venceu");
        }

    }
}