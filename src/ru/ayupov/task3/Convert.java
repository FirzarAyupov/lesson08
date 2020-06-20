package ru.ayupov.task3;

public class Convert {

    public static Act convert(Contract contract) {
        Act result;
        result = new Act(contract) {
        };
        return result;
    }
}
