package Registration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration1{
	//private String name;
    private String userName;
    private String EmailAddress;
    private String Password;
    private String RetypePassword ;
    //private Boolean Gender;
	private File file;
    private FileWriter writer;
    private Scanner sc;
    

    //Empty Constructor
    public Registration1()
    {
        //this.name="";
    }

    public Registration1(String userName,String EmailAddress,String Password,String RetypePassword/*,Boolean Gender*/)
    {
        this.userName=userName;
        this.EmailAddress=EmailAddress;
        this.Password=Password;
        this.RetypePassword=RetypePassword;
        //this.Gender=Gender;
    }
	
	

    //setter & getter method
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
    
	public void setPassword(String Password) {
        this.Password = Password;
    }
	public void setRetypePassword(String RetypePassword){
	    this.RetypePassword = RetypePassword;
    }
	/*public void setGender(Boolean Gender){
	    this.Gender = Gender;
	}*/
	public String getuserName() {
        return userName;
    }
    public String getEmailAddress() {
        return EmailAddress;
    }
    public String getPassword() {
        return Password;
    }
    public String getRetypePassword() {
        return RetypePassword;
    }
	/*public Boolean getGender(){
	     return Gender;
    }*/

    public void addAccount()
    {
        try
        {
            file = new File("bin\\files\\Users.txt.");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getuserName()+"\t");
            writer.write(getEmailAddress()+"\t");
            writer.write(getPassword()+"\t");
            writer.write(getRetypePassword()+"\t");
            //writer.write(getGender()+"\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public boolean getAccount(String userName,String Password)
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
                if(value[0].equals(userName) && value[2].equals(Password))
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
