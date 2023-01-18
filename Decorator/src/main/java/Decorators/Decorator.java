package Decorators;

public abstract class Decorator extends IFileStream {
    IFileStream stream;
    public Decorator(IFileStream stream) {
        this.stream = stream;
    }
}
