package file;

import generator.LogGenerator;

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
		
		File f = new File(filename);
		if(!f.getParentFile().isDirectory())
			f.getParentFile().mkdirs();
		
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
		
		public void write(int size, String filename2){
			
			File f = new File(filename2);
			if(!f.getParentFile().isDirectory())
				f.getParentFile().mkdirs();
			
			try(BufferedWriter out = new BufferedWriter(new FileWriter(filename2, true));){

				
				for(int i = 0; i < size; i++){
					out.write(gen.getLogLine());
					out.newLine();
				}

			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			
	}

}
