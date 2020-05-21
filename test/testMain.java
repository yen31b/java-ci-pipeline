import org.junit.Test;

public class testMain {

    private Main m;

    public void escenario (){
        m = new Main();
    }

    @Test
    public void sumar() {
        escenario();
        assert(m.sumar(2 , 2) == (2 + 2));
    }

    @Test
    public void restar() {
        escenario();
        assert(m.restar(3 , 2) == (3 - 2));
    }

    @Test
    public void multiplicar() {
        escenario();
        assert(m.multiplicar(3 , 2) == (3 * 2));

    }

    @Test
    public void dividir() {
        escenario();
        assert(m.dividir(6 , 2) == (6 / 2));

    }
}