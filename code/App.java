public class App {
    public static void main(String[] args) {
        String inFile = "Logic2.java";  // ← aquí pones el archivo .java que quieres contar
        String outFile = "salida2.txt";
        Logic2 logic = new Logic2("Program2-LOC", "  ");
        logic.logic2a(inFile, outFile);
    }
}
