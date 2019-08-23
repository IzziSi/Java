/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Player {
        private String lastName;
        private int level;
        private double experience;
        private String race;
        private String hometown;
        private int age;
        private String firstName;
        private int roomNum;
        private String birthday;
        private String description;
        
        private void player() {
            
            firstName = "John";
            lastName = "Smith";
            level = 1;
            experience = 0;
            race = "Human";
            hometown = "Narnia";
            age = 16;
            roomNum = 0;
            description = "None";
    }
    
    public void setFirstName(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.firstName = name;
    } 

    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        this.lastName = name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAge(int personAge) {
        this.age = personAge;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setBirthday(int age) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -age);
        Date date = new Date();
        date = cal.getTime();
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd yyyy");
        this.birthday = outputFormat.format(date);
    }
    
    public void setExperience(double exp) {
        Levels maxExp = new Levels();
        maxExp.levelDetails();
        double percentExp;
        double totalExp = maxExp.getMaxExp(level);
        percentExp = ((exp/totalExp)*100);
        this.experience = percentExp;
    }
    
    public double getExperience() {
        return experience;
    }
    
    public void setHometown(String findRace) {
     Hometown town = new Hometown();
     Hometown.hometownDetails();
     this.hometown = town.findHometown(findRace);
    }
    
    public String getHometown() {
        return hometown;
    }
    
    public void setLevel(int lvl) {
        this.level = lvl;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setRace(String personRace) {
        this.race = personRace;
    }
    
    public String getRace() {
        return race;
    }
    
    public void checkRace(String playerInput) {
        Scanner input = new Scanner(System.in);
        Race raceList = new Race();
        
        boolean chkRaceInput = raceList.checkRace(playerInput);
        while (chkRaceInput == false) {
            
            switch(playerInput.toLowerCase()) {
                case "human":
                    setRace("Human");
                    chkRaceInput = true;
                    break;
                case "dwarf":
                    setRace("Dwarf");
                    chkRaceInput = true;
                    break;
                case "elf":
                    setRace("Elf");
                    chkRaceInput = true;
                    break;
                case "catpeople":
                    setRace("Catpeople");
                    chkRaceInput = true;
                    break;
                case "crabpeople":
                    setRace("Crabpeople");
                    chkRaceInput = true;
                    break;
                case "gelatinous cube":
                    setRace("Gelatinous Cube");
                    chkRaceInput = true;
                    break;
                case "cube":
                    setRace("Gelatinous Cube");
                    chkRaceInput = true;
                    break;
                case "gelatinous":
                    setRace("Gelatinous Cube");
                    chkRaceInput = true;
                    break;
                default:
                    System.out.println("Please select a race: Human, Dwarf, Elf, Catpeople, Crabpeople, Gelatinous Cube.");
                    playerInput = input.next();
            }
            
        }
    }

    public void setRoomNum(int num) {
        this.roomNum = num;
    }
    
    public int getRoomNum() {
        return roomNum;
    }

    public String getStats() {
        String message;
        message = "Name: " + firstName + " " + lastName + "\n";
        message += "Age: " + age + " years old. Born on " + birthday + ".\n";
        message += "Hometown: " + hometown + "\n";
        message += "Race: " + race + "\n";
        message += "Level: " + level + " Experience: " + experience +"%\n";
        System.out.println(message);
        return message;
    }
}

