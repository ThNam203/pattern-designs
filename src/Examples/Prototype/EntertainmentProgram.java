package Examples.Prototype;

public abstract class EntertainmentProgram implements IEntertainmentPrototype {
    protected String name;
    protected int length;
    protected String type;

    public EntertainmentProgram(String name, int length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public EntertainmentProgram(EntertainmentProgram prototype) {
        this.name = prototype.name;
        this.length = prototype.length;
        this.type = prototype.type;
    }

    public String getProgramInformation() {
        return "Entertainment program's information:\n\tProgram: " + name + "\n\tDuration: " + this.length + " minutes\n\tType: " + type + "\n";
    }

    public abstract EntertainmentProgram clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
