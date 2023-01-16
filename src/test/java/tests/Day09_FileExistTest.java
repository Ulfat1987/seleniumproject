
package tests;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class Day09_FileExistTest{
      /*
    Given
        Create a file on desktop
    When
        Copy the path of file
    Then
        Assert if the file exists
    */

    //"C:\Users\TechPro\Desktop\File.txt"
    @Test
    public void isExistTest(){

        String userDir = System.getProperty("user.dir");//Gives the path of the current project folder
        System.out.println("userDir = " + userDir);//C:\Users\TechPro\IdeaProjects\JUnit


        String userHome = System.getProperty("user.home");//Gives the user folder
        System.out.println("userHome = " + userHome);//C:\Users\TechPro

        //Assert if the file exists
        boolean isExist = Files.exists(Paths.get(userHome+"/Desktop/File.txt"));//Writing the path dynamically,
                                                                                    // so it will work on other computers.
        System.out.println(Files.exists(Paths.get(userDir + "\\src\\test\\java\\tests\\File.txt")));
        assertTrue(isExist);
    }
}
