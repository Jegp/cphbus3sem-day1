import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <h2>Introduction exercise on lambdas.</h2>
 * <p>
 * To complete this exercise, implement the three methods below.
 * </p>
 * <h2>Maven guide</h2>
 * <p>When you're done, try runnig the maven 'verify' task either from Netbeans or by going to a console and typing
 * 'mvn verify'. When that succeeds go to
 * <a href="http://46.101.113.24:6000/">http://46.101.113.24:6000/{your user name}</a> where
 * "{your user name}" is your name of your Windows/Mac/Unix user (it will feature in the console output when deploying
 * through maven. If this gives you any problems (if your username is ⚔ for instance), please change the name in
 * the pom.xml file under the <code>properties -> user</code> tag.
 * </p>
 */
public class Lambda {

    private Lambda() {
        // Should not be instantiated. Ignore this, it's just good practice. Ask Jens why.
    }

    /**
     * <h2>Task 1</h2>
     * By using a Lambda from Java 8, create a {@link Runnable} that prints something stupid to the console. It could
     * be 'Hello world'?
     *
     * @return A {@link Runnable} created with a lamda expression.
     */
    public static Runnable createRunnable() {
        throw new NotImplementedException();
    }

    /**
     * <h2>Task 2</h2>
     * Now you're given a lambda (in this case a {@link Callable}). This lambda is a producer (we'll talk more about
     * those later in the semester) which generates numbers for you. One call to the producer = one number. Your task
     * is simply to get such a number from the producer and return it.
     *
     * @param producer A producer which can generate numbers.
     * @return A number generated from the producer.
     */
    public static int produce(Callable<Integer> producer) {
        throw new NotImplementedException();
    }

    /**
     * <h2>Task 3</h2>
     * Now you're given a {@link Function} and a producer ({@link java.util.function.Supplier}). The supplier gives
     * you a number and the function performs some magic you are not aware of. Your task is to execute
     * that function three times with the number from the producer. First get the number, then apply the function
     * to the number, store the result and repeat the application two more times. The result should be returned.
     *
     * @param function A function which performs some magic on a number.
     * @param supplier Supplies numbers for the calculation.
     * @return The function applied three times
     */
    public static int triple(Function<Integer, Integer> function, Supplier<Integer> supplier) {
        throw new NotImplementedException();
    }

}
