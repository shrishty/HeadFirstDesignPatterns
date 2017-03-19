package decoratorDesignPattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	private static InputStream in;

	public static void main(String[] args) {
		try {
			int ch;
			in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while((ch = in.read()) >= 0)
			{
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
