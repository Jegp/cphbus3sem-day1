import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

/**
 * Tests the {@link Lambda} class.
 */
public class LambdaTest {

    @Test
    public void canCreateRunnable() {
        Assert.assertTrue(Lambda.createRunnable().getClass().getCanonicalName().contains("Lambda"));
    }

    @Test
    public void handlesProducedNumbers() {
        Assert.assertEquals(2, Lambda.produce(() -> 2));
    }

    @Test
    public void appliesFunctionThreeTimes() {
        Function<Integer, Integer> f = i -> i * 3;
        Assert.assertEquals((long) f.apply(f.apply(f.apply(3))), Lambda.triple(f, () -> 3));
    }
}
