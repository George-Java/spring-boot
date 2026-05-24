package com.george.springboot.bean;

/*
 *ClassName: User
 *Package：com.george.springboot.bean
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-00:19
 *@Version 1.0
 */
public class Score {
    private double chinese;
    private double math;
    private double english;

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Score{" +
                "chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}
