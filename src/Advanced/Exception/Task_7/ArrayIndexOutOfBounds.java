package Advanced.Exception.Task_7;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[6] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }

}
