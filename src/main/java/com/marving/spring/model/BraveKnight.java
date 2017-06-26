package com.marving.spring.model;

/**
 * Created by mercop on 2017/6/25.
 */
public class BraveKnight implements Knight{
    private Quest braveQuest;

    public BraveKnight(Quest quest){
        this.braveQuest = quest;
    }
    public void embarkOnQuest() {
        braveQuest.embark();
    }
}

