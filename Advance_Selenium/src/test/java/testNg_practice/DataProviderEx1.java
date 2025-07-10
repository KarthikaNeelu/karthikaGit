package testNg_practice;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderEx1 {

	@Test(dataProvider="getData")
	public void booktickets(String src,String dest,String passno) {
		System.out.println("book tickets from"+src+"to"+dest+"no of passerngers"+passno);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="bangaore";
		objArr[0][1]="chennai";
		objArr[0][2]="25";
		
		objArr[1][0]="bangalore";
		objArr[1][1]="madurai";
		objArr[1][2]="10";
		
		objArr[2][0]="bangalore";
		objArr[2][1]="hydrabad";
		objArr[2][2]="30";
		return objArr;
	}
		
	}

