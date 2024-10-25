package org.example;

import java.util.ArrayList;

public class CheckBox extends Question{
    private ArrayList<String> answers;

    public CheckBox(String question, ArrayList<String> options, ArrayList<String> answers){
        super(question, options);
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}
