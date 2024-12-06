package weekEleven.ArrayListDemo;

import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<String> names;
    private ArrayList<Integer> ages;
    private ArrayList<Double> scores;

    public SystemManagement() {
        names = new ArrayList<>();
        ages = new ArrayList<>();
        scores = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void addAge(int age) {
        ages.add(age);
    }

    public void addScore(double score) {
        scores.add(score);
    }

    public void removeName(String name) {
        names.remove(name);
    }

    public void removeAge(int age) {
        ages.remove(Integer.valueOf(age));
    }

    public void removeScore(double score) {
        scores.remove(Double.valueOf(score));
    }

    public int getNamesSize() {
        return names.size();
    }

    public int getAgesSize() {
        return ages.size();
    }

    public int getScoresSize() {
        return scores.size();
    }

    public String getName(int index) {
        return names.get(index);
    }

    public int getAge(int index) {
        return ages.get(index);
    }

    public double getScore(int index) {
        return scores.get(index);
    }

    public void displayNamesForEach() {
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void displayAgesForLoop() {
        System.out.println("Ages:");
        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
        }
    }

    public void displayScoresForLoop() {
        System.out.println("Scores:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }
    }
}

