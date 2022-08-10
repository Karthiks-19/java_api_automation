package tests;
import methods.CreateUser;
import methods.GetUsers;
import methods.UpdateAndDeleteUsers;
import org.testng.annotations.Test;


// ---> Here we are taking the data from method package and executing it here by importing

public class GetAndCreateUsers extends BaseTest{

@Test
    public void user() {
        GetUsers.test_2();
            System.out.println("1.First case is pass");
        CreateUser.createUser();
            System.out.println("2.Second case is pass");
        UpdateAndDeleteUsers.updateUser();
            System.out.println("3.User has updated the user details");
        UpdateAndDeleteUsers.deleteUser();
            System.out.println("4.User has deleted");
    }

}
