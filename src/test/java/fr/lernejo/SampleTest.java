package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest
{
    @Test
    void test_addition() {
        int a = 10;
        int b = 10;
        Sample new_sample = new Sample();
        int res = new_sample.op(Sample.Operation.ADD,a,b);
        Assertions.assertThat(res).as("addition of 10 + 10").isEqualTo(20);
    }

    @Test
    void test_multiplication() {
        int a = 10;
        int b = 10;
        Sample new_sample = new Sample();
        int res = new_sample.op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(res).as("multiplication of 10 + 10").isEqualTo(100);
    }

    @Test
    void test_fact_inf_0() {
        int a = -2;
        Sample new_sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new_sample.fact(a));
    }

    @Test
    void test_fact_sup_1() {
        int a = 3;
        Sample new_sample = new Sample();
        Assertions.assertThat(new_sample.fact(a)).as("fact of 3").isEqualTo(6);
    }
}
