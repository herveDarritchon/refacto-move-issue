package fr.hervedarritchon.opensource.refactomoveissue;

import fr.hervedarritchon.opensource.refactomoveissue.models.User;

/**
 * Created by Hervé Darritchon on 2019-03-25.
 */
public class JavaMainClass {

    public void main() {
        System.out.printf("this the main java class from where we want to make the move");
        final User user = new User("darritchon hervé", 48);
        // this method will be move to a User
        displayUser(user);
        // this method will be move to a User then in a second time to an AuthentService
        checkpoint(user);
    }

    private void displayUser(User user) {
        final String message = String.format("User %s is %d years old.", user.getName(), user.getAge());
        System.out.printf(message);
    }

    private void checkpoint(User user) {
        if (user.getName().equals("darritchon hervé")) {
            System.out.printf("this is it");
        } else {
            System.out.printf("wtf you are here :D");
        }
    }

}
