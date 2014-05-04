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
      //String path = "C:\\Users\\Gufran\\Desktop\\Documents\\PeoplenTech Documents\\Class Notes(04-13-14) on Selenium-JAVA\\FrameWorks\\Framework\\excelfile.xls";
      //  Properties prop = new Properties();
     //  FileInputStream fis = new FileInputStream(System.getProperty(("user.dir")+("\\src\\test\\config\\excelfile.xls")));
           //String  files1 = (System.getProperty(("user.dir")+("\\src\\test\\excelfile2.xls")));
            String  files = System.getProperty(("user.dir")+"\\src\\config\\excelfile2.xls");
           // prop.load(fis);
        locators = dataReader.fileReader(files);
        for(int i=6; i<locators.length; i++){
            for(int j=0; j<1; j++){
                String locator = locators[i][j];
                // ClickByCss(locator);
                System.out.println(locator);

            }

        }



    }


}
