package com.company;

public class Generic<F, S> {
    private F first;
    private S second;

    public Generic(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public Generic() {
    }

    @Override
    public String toString() {
        return "Generic{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public String first() {
        return first.getClass() + " " + first.hashCode();
    }

    public String second() {
        return second.getClass() + " " + second.hashCode();
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public Boolean check() {
        return (first.getClass().equals(second.getClass())) && (first.hashCode() == second.hashCode());
    }
}
