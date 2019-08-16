/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author Administrator
 */
public class Room {
    protected int roomNumber;
    protected int numRoomDirections;
    protected String roomName;
    protected String roomDescription;
    protected String[] roomDirections = new String[9];
    protected String[] roomItems = new String[20]; //will expand at a later date
 }

