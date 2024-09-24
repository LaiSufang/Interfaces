public class ShortWordFilter implements Filter {
    // implements the Filter interface whose accept method accepts all strings of length < 5.
    @Override
    public boolean accept(Object x) {
        return x.toString().length() < 5;
    }
}
