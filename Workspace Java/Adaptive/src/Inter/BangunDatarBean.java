package Inter;

import java.util.Scanner;

public class BangunDatarBean extends CommonBean{
	BangunDatarService bangunDatarService = new BangunDatarServiceImpl();


	public static void main(String[] args) {
		
		BangunDatarBean bangunDatarBean = new BangunDatarBean();
		bangunDatarBean.run();
	}
		public void run(){

			bangunDatarService.menu();
		}		
} 
	
	