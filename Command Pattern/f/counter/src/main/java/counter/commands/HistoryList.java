package counter.commands;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {

    private final List<Command> commandList;
    private final List<Command> undoList;

    public HistoryList(){
        commandList = new ArrayList<>();
        undoList = new ArrayList<>();
    }

    public void addCommand(Command command){
        commandList.add(command);
        command.execute();
    }

    public void undo(){
        if(commandList.isEmpty()) return;
        Command command = commandList.get(commandList.size() - 1);
        command.unexecute();
        undoList.add(command);
    }

    public void redo(){
        if(undoList.isEmpty()) return;
        Command command = undoList.get(undoList.size() - 1);
        command.execute();
        commandList.add(command);
    }

}
