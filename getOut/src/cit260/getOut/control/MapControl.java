/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import cit260.getOut.model.Question;
import javafx.scene.Scene;

/**
 *
 * @author jayme
 */
class MapControl {

    public static Map createMap(int rowCount, int columnCount) {
        if (rowCount < 0 || columnCount < 0) {
            return null;
        }
        
        Map map = new Map();
        map.getRowCount();
        map.getColumnCount();
        
        Location[][] locations = createLocations(rowCount, columnCount);
        
        Scene[] scenes = createScenes();
        
        Question[] questions = createQuestions();
        
        assignQuestionsToScenes(questions,scenes);
        assignScenesToLocation(scenes,locations);
        
        return map;
    }

    private static Location[][] createLocations(int rows, int columns) {
        if (rows < 1 || columns < 1){
            return null;
    }
    
        Location[][] locations = new Location[rows][columns];
        
        long spot = 0;
        
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; i++){
                Location[][] location = new Location[i][j];
                
//set visited attribute to false
//Assign location to the row, and column in array
                
            }
            return locations;
        }
    }

    private static Scene[] createScenes() {
        System.out.println("***CreateScenes works");
        return null;
    }

    private static Question[] createQuestions() {
        System.out.println("***CreateQuestion works");
        return null;
    }

    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("***assignQuestionsToScenes works");
    }
    private static void assignScenesToLocation(Scene[] scenes, Location[][] locations) {
       System.out.println("***assignScenesToLocation works");
    }

}
