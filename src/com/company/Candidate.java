package com.company;

public class Candidate {
    String FullName;
    String floor;
    String age;
    String resumeRelevance;
    Integer rating;

    public Candidate(String fullName, String floor, String age, String resumeRelevance, Integer rating) {
        FullName = fullName;
        this.floor = floor;
        this.age = age;
        this.resumeRelevance = resumeRelevance;
        this.rating = rating;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getResumeRelevance() {
        return resumeRelevance;
    }

    public void setResumeRelevance(String resumeRelevance) {
        this.resumeRelevance = resumeRelevance;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\nСписок кандидатов:" + "Полное имя:" + FullName + " Пол:" + floor + " Возраст:" + age + " Актуальность резюме: " + resumeRelevance + " Рейтинг:" + rating ;
    }
}
