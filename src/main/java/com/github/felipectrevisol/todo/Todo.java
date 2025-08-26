package com.github.felipectrevisol.todo;

import java.util.Set;
import java.util.TreeSet;
import com.github.felipectrevisol.todo.task.TaskCard;

public final class Todo {

    private final Set<TaskCard> cards = new TreeSet<>();

    public Set<TaskCard> tasks() {
        return cards;
    }

    public void add(final TaskCard card) {
        cards.add(card);
    }
}