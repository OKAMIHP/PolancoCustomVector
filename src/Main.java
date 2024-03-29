public class Main {
    public static void main(String[] args) {
        CustomVector c = new CustomVector();
        System.out.println("TEST ONE: EMPTY ARRAY");
        System.out.println("EXPECTED: []");
        System.out.println("  ACTUAL: " +  c);
        System.out.println("");
        System.out.println("");
        System.out.println("TEST TWO: ADD ITEMS");
        c.add(5);
        c.add(6);
        System.out.println("EXPECTED: [5, 6]");
        System.out.println("  ACTUAL: " + c);
        System.out.println("");
        System.out.println("");
        int[] addThese = {3, 4, 10};
        c.addAll(addThese);
        System.out.println("TEST THREE: ADD LIST OF ITEMS");
        System.out.println("EXPECTED: [5, 6, 3, 4, 10]");
        System.out.println("  ACTUAL: " + c);
        System.out.println("");
        System.out.println("");
        System.out.println("TEST FOUR: INSERT AN ITEM");
        c.insert(1, 14);
        System.out.println("EXPECTED: [5, 14, 6, 3, 4, 10]");
        System.out.println("  ACTUAL: " + c);
        System.out.println("");
        System.out.println("");
        System.out.println("TEST FIVE: REMOVE AN ITEM");
        c.remove(2);
        System.out.println("EXPECTED: [5, 14, 3, 4, 10]");
        System.out.println("  ACTUAL: " + c);
        System.out.println("");
        System.out.println("");
        System.out.println("TEST FIVE(A): REMOVING LAST VALUE IN VECTOR");
        CustomVector c2 = new CustomVector();
        c2.add(5);
        c2.remove(0);
        System.out.println("EXPECTED: []");
        System.out.println("  ACTUAL: " + c2);
        System.out.println("");
        System.out.println("");
        System.out.println("TEST SIX: GET SIZE");
        System.out.println("EXPECTED: 5");
        System.out.println("  ACTUAL: " + c.size());
        System.out.println("");
        System.out.println("");
        System.out.println("TEST SEVEN: FIND INDEX OF AN ITEM");
        System.out.println("EXPECTED: 3");
        System.out.println("  ACTUAL: " + c.find(4));
        System.out.println("");
        System.out.println("EXPECTED: -1");
        System.out.println("  ACTUAL: " + c.find(12));
    }
}
