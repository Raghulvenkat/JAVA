package JAVA;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.util.Date;

public class AmigoscodeImportKeywords {
    public static void main(String[] args){
        String name = new String();// String is from java.lang module, java IDE dont import it
        java.util.Date date = new java.util.Date();// instead of importing, we can directly access the module here
        //LocalDate localdate = Localdate.now();
        LocalDateTime localdatatime = LocalDateTime.now();
        //Date date1 = new Date();//Sincethe date is from sql module,it automatically changes by IDE

        /* Reserved keywords are used only by language, some examples are */
        //int class = 0; -> this doesn't work
        int num = 0;//this can work here
    }
}
