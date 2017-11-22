package com.tse.ayoub.quizzfal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ayoub on 22/11/2017.
 */

public class Question {


    private String question ;
    private String reponse ;
    private String propo1;
    private String propo2;
    private String propo3;
    private List<String> propos = new ArrayList<String>();


    public List<String> getPropos() {
        return propos;
    }

    public void randomizeprop() {

        propos.add(reponse);
        propos.add(propo1);
        propos.add(propo2);
        propos.add(propo3);
        Collections.shuffle(propos);

    }



    Question(String s , String r , String p1 , String p2 , String p3 ){
            question=s;
            reponse=r;
            propo1=p1;
            propo2=p2;
            propo3=p3;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String getPropo1() {
        return propo1;
    }

    public void setPropo1(String propo1) {
        this.propo1 = propo1;
    }

    public String getPropo2() {
        return propo2;
    }

    public void setPropo2(String propo2) {
        this.propo2 = propo2;
    }

    public String getPropo3() {
        return propo3;
    }

    public void setPropo3(String propo3) {
        this.propo3 = propo3;
    }



}
