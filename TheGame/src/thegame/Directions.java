/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;

/**
 *
 * @author Administrator
 */
public class Directions {
    private static final String[] directions = {
    "North",
    "South",
    "East",
    "West",
    "Northwest",
    "Southwest",
    "Northeast",
    "Southeast",
    "In",
    "Out",
};
    public static String getDirection(int index) {
        return directions[index];
    }
}
