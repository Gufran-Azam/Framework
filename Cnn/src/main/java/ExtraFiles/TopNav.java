package ExtraFiles;

import Base.DataReader;

import java.io.IOException;

/**
 * Created by Gufran on 4/22/14.
 */
public class TopNav extends Page {


    DataReader dataReader = new DataReader();
    String [][] locators;
   // @Test
    public void topNav1() throws IOException {
        String path = "C:\\Users\\Gufran\\Desktop\\Documents\\PeoplenTech Documents\\Class Notes(04-13-14) on Selenium-JAVA\\FrameWorks\\Framework\\excelfile2.xls";
        locators = dataReader.fileReader(path);
        for(int i=6; i<locators.length; i++){
            for(int j=1; j<2; j++){
                String locator = locators[i][j];
                 ClickByCss(locator);
                System.out.println(locator);

            }

        }



    }
}
