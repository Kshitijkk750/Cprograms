package FileInputOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLIne {
		void readCharacters() throws IOException {
			String c;
			BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
			System.out.println("Provide sentense to read the characters.");
			do
			{
				c=(String)br.readLine();
				System.out.println(c);
			}
			while(c!="stop");

		}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadCharacter r= new ReadCharacter();
		r.readCharacters();
	}

}

