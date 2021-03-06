package cpu.command;

/**
 * @author Alex Hiermann
 */
public class Inc extends Command {

    /**
     * first needed operator
     */
    private final int op1;

    /**
     * default constructor
     *
     * @param op1 first needed operator
     */
    public Inc(int op1) {
        this.op1 = op1;
    }

    /**
     * adds (op1 / number in memory at index op1) to (op2 / number in memory at index op2)
     * and saves the result at op2
     */
    @Override
    public void function() {
        new Add(1, op1).function();
    }
}
