/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.model.WallScene;
import cit260.getOut.model.BlankScene;
import cit260.getOut.model.FinishScene;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import cit260.getOut.model.Question;
import cit260.getOut.model.QuestionScene;
import cit260.getOut.model.RegularSceneType;
import cit260.getOut.model.SceneType;
import cit260.getOut.model.StartScene;
import cit260.getOut.model.QuestionType;
import java.util.ArrayList;
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
        map.setLocations(locations);
        RegularSceneType[] scenes = createScenes();

        ArrayList<Question> questions = createQuestions();

        assignQuestionsToScenes(questions, scenes);
        assignScenesToLocation(scenes, locations);

        return map;
    }

    private static Location[][] createLocations(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            return null;
        }

        Location[][] locations = new Location[rows][columns];

        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations.length; j++) {
                locations[i][j] = new Location();
                locations[i][j].setVisited(false);
            }
        }
        return locations;
    }

    public static RegularSceneType[] createScenes() {
        RegularSceneType[] scenes = new RegularSceneType[6];

        QuestionScene question = new QuestionScene();
        question.setDescription("");
        question.setBlocked("Yes");
        question.setSymbol("X");

        scenes[SceneType.question.ordinal()] = question;

        BlankScene blank = new BlankScene();
        blank.setDescription("");
        blank.setBlocked("No");
        blank.setSymbol("");

        scenes[SceneType.blank.ordinal()] = blank;

        StartScene start = new StartScene();
        start.setDescription("You began in a dark room. Dazed and confuse you being to wonder and exlpore this new place.");
        start.setBlocked("No");
        start.setSymbol("S");
        start.setRoom(1);
        start.setDoor(1);

        scenes[SceneType.start.ordinal()] = start;

        FinishScene finish = new FinishScene();
        blank.setDescription("You see a door with three locks, maybe we need three keys.");
        blank.setBlocked("Yes");
        blank.setSymbol("EXIT");
        blank.setRoom(3);
        blank.setDoor(5);

        scenes[SceneType.finish.ordinal()] = finish;

        WallScene wall = new WallScene();
        wall.setDescription("Ther is a wall before you.");
        wall.setBlocked("Yes");
        wall.setSymbol("|");

        scenes[SceneType.wall.ordinal()] = wall;
        
        DoorScene door = new DoorScene();
        door.setDescription("");
        door.setBlocked("No");
        door.setSymbol("/");

        scenes[SceneType.door.ordinal()] = door;

        return scenes;
    }

    private static ArrayList<Question> createQuestions() {
        ArrayList<Question> questions = new ArrayList<Question>();

        Question question1 = new Question();
        question1.setQuestion("Would you like to open the door?");
        questions.add(question1);

        Question question2 = new Question();
        question2.setQuestion("Where would you like to move to?");
        questions.add(question2);

        Question question3 = new Question();
        question3.setQuestion("What would you like to inspect?");
        questions.add(question3);

        Question question4 = new Question();
        question4.setQuestion("What object would you like to grab?");
        questions.add(question4);

        Question question5 = new Question();
        question5.setQuestion("What would you like to use?");
        questions.add(question5);

        return questions;
    }

    private static RegularSceneType[] assignQuestionsToScenes(ArrayList<Question> questions, RegularSceneType[] scenes) {
        for (RegularSceneType s : scenes) {
            s.setQuestions(questions);
        }
        return scenes;
    }

    private static void assignScenesToLocation(RegularSceneType[] scenes, Location[][] locations) {

        locations[0][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.door.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.question.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.question.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.question.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.door.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.door.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.door.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.question.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.finish.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.question.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.wall.ordinal()]);

    }

}
