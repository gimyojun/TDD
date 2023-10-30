package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @DisplayName("Calc에 run메서드 리턴 내역")
    void t1(){
        int rs = Calc.run("");
    }

}
