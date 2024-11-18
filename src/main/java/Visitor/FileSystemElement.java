package Visitor;

public interface FileSystemElement {
    void accept(Visitor visitor);
}