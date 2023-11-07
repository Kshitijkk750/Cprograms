package FileInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharacter {
		void readCharacters() throws IOException {
			char c=0;
			BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
			System.out.println("Provide sentense to read the characters.");
			do
			{
				c=(char)br.read();
				System.out.println(c);
			}
			while(c!='s');

		}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadCharacter r= new ReadCharacter();
		r.readCharacters();
	}

}
