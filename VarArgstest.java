
import static java.lang.System.out;

public class VarArgstest {
    public void print(String... args) {
        for(int i=0; i<args.length; i++)
            out.println(args[i]);
    }

    public void print(String test) {
        out.println("------");
    }

    public static void main(String[] args) {
        VarArgstest test = new VarArgstest();
        test.print("hello");
        test.print("aaa", "bbbb");
    }
}

