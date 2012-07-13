package jp.itacademy.exercises.basic.cl;

import java.util.Arrays;

public class CommandLine {

    private String line;
    private String name;
    private String[] args;

    public CommandLine(String line) {
        this.line = line;
        String[] tokens = line.split(" ");
        this.name = tokens[0];
        this.args = Arrays.copyOfRange(tokens, 1, tokens.length);
    }

    public String getLine() {
        return line;
    }

    public String getName() {
        return name;
    }

    public String[] getArgs() {
        return args;
    }

}
