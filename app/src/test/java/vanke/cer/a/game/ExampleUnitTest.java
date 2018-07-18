package vanke.cer.a.game;

import org.junit.Test;

import vanke.cer.a.game.adapter.Animal;
import vanke.cer.a.game.adapter.Human;
import vanke.cer.a.game.adapter.Man;
import vanke.cer.a.game.command.CommandClient;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        CommandClient.getInstance().sendCommond();
    }

    @Test
    public void  adapter() throws Exception {


      Man man=new Man(new Animal());
      man.eat();
      man.sex();

    }




}