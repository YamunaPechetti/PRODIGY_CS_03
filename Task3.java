//Password complexity checker
import java.util.Scanner;
class Task3
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a password: ");
      int length=password.length();
      boolean hasUppercase=false;
      boolean hasLowercase=false;
      boolean hasNumber=false;
      boolean hasSpecialChar=false;
      for(int i=0;i<length;i++)
        {
          char c=password.charAt(i);
          if(Character.isUpperCase(c))
          {
            hasUppercase=true;  //if the password has an uppercase letter
          }
          else
          {
            hasLowercase=true;  //if the password has an lowercase letter
          }
          if(Character.isDigit(c))
          {
            hasNumber=true;  //if the password has a number
          }
          if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*')
          {
            hasSpeacialChar=true;  //if the password has a special character
          }
        }
      if(length>=8 && hasUppercase && hasLowercase && hasNumber && hasSpecialChar)
      {
        System.out.println("Password is Strong.");
      }
      else
      {
        System.out.println("Password is weak.");
      }
    }
  }
