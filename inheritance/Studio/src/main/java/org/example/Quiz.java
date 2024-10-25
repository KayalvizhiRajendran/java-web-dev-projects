package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz {
    private HashMap<String, ArrayList<Question>> quizQuestions = new HashMap<>();

    public HashMap<String, ArrayList<Question>> getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(HashMap<String, ArrayList<Question>> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public void addQuestion(String question, String type, ArrayList<String> options, ArrayList<String> answers){
        HashMap<String, ArrayList<Question>> questions = getQuizQuestions();
        Question ques = null;
        ArrayList<Question> finalQuestion = null;
        if(type.equalsIgnoreCase("CheckBox")){
             ques = new CheckBox(question, options, answers);

        }else if (type.equalsIgnoreCase("MultipleChoice")){
            ques = new MultipleChoice(question, options, answers.get(0));
        }else if(type.equalsIgnoreCase("TrueOrFalse")){
            ques = new TrueOrFalse(question, options, answers.get(0));
        }
        if(questions.get(type) == null) {
            finalQuestion = new ArrayList<>();

        } else{
            finalQuestion = questions.get(type);
        }
        finalQuestion.add(ques);
        questions.put(type,finalQuestion );
    }

    public void runQuiz(){
        HashMap<String, ArrayList<Question>> questions = getQuizQuestions();
    }

    public void gradeQuiz(){

    }
}
