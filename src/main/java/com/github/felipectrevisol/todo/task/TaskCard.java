package com.github.felipectrevisol.todo.task;

public class TaskCard implements Comparable<TaskCard> {

    private boolean completed;
    private final String title;
    private final int priority;

    public String title() {
        return title;
    }

    public int priority() {
        return priority;
    }

    public void done() {
        this.completed = true;
    }

    public boolean isDone() {
        return completed;
    }

    public TaskCard(final String title, final int priority) {
        this.title = title;
        this.priority = priority;
    }

    @Override
    public int compareTo(final TaskCard otherCard) {
        return Integer.compare(this.priority, otherCard.priority);
    }
}