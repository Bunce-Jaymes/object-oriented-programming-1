/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getout;

import cit260.getOut.model.*;
import cit260.getOut.view.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jayme
 */
public class GetOut {
    
    
    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter logFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter outFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        GetOut.logFile = logFile;
    }
 

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        GetOut.outFile = outFile;
    }

       

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        GetOut.inFile = inFile;
    }
    

    public static void main(String[] args) {
        try{
            GetOut.inFile = new BufferedReader(new InputStreamReader(System.in));
            GetOut.outFile = new PrintWriter(System.out, true);
            GetOut.logFile = new PrintWriter("C:/GetOut/logFile.txt");
            
            StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        }
        catch (Throwable e){
            GetOut.outFile.println("Main Class error");
        }
        
        finally{
            
            try {
                if(GetOut.inFile != null){
               GetOut.inFile.close();
                }
                               
                if(GetOut.outFile != null){
                    GetOut.outFile.close();
                }
                if (GetOut.logFile != null){
                    logFile.close();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(GetOut.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
        
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        GetOut.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GetOut.player = player;
    }
    }
