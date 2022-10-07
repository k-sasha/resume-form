package com.sasha.spring.mvc;

import com.sasha.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Candidate {
    // form:errors, @Valid & BindingResult in param of methods showCandidateDetails
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required field and should not be filled with space only")
    private String surname;
    @Min(value = 18, message = "only adults, candidate must be over 17 years of age")
    @Max(value = 100, message = "candidate must be under the age of 101")
    private int age;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "@gmail.com", message = "email must ends with @gmail.com")
    private String email;
    // form:select form:option(s)(drop-down list)
    private String desiredPosition; // hardcode case
    private Map<String, String> workExperiences; // for soft code
    private String workExperience; //for soft code
    // form:radiobutton(s)
    private String relocation; //  hardcode case (not possible, possible, desirable)
    private String education; // for soft code (secondary, higher, bachelor, master)
    private Map<String, String> educations; // for soft code
    // form:checkbox(es)
    private String[] languages; // hardcode case (English, German, French)
    private String[] keySkills; //  for soft code (responsible, self-driven, organized, have strong analytical skills)
    private Map<String, String> keySkillsMap; //  for soft code


    public Candidate() {
        workExperiences = new LinkedHashMap<>();
        workExperiences.put("no work experience", "0");
        workExperiences.put("1 year", "1");
        workExperiences.put("2 years or more", "2");

        educations = new LinkedHashMap<>();
        educations.put("secondary", "SECONDARY");
        educations.put("higher", "HIGHER");
        educations.put("bachelor", "BACHELOR");
        educations.put("master", "MASTER");

        keySkillsMap = new HashMap<>();
        keySkillsMap.put("responsible", "responsible");
        keySkillsMap.put("self-driven", "self-driven");
        keySkillsMap.put("organized", "organized");
        keySkillsMap.put("have strong analytical skills", "have strong analytical skills");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesiredPosition() {
        return desiredPosition;
    }

    public void setDesiredPosition(String desiredPosition) {
        this.desiredPosition = desiredPosition;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public Map<String, String> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(Map<String, String> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public String getRelocation() {
        return relocation;
    }

    public void setRelocation(String relocation) {
        this.relocation = relocation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Map<String, String> getEducations() {
        return educations;
    }

    public void setEducations(Map<String, String> educations) {
        this.educations = educations;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getKeySkills() {
        return keySkills;
    }

    public void setKeySkills(String[] keySkills) {
        this.keySkills = keySkills;
    }

    public Map<String, String> getKeySkillsMap() {
        return keySkillsMap;
    }

    public void setKeySkillsMap(Map<String, String> keySkillsMap) {
        this.keySkillsMap = keySkillsMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", desiredPosition='" + desiredPosition + '\'' +
                '}';
    }
}
