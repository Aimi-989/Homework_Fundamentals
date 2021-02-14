package Advanced.Exception.Task_9;

public class Mid extends God {
    @Override
    public void throwLowerException() throws MidException {
        throw new MidException();
    }
}
