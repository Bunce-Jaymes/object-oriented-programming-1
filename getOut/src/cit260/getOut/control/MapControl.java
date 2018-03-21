/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.model.UnknownScene;
import cit260.getOut.model.BlankScene;
import cit260.getOut.model.FinishScene;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import cit260.getOut.model.Question;
import cit260.getOut.model.QuestionScene;
import cit260.getOut.model.RegularSceneType;
import cit260.getOut.model.SceneType;
import cit260.getOut.model.StartScene;
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
        
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; i++){
                Location[][] location = new Location[i][j];
                Map.visited = false;
                locations[rows] = location[i];
                locations[columns] = location[j];
            }
        }
        return locations;
    }

    public static Scene[] createScenes() {
        RegularSceneType[] scenes = new RegularSceneType[5];
        
        QuestionScene question = new QuestionScene();
        question.setDescription("");
        question.setBlocked("Yes");
        question.setSymbol("");
        question.setRoom();
        question.setDoor();
        question.setLocation();
        
        scenes[SceneType.question.ordinal()] = question;
        
        BlankScene blank = new BlankScene();
        blank.setDescription("");
        blank.setBlocked("No");
        blank.setSymbol("");
        blank.setRoom();
        blank.setDoor();
        blank.setLocation();
  
        scenes[SceneType.blank.ordinal()] = blank;
        
        StartScene start = new StartScene();
        start.setDescription("You began in a dark room. Dazed and confuse you being to wonder and exlpore this new place.");
        start.setBlocked("No");
        start.setSymbol("");
        start.setRoom(1);
        start.setDoor(1);
        start.setLocation();
        
        scenes[SceneType.start.ordinal()] = start;
        
        FinishScene finish = new FinishScene();
        blank.setDescription("You sucessful turn each key and recieve your reward. Your freedom.");
        blank.setBlocked("Yes");
        blank.setSymbol("");
        blank.setRoom(3);
        blank.setDoor(5);
        blank.setLocation();
        
        scenes[SceneType.finish.ordinal()] = finish;
        
        UnknownScene unknown = new UnknownScene();
        blank.setDescription("You sucessful turn each key and recieve your reward. Your freedom.");
        blank.setBlocked("Yes");
        blank.setSymbol("");
        blank.setRoom(3);
        blank.setDoor(5);
        blank.setLocation();
        
        scenes[SceneType.finish.ordinal()] = finish;
        
        return null;
    }

    private static Question[] createQuestions() {
        Question[] questions = new Question[4];
        
        QuestionScene question = new QuestionScene();
        scenes[SceneType.question.ordinal()] = question;
        
        BlankScene blank = new BlankScene();
        scenes[SceneType.blank.ordinal()] = blank;
        
        StartScene start = new StartScene();
        scenes[SceneType.start.ordinal()] = start;
        
        FinishScene finish = new FinishScene();
        scenes[SceneType.finish.ordinal()] = finish;
        
        return null;
    }

    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("***assignQuestionsToScenes works");
    }
    private static void assignScenesToLocation(Scene[] scenes, Location[][] locations) {
       System.out.println("***assignScenesToLocation works");
    }

}
