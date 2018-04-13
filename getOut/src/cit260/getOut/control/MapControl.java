/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.control;

import cit260.getOut.exceptions.MapControlExceptions;
import cit260.getOut.model.Actor;
import cit260.getOut.model.WallScene;
import cit260.getOut.model.BlankScene;
import cit260.getOut.model.FinishScene;
import cit260.getOut.model.Game;
import cit260.getOut.model.Location;
import cit260.getOut.model.Map;
import cit260.getOut.model.Question;
import cit260.getOut.model.QuestionScene;
import cit260.getOut.model.RegularSceneType;
import cit260.getOut.model.SceneType;
import cit260.getOut.model.StartScene;
import cit260.getOut.view.RoomItems.BottleView;
import cit260.getOut.view.DoorViews.DoorNumber1View;
import cit260.getOut.view.DoorViews.DoorNumber2View;
import cit260.getOut.view.DoorViews.DoorNumber3View;
import cit260.getOut.view.DoorViews.DoorNumber4View;
import cit260.getOut.view.DoorViews.FinalDoorView;
import cit260.getOut.view.FinalSceneView;
import cit260.getOut.view.RoomItems.DriftPenView;
import cit260.getOut.view.RoomItems.HammerView;
import cit260.getOut.view.RoomItems.PaperView;
import cit260.getOut.view.RoomItems.SandView;
import getout.GetOut;
import java.util.ArrayList;

/**
 *
 * @author jayme
 */
public class MapControl {

