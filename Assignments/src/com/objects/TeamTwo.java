package com.objects;

public class TeamTwo extends Project {
    String[] tools;

    public TeamTwo(String projectName, int durationinMonths, String domain, String projectManager, String[] tools) {
        super(projectName, durationinMonths, domain, projectManager);
        this.tools = tools;
    }
    void showSupportTools(){
        for(String  tool:tools){
            System.out.println(tool);
        }
    }
}
