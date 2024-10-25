package org.example;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private ArrayList<String> options;

    public Question(String question, ArrayList<String> options){
        this.question = question;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }
}
