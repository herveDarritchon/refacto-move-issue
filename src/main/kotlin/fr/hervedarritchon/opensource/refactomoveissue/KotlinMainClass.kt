package fr.hervedarritchon.opensource.refactomoveissue

/**
 * Created by Hervé Darritchon on 2019-03-25.
 *
 */
import fr.hervedarritchon.opensource.refactomoveissue.models.User

/**
 * Created by Hervé Darritchon on 2019-03-25.
 */
class KotlinMainClass {

    fun main() {
        System.out.printf("this the main java class from where we want to make the move")
        val user = User("darritchon hervé", 48)
        displayUser(user)
        checkpoint(user)
    }

    private fun displayUser(user: User) {
        val message = String.format("User %s is %d years old.", user.name, user.age)
        System.out.printf(message)
    }

    private fun checkpoint(user: User) {
        if (user.name == "darritchon hervé") {
            System.out.printf("this is it")
        } else {
            System.out.printf("wtf you are here :D")
        }
    }

}
