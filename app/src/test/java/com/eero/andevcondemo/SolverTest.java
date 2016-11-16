package com.eero.andevcondemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolverTest {

    private Solver solver;

    @Before
    public void setup() {
        solver = new Solver();
    }

    @Test
    public void calcFib() {
        Assert.assertEquals(0, solver.calcFib(1));
        Assert.assertEquals(1, solver.calcFib(2));
        Assert.assertEquals(1, solver.calcFib(3));
        Assert.assertEquals(2, solver.calcFib(4));
        Assert.assertEquals(3, solver.calcFib(5));
        Assert.assertEquals(5, solver.calcFib(6));
        Assert.assertEquals(8, solver.calcFib(7));
        Assert.assertEquals(13, solver.calcFib(8));
        Assert.assertEquals(21, solver.calcFib(9));
        Assert.assertEquals(34, solver.calcFib(10));
    }

}