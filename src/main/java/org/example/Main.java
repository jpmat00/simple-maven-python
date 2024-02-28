package org.example;

import jep.Interpreter;
import jep.SharedInterpreter;

public class Main {
    public static void main(String[] args) {
        try (Interpreter jep = new SharedInterpreter()) {
            jep.eval("print('Hello, from Python!')");
        }


        try (Interpreter jep = new SharedInterpreter()) {
            jep.eval("print('Hello, from Python!')");
        }
    }
}