package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void fact_6_should_produce_720() {
        int n = 6; // (1)
        int result = Sample.fact(n); // (2)
        Assertions.assertThat(result).as("fact 6 equal 720")
            .isEqualTo(720); // (3)
    }

    @Test
    void fact_0_should_produce_1() {
        int n = 0; // (1)
        int result = Sample.fact(n); // (2)
        Assertions.assertThat(result).as("fact 0 equal 1")
            .isEqualTo(1); // (3)
    }

    @Test
    void fact_negative_number_should_produce_exception() {
        int n = -1; // (1)
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(n)); // (3)
    }

    @Test
    void ADD_5_6_sould_produce_11() {
        int a = 5; // (1)
        int b = 6; // (1)
        int result = Sample.op(Sample.Operation.ADD,a,b); // (2)
        Assertions.assertThat(result).as("5+6=11")
            .isEqualTo(11); // (3)
    }

    @Test
    void MUL_5_6_sould_produce_11() {
        int a = 5; // (1)
        int b = 6; // (1)
        int result = Sample.op(Sample.Operation.MULT,a,b); // (2)
        Assertions.assertThat(result).as("5*6=30")
            .isEqualTo(30); // (3)
    }
}
