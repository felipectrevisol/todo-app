package com.github.felipectrevisol.todo;

import java.util.Iterator;
import org.junit.jupiter.api.Test;
import com.github.felipectrevisol.todo.task.TaskCard;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    
    private static final int A_PRIORITY = 1;
    private static final int HIGH_PRIORITY = 0;
    private static final String TITLE = "A Card Title.";

    @Test void addTaskCardsInHightOrder() {
        final Todo todo = new Todo();
        todo.add(new TaskCard(TITLE, A_PRIORITY));
        todo.add(new TaskCard(TITLE, HIGH_PRIORITY));

        final Iterator<TaskCard> iterator = todo.tasks().iterator();
        final TaskCard card = iterator.next();
        {
            assertEquals(TITLE, card.title());
            assertEquals(HIGH_PRIORITY, card.priority());
            assertEquals(2, todo.tasks().size());
            assertEquals(A_PRIORITY, iterator.next().priority());
        }
    }
}