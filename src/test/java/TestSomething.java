import org.junit.Test;
import org.mockito.Mockito;

public class TestSomething {
    private SayHello sayHello = Mockito.mock(SayHello.class);

    @Test
    public void something() {
        Mockito.when(sayHello.helloWorld()).thenAnswer(answer -> "hey there");

        System.out.println(sayHello.helloWorld());
    }
}
