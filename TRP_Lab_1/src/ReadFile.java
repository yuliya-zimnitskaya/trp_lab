import java.io.*;
import java.util.Scanner;

public class ReadFile {
	public static void main( String[] args)
	throws FileNotFoundException, IOException {
		int k=1;
		File file = new File("epa-http.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �������, � ������� ���������� �������� �����: ");
		int b = sc.nextInt();
		System.out.print("������� ���������� �������, ������� ���������� �������: ");
		int c = sc.nextInt();
		sc.close();
		BufferedReader br = new BufferedReader (new InputStreamReader(new FileInputStream(file)));
		String line = null;
		while ((line = br.readLine()) != null) 
		{
			if (k>=b && k<b+c) System.out.println(line);
			else if (k>=b+c) break;
			k++;
		}
		br.close();
	}
}