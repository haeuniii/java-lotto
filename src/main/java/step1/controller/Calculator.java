package step1.controller;

import step1.domain.Number;
import step1.domain.Inputs;

public class Calculator {
    public Number calculate(Inputs inputs) {
        return inputs.sum();
    }
}
