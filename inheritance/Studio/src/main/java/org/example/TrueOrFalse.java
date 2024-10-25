package org.example;

import java.util.ArrayList;

public class TrueOrFalse extends Question{
    private String answer;

    public TrueOrFalse(String question, ArrayList<String> options, String answer){
        super(question, options);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
