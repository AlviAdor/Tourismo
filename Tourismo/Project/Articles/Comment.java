package Articles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Comment{
    private String comment;
	private File file;
    private FileWriter writer;
    private Scanner sc;
	
	public Comment()
    {
        this.comment="";
    }
	
	public Comment(String comment)
	{
        this.comment=comment;   
    }
	
	public void setComment(String Comment) {
        this.comment = comment;
    }
	public String getComment() {
        return comment;
    }
	public void addComment()
    {
        try
        {
            file = new File("bin\\files\\Comments.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getComment()+"\t");
            writer.flush();
            writer.close();
        }
		catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
	}
	
	public boolean getAccount(String userComment)
    {
        boolean isAuth = false;
        String path ="bin\\files\\Users.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userComment))
                {
                    isAuth=true;
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuth;
    }

}







