package genericutilities;
/**
 * This interfce contains the external file paths
 * @author Ravi
 */
public interface IConstantpath {
	String PROPERTIES_PATH  = System.getProperty("user.dir") + "\src\\test\\resources\\VtigerCRN_commonData.properties";
	String EXCEL_PATH = System.getProperty("user.dir") + "\src\\test\\resources\\VtigerCRN_commonData.properties";
	String JDBC_URL = "jdbc:mysql://localhost:3306/adv";
    
}
