package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Quiz quiz = new Quiz();
            ArrayList<String> options = new ArrayList<>();
            options.add("Dec 2024");
            options.add("Now");
            options.add("April 2025");
            ArrayList<String> ans = new ArrayList<>();
            ans.add("April 2025");
            quiz.addQuestion("Which month the LaunchCode course ends? ", "MultipleChoice", options,ans );
            System.out.println("Hello");
        }
    }
