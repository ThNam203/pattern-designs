package Visitor;

public class Main {
    public static void main(String[] args) {
        // Create file system structure
        Directory root = new Directory("root");
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);

        Directory subDir = new Directory("subDir");
        File file3 = new File("file3.txt", 30);
        subDir.addElement(file3);

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(subDir);

        // Use SizeVisitor
        SizeVisitor sizeVisitor = new SizeVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " KB");

        // Use PrintStructureVisitor
        PrintStructureVisitor printVisitor = new PrintStructureVisitor();
        root.accept(printVisitor);
    }
}
