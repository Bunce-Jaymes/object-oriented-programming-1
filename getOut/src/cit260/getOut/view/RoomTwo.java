/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.getOut.view;

/**
 *
 * @author jayme
 */
public class RoomTwo extends View {

    public RoomTwo() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        String mainInput = this.getInputs("B - Inspect Bookshelf\n"
                + "C - Inspect Couch\n"
                + "X - Exit\n"
                + "=======================================\n"
                + "What item would you like to inspect?"
                + "\nEnter a key: ");
        inputs[0] = mainInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "B":
                inspectBookshelf();
                break;
            case "C":
                inspectCouch();
                break;
            case "X":
                return true;

            default:
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
        }
        return false;
    }

    private void inspectBookshelf() {
        this.console.println("You have searched under the couch and under and inside the cushions.\n"
                + "Inside one of the cushions you find what looks like a blue key, possibly crucial to your escape.\n"
                + "You continue to search the couch but find nothing of note.\n"
                + "**BLUE KEY is added to your INVENTORY**\n"
                + "=======================================");
    }

    private void inspectCouch() {
        this.console.println("There are several books on the bookshelf and you begin to flip through them.\n"
                + "After a few books, you notice that a slip of paper falls out.\n"
                + "Written on the paper is the equation “(10 / 2 + 41)^2”\n"
                + "You continue to search the other books around the shelves themselves but find nothing of note.\n"
                + "**PAPER SLIP has been added to your INVENTORY**\n"
                + "=======================================");
    }
}
