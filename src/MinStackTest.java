import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {

    @Test
    public void testMinStack() {
        MinStack stack = new MinStack();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        assertEquals(1, stack.getMin());

        stack.pop();
        assertEquals(2, stack.getMin());

        stack.push(1);
        stack.push(4);
        assertEquals(1, stack.getMin());

        stack.pop();
        stack.pop();
        assertEquals(2, stack.getMin());
    }
}
