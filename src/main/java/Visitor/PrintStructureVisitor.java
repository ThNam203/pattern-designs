package Visitor;

public class PrintStructureVisitor implements Visitor {
    private int depth = 0;

    private void printIndent() {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }

    @Override
    public void visit(File file) {
        printIndent();
        System.out.println("File: " + file.getName() + " (" + file.getSize() + " KB)");
    }

    @Override
    public void visit(Directory directory) {
        printIndent();
        System.out.println("Directory: " + directory.getName());
        depth++;
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
        depth--;
    }
}