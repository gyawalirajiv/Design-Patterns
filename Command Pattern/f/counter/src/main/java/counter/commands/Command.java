package counter.commands;

public interface Command {
    void execute();

    void unexecute();
}
