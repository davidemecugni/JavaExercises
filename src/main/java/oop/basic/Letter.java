package oop.basic;

public class Letter {
    final String from;
    final String to;
    final StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    void addLine(String line){
        lines.append(line).append("\n");
    }
    public String getText() {
        return "Dear " + to + ":\n\n" + lines + "\n" + "Sincerely,\n\n" + from;
    }
}
