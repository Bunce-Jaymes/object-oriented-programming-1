/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

import cit260.getOut.view.GameMenus.SaveGameView;

/**
 *
 * @author jayme
 */
public class FinalSceneView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = "w";
        inputs[0] = mainInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        System.out.println("You have reached a door, it opens and youre blinded by a bright light. It the sun, looks like you were able to GETOUT");
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();

        return true;

    }
}
