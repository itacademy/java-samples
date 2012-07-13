package jp.itacademy.exercises.basic.cl;

public interface Command {

    String getName();
    
    void exec(String[] args);

}
