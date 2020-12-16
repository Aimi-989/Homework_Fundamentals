package strings;

public class Tasks {
    public static void main(String[] args) {

        System.out.println("task 1");

        String java = "THE QUICK BROWN FOX JUMPED OVER THE LAZY DOG";
        java = java.toLowerCase();
        System.out.println(java);

        System.out.println("task 2");

        String word = "Programmer";
        System.out.println(word.substring(0,5));

        System.out.println("task 3");

        String z1 = "Java";
        String z2 = "Fundamentals";
        String z3 = (z1.substring(1)).concat((z2.substring(1)));
        System.out.println(z3);

        System.out.println("task 4");

        String text = "This is Java!";
        System.out.println(text.length() + " characters");

        System.out.println("task 5");

        String s1 = "This is a comparison";
        String s2 = "THIS is A Comparison";
        System.out.println("This is a comparison equals THIS is A Comparison = " + s1.equalsIgnoreCase(s2));

        System.out.println("task 6");
        String x = "Java exercises";
        boolean ends = x.endsWith("ses");
        System.out.println("Java exercises ends with ses = " + ends);

        System.out.println("task 7");

        String str = "Hello world";
        System.out.println("Hello words contains lo wor = " + str.contains("lo wor"));

        /* System.out.print(str.charAt(3));
        System.out.print(str.charAt(4));
        System.out.print(str.charAt(5));
        System.out.print(str.charAt(6));
        System.out.print(str.charAt(7));
        System.out.println(str.charAt(8));*/

        System.out.println("task 9");

        String text1 = "  Hello  ";
        text1 = text1.trim();
        System.out.println(text1);

        System.out.println("task 10");

        System.out.println(" +'''''+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | --- |");
        System.out.println(" +-----+");

    }
}
