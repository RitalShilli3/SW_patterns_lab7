package lab7;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(" === in lab task 1: === ");
        TextEditor editor = new TextEditor();
        editor.addCharacter('A', 1, 12, "black");
        editor.addCharacter('B', 2, 14, "red");
        editor.addCharacter('A', 3, 18, "blue");
        editor.addCharacter('C', 4, 12, "black");
        editor.addCharacter('B', 5, 14, "red");

        System.out.println("Flyweight objects created: " + editor.getFlyweightCount());
    }
}