package server;

/**
 * нтерфейс для обеспечения полиморфизма команд без параметров.
 */

public interface Command {
    /**
     * Метод который исполняется во всех командах без параметров
     */
    void execute() ;
}
