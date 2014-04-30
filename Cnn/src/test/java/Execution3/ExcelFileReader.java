package Execution3;

import Base.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Gufran on 4/21/14.
 */
public class ExcelFileReader extends DataReader {


        DataReader dataReader = new DataReader();
        String [][] locators;
        @Test
        public void topNav1() throws IOException {
        String path = "C:\\Users\\Gufran\\Desktop\\Documents\\PeoplenTech Documents\\Class Notes(04-13-14) on Selenium-JAVA\\FrameWorks\\Framework\\excelfile.xls";
        locators = dataReader.fileReader(path);
        for(int i=6; i<locators.length; i++){
            for(int j=0; j<1; j++){
                String locator = locators[i][j];
                // ClickByCss(locator);
                System.out.println(locator);

            }

        }



    }


}
