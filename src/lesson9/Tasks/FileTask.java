package lesson9.Tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileTask {
	
	

	public static void main(String[] args) {

		List<String> lines;
		File file = new File("..\\HomeTask1\\data\\mytext.txt");
		
		lines = new ArrayList<String>();
		try(BufferedReader buff = new BufferedReader( new InputStreamReader(new FileInputStream(file)))){			
			String line;
			while((line = buff.readLine()) != null){
				lines.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("File Not Found!!!");
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		int i = 0;
		int min = 10000;
		int max = 0;
		int imax = 0,imin = 0;
		
		for(String line:lines){
			System.out.println("Line "+ i++ +" size: "+line.length());
			if(line.length()<min){
				min = line.length();
				imin=i;
			}
			if(line.length()>max){
				max = line.length();
				imax=i;
			}
		}
		
		System.out.println("The longest line : " + lines.get(imax-1));
		System.out.println("The shortest line : " + lines.get(imin-1));
		System.out.println("Lines that include substring \"var\": ");
		
		for(String line:lines){
			if(line.contains("var")){
				System.out.println(line);
			}
		}
		
		
		
		
	}

}
