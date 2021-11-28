package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step1.controller.CalculateProcessor;
import step1.domain.Number;
import step1.domain.Inputs;

import static org.assertj.core.api.Assertions.*;

public class CalculateProcessorTest {
    @Test
    @DisplayName("input String을 사용하여 연산 후 결과 test")
    void calculate() {
        CalculateProcessor calculator = new CalculateProcessor();
        assertThat(calculator.calculate(new Inputs("1,2:3"))).isEqualTo(Number.createFromInt(6));
        assertThat(calculator.calculate(new Inputs("//;\n1;2;3"))).isEqualTo(Number.createFromInt(6));
    }
}
