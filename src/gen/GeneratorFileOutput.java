package gen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratorFileOutput {

	private String filename;
	private LogGenerator gen;

	public GeneratorFileOutput(LogGenerator gen, String filename){
		this.gen = gen;
		this.filename = filename;
	}

	public void write(int size){

		try(BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));){
	
			for(int i = 0; i < size; i++){
				out.write(gen.getLogLine());
				out.newLine();
			}

		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}



	//LogGenerator gen = new DelimLogGenerator(new SmsLogFormat(), "|", false,  "=", true);


}
