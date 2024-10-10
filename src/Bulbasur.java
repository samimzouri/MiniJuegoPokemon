public class Bulbasur extends Pokemon implements IPlanta {

    //Constructor
    public Bulbasur(){
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque látigo cepa");
    }
}