    public static Map createMap(int rowCount, int columnCount) throws MapControlExceptions {
        if (rowCount < 0 || columnCount < 0) {
            throw new MapControlExceptions("Map cannot have a row or column count less than 0");
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

    private static Location[][] createLocations(int rows, int columns) throws MapControlExceptions {
        if (rows < 1 || columns < 1) {
            throw new MapControlExceptions("createLocation cannot have a row or column count less than 0");
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
        question.setSymbol(" X ");

        scenes[SceneType.question.ordinal()] = question;

        BlankScene blank = new BlankScene();
        blank.setDescription("");
        blank.setBlocked("No");
        blank.setSymbol("   ");

        scenes[SceneType.blank.ordinal()] = blank;

        StartScene start = new StartScene();
        start.setDescription("You began in a dark room. Dazed and confuse you being to wonder and exlpore this new place.");
        start.setBlocked("No");
        start.setSymbol("STR");
        start.setRoom(1);
        start.setDoor(1);

        scenes[SceneType.start.ordinal()] = start;

        FinishScene finish = new FinishScene();
        finish.setDescription("You see a door with three locks, maybe we need three keys.");
        finish.setBlocked("Yes");
        finish.setSymbol("ESC");
        finish.setRoom(3);
        finish.setDoor(5);

        scenes[SceneType.finish.ordinal()] = finish;

        WallScene wall = new WallScene();
        wall.setDescription("There is a wall before you.");
        wall.setBlocked("Yes");
        wall.setSymbol("###");

        scenes[SceneType.wall.ordinal()] = wall;

        DoorScene door = new DoorScene();
        door.setDescription("");
        door.setBlocked("Yes");
        door.setSymbol(" / ");

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
        locations[0][0].setVisited(true);
        locations[0][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][1].setVisited(true);
        locations[0][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][2].setVisited(true);
        locations[0][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][3].setVisited(true);
        locations[0][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][4].setVisited(true);
        locations[0][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][5].setVisited(true);
        locations[0][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][6].setVisited(true);
        locations[0][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][7].setVisited(true);
        locations[0][8].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][8].setVisited(true);
        locations[0][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[0][9].setVisited(true);
        locations[1][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][0].setVisited(true);
        locations[1][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][1].setVisited(true);
        locations[1][2].setScene(scenes[SceneType.door.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.question.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[1][9].setVisited(true);
        locations[2][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][0].setVisited(true);
        locations[2][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.question.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[2][9].setVisited(true);
        locations[3][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][0].setVisited(true);
        locations[3][1].setScene(scenes[SceneType.question.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.door.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[3][9].setVisited(true);
        locations[4][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][0].setVisited(true);
        locations[4][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.door.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[4][9].setVisited(true);
        locations[5][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][0].setVisited(true);
        locations[5][1].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[5][9].setVisited(true);
        locations[6][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][0].setVisited(true);
        locations[6][1].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.door.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[6][9].setVisited(true);
        locations[7][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][0].setVisited(true);
        locations[7][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.question.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[7][9].setVisited(true);
        locations[8][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][0].setVisited(true);
        locations[8][1].setScene(scenes[SceneType.finish.ordinal()]);
        locations[8][1].setVisited(true);
        locations[8][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.question.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.blank.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[8][9].setVisited(true);
        locations[9][0].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][0].setVisited(true);
        locations[9][1].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][1].setVisited(true);
        locations[9][2].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][2].setVisited(true);
        locations[9][3].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][3].setVisited(true);
        locations[9][4].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][4].setVisited(true);
        locations[9][5].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][5].setVisited(true);
        locations[9][6].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][6].setVisited(true);
        locations[9][7].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][7].setVisited(true);
        locations[9][8].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][8].setVisited(true);
        locations[9][9].setScene(scenes[SceneType.wall.ordinal()]);
        locations[9][9].setVisited(true);

        locations[1][2].getScene().setDoor(1);
        locations[3][2].getScene().setDoor(2);
        locations[4][8].getScene().setDoor(3);
        locations[6][4].getScene().setDoor(4);
        locations[7][1].getScene().setDoor(5);

    }

    public static void moveActor(Actor actor, String direction) throws MapControlExceptions {
        int checkColumn = 0;
        int checkRow = 0;
        int setColumn = 0;
        int setRow = 0;
        boolean columnChange = false;
        boolean rowChange = false;

        if (actor == null) {
            throw new MapControlExceptions("Actor has no value");
        }
        Game game = GetOut.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();

        int currentRow = actor.getX();
        int currentColumn = actor.getY();

        if ("U".equals(direction)) {
            checkRow = currentRow - 1;
            if (checkRow > 9) {
                throw new MapControlExceptions("The row that you are wishing to move to is greater than the map size");
            }
            if (checkRow < 0) {
                throw new MapControlExceptions("The row that you are wishing to move to is less than the map size");
            }
            setRow = checkRow;
            rowChange = true;
        }
        if ("D".equals(direction)) {
            checkRow = currentRow + 1;
            if (checkRow > 9) {
                throw new MapControlExceptions("The row that you are wishing to move to is greater than the map size");
            }
            if (checkRow < 0) {
                throw new MapControlExceptions("The row that you are wishing to move to is less than the map size");
            }
            setRow = checkRow;
            rowChange = true;
        }
        if ("L".equals(direction)) {
            checkColumn = currentColumn - 1;
            if (checkColumn > 9) {
                throw new MapControlExceptions("The row that you are wishing to move to is greater than the map size");
            }
            if (checkColumn < 0) {
                throw new MapControlExceptions("The row that you are wishing to move to is less than the map size");
            }
            setColumn = checkColumn;
            columnChange = true;
        }
        if ("R".equals(direction)) {
            checkColumn = currentColumn + 1;
            if (checkColumn > 9) {
                throw new MapControlExceptions("The row that you are wishing to move to is greater than the map size");
            }
            if (checkColumn < 0) {
                throw new MapControlExceptions("The row that you are wishing to move to is less than the map size");
            }
            setColumn = checkColumn;
            columnChange = true;
        }

        if (columnChange == true) {
            Location checkScene = locations[currentRow][setColumn];
            String sceneBlocked = checkScene.getScene().getBlocked();
            if ("Yes".equals(sceneBlocked)) {
                checkScene.setVisited(true);

                //Door Checks
                if (checkScene == locations[1][2]) {
                    DoorNumber1View doorNumber1View = new DoorNumber1View();
                    doorNumber1View.display();
                } else if (checkScene == locations[3][5]) {
                    //Sand Weight
                    String[] inventory = actor.getItems();
                    if (inventory[0] == "Bottle" && inventory[1] == "Sand") {
                        DoorNumber2View doorNumber2View = new DoorNumber2View();
                        doorNumber2View.display();
                    } else {
                        System.out.println("You must first obtain both items to use this door");
                    }
                } else if (checkScene == locations[6][4]) {
                    //Hammer Door
                    String[] inventory = actor.getItems();
                    if (inventory[3] == "Hammer" && inventory[4] == "Drift-Pen") {
                        DoorNumber4View doorNumber4View = new DoorNumber4View();
                        doorNumber4View.display();
                    } else {
                        System.out.println("You must first obtain both items to use this door");
                    }
                } //Item Checks
                else if (checkScene == locations[3][1]) {
                    SandView sandView = new SandView();
                    sandView.display();
                } else if (checkScene == locations[2][4]) {
                    BottleView bottleView = new BottleView();
                    bottleView.display();
                } else if (checkScene == locations[1][8]) {
                    PaperView paperView = new PaperView();
                    paperView.display();
                } else if (checkScene == locations[7][8]) {
                    HammerView hammerView = new HammerView();
                    hammerView.display();
                } else if (checkScene == locations[8][5]) {
                    DriftPenView driftPenView = new DriftPenView();
                    driftPenView.display();
                } //Walls
                else {
                    System.out.println("You cannot move that direction there is a: " + checkScene.getScene().getDescription());
                }
            } else {
                checkScene.setVisited(true);
                checkScene.setActor(actor);
                actor.setX(currentRow);
                actor.setY(setColumn);
            }
        }
        if (rowChange == true) {
            Location checkScene = locations[setRow][currentColumn];
            String sceneType = checkScene.getScene().getBlocked();

            if ("Yes".equals(sceneType)) {
                checkScene.setVisited(true);
                //Door Checks
                if (checkScene == locations[4][8]) {
                    //Pin Code
                    String[] inventory = actor.getItems();
                    if (inventory[2] == "Paper") {
                        DoorNumber3View doorNumber3View = new DoorNumber3View();
                        doorNumber3View.display();
                    } else {
                        System.out.println("You must first obtain an item to use this door");
                    }
                } else if (checkScene == locations[7][1]) {
                    //Key Door
                    FinalDoorView finalDoorView = new FinalDoorView();
                    finalDoorView.display();

                    locations[7][1].setVisited(true);
                    locations[8][1].setActor(actor);
                    locations[8][1].setVisited(true);
                    actor.setX(setRow + 1);
                    actor.setY(currentColumn);
                    
                    FinalSceneView finalSceneView = new FinalSceneView();
                    finalSceneView.display();
                } //Final Scene Check
                //Item Checks
                if (checkScene == locations[3][1]) {
                    SandView sandView = new SandView();
                    sandView.display();
                } else if (checkScene == locations[2][4]) {
                    BottleView bottleView = new BottleView();
                    bottleView.display();
                } else if (checkScene == locations[1][8]) {
                    PaperView paperView = new PaperView();
                    paperView.display();
                } else if (checkScene == locations[7][8]) {
                    HammerView hammerView = new HammerView();
                    hammerView.display();
                } else if (checkScene == locations[8][5]) {
                    DriftPenView driftPenView = new DriftPenView();
                    driftPenView.display();
                } //Walls
                else {
                    System.out.println("You cannot move that direction there is a: " + checkScene.getScene().getDescription());
                }

            } else {
                checkScene.setVisited(true);
                checkScene.setActor(actor);
                actor.setX(setRow);
                actor.setY(currentColumn);
            }
        }
    }
}
