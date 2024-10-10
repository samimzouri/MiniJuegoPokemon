public class EjercicioIntegrado {

    public static void main(String[] args){
        Bulbasur bulbasur = new Bulbasur ();
        Charmander charmander = new Charmander ();
        Pikachu pikachu = new Pikachu ();
        Squirtle squirtle = new Squirtle ();

        bulbasur.atacarHojaAfilada();
        bulbasur.atacarAraniazo();
        charmander.atacarAscuas();
        charmander.atacarAraniazo();
        pikachu.atacarImpactrueno();
        pikachu.atacarAraniazo();
        squirtle.atacarBurbuja();
        squirtle.atacarAraniazo();
    }
}