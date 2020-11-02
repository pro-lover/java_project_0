
package javaapplication6;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class JavaApplication6 {

    public static void main(String[] args) {
        int counter = 0;             //_________________________[Count number of line in the file, help on getting avarage]
        int Sum = 0;                //-------------------------[Sum of all values in the file]
        int StoreInt =0;           //-------------------------[get value from file and store it as integer]
        int maxValue =0;          //-------------------------[store Maximum value from the file]
        int minValue=1000000;    //-------------------------[store Minimum value from the file] 

            try{
            File myObj = new File("C:\\Users\\Sithembiso Sangweni\\Documents\\NetBeansProjects\\java_project_0\\Filef1.txt");
                if(myObj.exists())
                {
                    Scanner myReader = new Scanner(myObj);  
                    while(myReader.hasNextLine())
                    {
                        String data = myReader.nextLine();
                        StoreInt = Integer.parseInt(data);
                        counter++;
                        Sum = Sum + StoreInt;
                        if(StoreInt<minValue){
                            minValue=StoreInt;
                        }
                        if(StoreInt>maxValue)
                        {
                            maxValue=StoreInt; 
                        }
                    }
                    System.out.println("avarage is "+Sum+"/"+counter+" = "+Sum/counter);
                    System.out.println("Minimum value is "+minValue);
                    System.out.println("Maximum Value is "+maxValue);
                }else{
                    System.out.println("file do not exist but do not worry we will create it");
                    try{
                        if(myObj.createNewFile())
                        {
                            System.out.println("File created : "+ myObj.getName());
                            System.out.println("please go to the file that is created for you and add values");
                            System.out.println("On this path"+myObj);
                        }
                    }catch(IOException e){
                    System.out.println("An error accured creating file");
                    e.printStackTrace();
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("An error accured");
                e.printStackTrace();
            }
    }
    
}
