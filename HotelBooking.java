import java.util.Scanner;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
class Info
{
    Info()
    {
        System.out.println("\nHotel Booking Information");
        System.out.println("***********************************");
        room_categories();
        guidlines();
        room_types();
    }
    void room_categories()
    {
        System.out.println("\nCategories Of Rooms :");
        System.out.println("-----------------------\n");
        System.out.println("1.normal rooms");
        System.out.println("[ single room        : 500/perday]");
        System.out.println("[ double room        : 1000/perday]");
        System.out.println("[ triple room        : 1500/perday]");
        System.out.println("[ double double room : 2000/perday]");
        System.out.println("2.suite rooms");
        System.out.println("[ slepping area + living area ]");
        System.out.println("[ cost: 3000/perday]");
        System.out.println("3.connected rooms");
        System.out.println("[ adjacent/adjoining/interconnected rooms ]");
        System.out.println("[ cost: 4000/perday]");
        System.out.println("4.cabana rooms");
        System.out.println("[ near to swimming pool ]");
        System.out.println("[ cost: 3500/perday]");
        System.out.println("5.Accessible rooms");
        System.out.println("[ for physically challenged ]");
        System.out.println("[ cost: 2000/perday]");
        System.out.println("6.luxury rooms");
        System.out.println("[ top most room with city view ]");
        System.out.println("[ cost: 4000/perday]");
    }
    void guidlines()
    {
        System.out.println("\nOther Points :");
        System.out.println("-----------------\n");
        System.out.println("1) No of persons=4 for [2,4,5,6 category rooms] ");
        System.out.println("2) No of persons=8 for [3 category room]");
        System.out.println("3) No charges for below 5 years children");
        System.out.println("4) Only Platinum rooms are available for [2,6 category rooms]");
    }
    void room_types()
    {
        System.out.println("\nTypes Of Rooms :");
        System.out.println("-------------------\n");
        System.out.println("1.silver");
        System.out.println("[ wifi , bathroom ]");
        System.out.println("[ cost: roomcost+50/perday]");
        System.out.println("2.Gold");
        System.out.println("[ wifi , TV , bathroom ]");
        System.out.println("[ cost: roomcost+100/perday]");
        System.out.println("3.platinum");
        System.out.println("[ wifi , TV , kitchen , bathroom ]");
        System.out.println("[ cost: roomcost+200/perday]");
        System.out.println("\n***********************************");
        
    }
} 

class PhoneException extends Exception {}
class EmailException extends Exception {}
class Book 
{
   static String s="";
   static String s1="";
   static String s2="";
  static Scanner sc=new Scanner(System.in);
  static int valid()
  {   int v=0;
      int i=0;
      while(v!=1)
      {
        try 
        {
        i=sc.nextInt(); 
        v=1;
        } catch(InputMismatchException e) {
        System.out.println("Invalid input. Please enter an integer.");
        System.out.print(": ");
        sc.nextLine();
        }
      }
      return i;
  }
    String validPhone()
    {   
      int v=0;
      String i="";
      while(v!=1)
      {
        try 
        {
         i=sc.next();
         try
         {
         if(i.matches("[1-9]+"))
         {
             if((i.length()==10))
             { v=1; }
             else
             {throw new PhoneException();}
         }
         else
         {throw new Exception();}
         }
         catch(PhoneException e) {
        System.out.println("Invalid input. Please enter correct phone number");
        System.out.print(": ");
        sc.nextLine();
        }
        } 
        catch(Exception e) {
        System.out.println("Invalid input. Please enter numbers only.");
        System.out.print(": ");
        sc.nextLine();
        }
      }
      return i;
  }
  String validEmail()
  {   int v=0;
      String i="";
      while(v!=1)
      {
        try 
        {
         i=sc.next();
         
         if(i.endsWith("@gmail.com"))
         {
             try {
             if((i.length()>10))
             { v=1; }
             else
             {throw new EmailException();}
             }
             catch(EmailException e) {
             System.out.println("Invalid input. Please enter correct email");
             System.out.print(": ");
             sc.nextLine();
        }
        }
         else
         {throw new Exception();}
        } 
        catch(Exception e) {
        System.out.println("Invalid input. Email should end @gmail.com.");
        System.out.print(": ");
        sc.nextLine();
        }
      }
      return i;
  }
   String valid2()
  {   int v=0;
      String i="";
      while(v!=1)
      {
        try 
        {
         sc.nextLine();
         i = sc.nextLine().trim();
         if (!i.isEmpty() && i.matches("[a-zA-Z\\s]+")) 
         {v = 1;}
         else
         {throw new Exception();
        } 
        }catch(Exception e) {
        System.out.println("Invalid input. Please enter correctly.");
        System.out.print(": ");
        sc.nextLine();
        }
      }
      return i;
  }
  int roomCategory()
    {
        System.out.println("select room category");
        System.out.print("1.normal rooms 2.suite rooms 3.connected rooms ");
        System.out.println("\n4.cabana rooms 5.accessible rooms 6.luxury rooms");
        System.out.print(": ");
        return valid();
    }
    int roomCategory2(int i)
    {
        int cat2=0;
        switch(i)
        {
            case 1:System.out.println("select 1.single room 2.double room 3.triple room 4.double double room");
                   do
                   {
                       System.out.print(": ");
                       cat2=10+valid(); 
                       if((cat2<=10) || (cat2>14))
                        System.out.println("Error: invalid option selected");
                   }while((cat2<=10) || (cat2>14));
                 break;
            case 3: System.out.println("select 1.adjacent room 2.adjoining room 3.interconnected room");
                   do
                   {
                       System.out.print(": ");
                       cat2=20+valid(); 
                       if((cat2<=20) || (cat2>23))
                        System.out.println("Error: invalid option selected");
                   }while((cat2<=20) || (cat2>23));
                 break;
        }
        return cat2;
    }
    int roomCategory22(int i)
    {
        int cat2=0;
        switch(i)
        {
            case 1:System.out.println("select 1.double room 2.triple room 3.double double room");
                   do
                   {
                       System.out.print(": ");
                       cat2=10+valid(); 
                       if((cat2<=10) || (cat2>13))
                        System.out.println("Error: invalid option selected");
                   }while((cat2<=10) || (cat2>13));
                 break;
            case 3: System.out.println("select 1.adjacent room 2.adjoining room 3.interconnected room");
                   do
                   {
                       System.out.print(": ");
                       cat2=20+valid(); 
                       if((cat2<=20) || (cat2>23))
                        System.out.println("Error: invalid option selected");
                   }while((cat2<=20) || (cat2>23));
                 break;
        }
        return cat2;
    }
    int roomType()
    {
      System.out.println("select room type");
      System.out.println("1.silver 2.gold 3.platinum");
      System.out.print(": ");
      return valid();
    }
    int noOfRooms()
    {
      System.out.println("select no of rooms");
      System.out.print(": ");
      return valid();
      
    }
    int noOfAdults()
    {
      System.out.println("enter no of adults");
      System.out.print(": ");
      return valid();
    }
    int noOfChild()
    {
      System.out.println("enter no of child");
      System.out.print(": ");
      return valid();
    } 
    int noOfDays()
    {
        System.out.println("enter no of days to stay");
        System.out.print(": ");
        return valid();
    }
  void select()
  {
        int r,a,c,cat,cat2=0,typ,total=0,stay,cat22check=0;;
        System.out.println("\nEnter Details ");
        System.out.println("*********************");
        int correct=0;
        do
        {
            
          System.out.println();
          a=noOfAdults();
          while(a<=0)
          {
            System.out.println("Error: invalid no of adults entered");
            System.out.print(": ");
            a=valid();
          }
          
          System.out.println();
          total=a;
          c=noOfChild();
          if(c>0)
          {
             s1+="\nNo of child= "+c;
            int[] cArray=new int[c];
            for(int i=1;i<=c;i++)
            {
                System.out.println("enter child"+i+" age");
                System.out.print(": ");
                cArray[i-1]=valid();
                while(cArray[i-1]<1 || cArray[i-1]>12)
                {
                    while(cArray[i-1]<=0)
                    {
                        System.out.println("Error: invalid age entered ");
                        System.out.print(": ");
                        cArray[i-1]=valid();
                    }
                    while(cArray[i-1]>12)
                    {
                        System.out.println("Error: age>12 is not considered as child");
                        System.out.print(": ");
                        cArray[i-1]=valid();
                    }
                }
                System.out.println("child"+i+" age entered");
                s1+="\nchild"+i+" age: "+cArray[i-1];
            }
            total=a+c;
            for(int i=0;i<c;i++)
            {
                if(cArray[i]<6)
                {
                    total=total-1;
                }
                if(cArray[i]>=6)
                {
                    cat22check=1;
                }
            }
          }
            System.out.println();
          cat=roomCategory();
          while(cat<=0 || cat>6)
          {
             System.out.println("Error: invalid option selected");
             System.out.print(": ");
             cat=valid();
             
          }
          
          if((cat==1) || (cat==3))
          { 
              System.out.println();
              if(cat22check==0)
              {cat2=roomCategory2(cat);}
              else
              {cat2=roomCategory22(cat);}
              
          }
          

          if((cat==2)||(cat==6))
          {
            typ=3;
          }
          else
          {
            System.out.println();
            typ=roomType();
            while((typ<=0)||(typ>3))
            {
              System.out.println("Error: invalid option selected");
              System.out.print(": ");
              typ=valid();
            }   
          }
          System.out.println();
          r=noOfRooms();
          while(r<=0)
          {
              System.out.println("Error: invalid no of rooms selected");
              System.out.print(": ");
              r=valid();
          }
         
          
          System.out.println();
          stay=noOfDays();
          while(stay<=0)
          {
              System.out.println("Error: invalid no of days entered");
              System.out.print(": ");
              stay=valid();
          }
          if((cat!=0)&&(typ!=0)&&(r!=0)&&(a!=0))
          {
              if((((cat==1)||(cat==3))&&(cat2!=0)))
              {correct=1;}
              if((cat!=1)&&(cat!=3))
              {correct=1;}
          }
        }while(correct!=1);
        
        if(cat==1)
        {
            if((cat2==11))
            {
                if(cat22check==0)
                 { 
                    int rtotal=r*1;
                    roomallocation1(r,total,500,stay,typ,rtotal,1); 
                 }
                 else
                 {
                     int rtotal=r*2;
                     roomallocation1(r,total,1000,stay,typ,rtotal,2);
                 }
            }
            else if(cat2==12)
            {
                if(cat22check==0)
                 { 
                    int rtotal=r*2;
                    roomallocation1(r,total,1000,stay,typ,rtotal,2); 
                 }
                 else
                 {
                     int rtotal=r*3;
                     roomallocation1(r,total,1500,stay,typ,rtotal,3);
                 }
            }
            else if(cat2==13)
            {
                if(cat22check==0)
                 { 
                    int rtotal=r*3;
                    roomallocation1(r,total,1500,stay,typ,rtotal,3); 
                 }
                 else
                 {
                     int rtotal=r*4;
                     roomallocation1(r,total,2000,stay,typ,rtotal,4);
                 }
            }
            else if(cat2==14)
            {
                int rtotal=r*4;
                roomallocation1(r,total,2000,stay,typ,rtotal,2);
            }
        }
        else if(cat==2)
        {
            int rtotal=r*4;
            roomallocation2(r,total,3000,stay,typ,rtotal,2);
        }
        else if(cat==3)
        {
          int rtotal=r*8;
          if(cat2==21)
          {roomallocation1(r,total,4000,stay,typ,rtotal,21);}
          if(cat2==22)
          {roomallocation1(r,total,4000,stay,typ,rtotal,22);}
          if(cat2==23)
          {roomallocation1(r,total,4000,stay,typ,rtotal,23);}
        }
        else if(cat==4)
        {
           int rtotal=r*4;
           roomallocation2(r,total,3500,stay,typ,rtotal,4); 
        }
        else if(cat==5)
        {
           int rtotal=r*4;
           roomallocation1(r,total,2000,stay,typ,rtotal,5); 
        }
        else if(cat==6)
        {
           int rtotal=r*4;
           roomallocation2(r,total,4000,stay,typ,rtotal,6); 
        }
        int f=transaction();
        if(f==1)
        {
	    System.out.println(":::::::::Rooms Are Booked:::::::::");
	    LogBook l=new LogBook(a,typ,stay);
	    if(c==0)
	    { l.writeIntoFile(s,s2); }
	    else
	     { l.writeIntoFile(s,s1,s2); }
        }
        else
        {
	    System.out.println("\nCancelled ..........!");
        }
    }
    
	void roomallocation1(int r,int total,int wp,int stay,int typ,int rtotal,int z)
	{
	                int h=0;
	                switch(typ)
                        {
                            case 1:wp+=50;h=50;break;
                            case 2:wp+=100;h=100;break;
                            case 3:wp+=150;h=150;break;
                        }
                     int cost=r*wp*stay;
                     int cost2=cost;
                     System.out.println("\nRoom Allocation Details");
                     System.out.println("-----------------------------");
                     switch(z)
                         {
                             case 1:System.out.println(r+"x single room = "+cost);
                                    s+=r+"x single room = "+cost+"\n";
                                    break;
                             case 2:System.out.println(r+"x double room = "+cost);
                                    s+=r+"x double room = "+cost+"\n";
                                    break;
                             case 3:System.out.println(r+"x triple room = "+cost);
                                    s+=r+"x triple room = "+cost+"\n";
                                    break;
                             case 4:System.out.println(r+"x double double room = "+cost);
                                    s+=r+"x double double room = "+cost+"\n";
                                    break;
                             case 5:System.out.println(r+"x Accessible room = "+cost);
                                    s+=r+"x Accessible room = "+cost+"\n";
                                    break;
                             case 21:System.out.println(r+"x adjacent room = "+cost);
                                     s+=r+"x adjacent room = "+cost+"\n";
                                     break;
                             case 22:System.out.println(r+"x adjoining room = "+cost);
                                     s+=r+"x adjoining room = "+cost+"\n";
                                     break;
                             case 23:System.out.println(r+"x interconnected rooms = "+cost);
                                     s+=r+"x interconnected rooms = "+cost+"\n";
                                     break;
                         }
                     if(rtotal<total)
                     {
                         int d=total-rtotal;
                         System.out.println("insufficient rooms are selected");
                         System.out.println("so extra rooms are selected (charges apply)");
                         if(d==1)
                         {
                            cost+=(1*(500+h)*stay);
	                        System.out.println("1x single room = "+(cost-cost2)); 
	                        s+="1x single room = "+(cost-cost2)+"\n";
                         }
                         else if(d%2==0)
	                     {
	                         int k=d/2;
	                         if((d%2)!=0)
	                         {
	                           k=k+1; 
	                         }
	                         cost+=(k*(1000+h)*stay);
	                         System.out.println(k+"x Double room = "+(cost-cost2));
	                         s+=k+"x Double room = "+(cost-cost2)+"\n";
	                     }
	                     else if(d%3==0)
	                     {
	                       int k=d/3;
	                       if((d%3)!=0)
	                       {
	                         k=k+1; 
	                       }
                           cost+=(k*(1500+h)*stay); 
                           System.out.println(k+"x Triple room = "+(cost-cost2));
                           s+=k+"x Triple room = "+(cost-cost2)+"\n";
	                     }
	                    else
	                    {
	                      int k=d/4;
	                      if((d%4)==1)
	                      {
	                        cost+=(1*(500+h)*stay);
	                        System.out.println(1+"x single room = "+(cost-cost2));
	                        s+="1x single room = "+(cost-cost2)+"\n";
	                      }
	                      if((d%4)==2)
	                      {
	                        cost+=(1*(1000+h)*stay);
	                        System.out.println("1x double room = "+(cost-cost2));
	                        s+="1x double room = "+(cost-cost2)+"\n";
	                      }
	                      if((d%4)==3)
	                      {
	                        cost+=(1*(1500+h)*stay);
	                        System.out.println("1x Triple room = "+(cost-cost2));
	                        s+="1x Triple room = "+(cost-cost2)+"\n";
	                      }
	                      int cost3=(k*(2000+h)*stay);
	                      cost+=cost3;
	                      System.out.println(k+"x Double Double room = "+cost3);
	                      s+=k+"x Double Double room = "+cost3+"\n";
	                    }
                     }
	                    System.out.println("-----------------------------");;
	                    System.out.println("Total cost = "+cost+"\n");
	                    s+="Total cost = "+cost+"\n";
	}
	void roomallocation2(int r,int total,int wp,int stay,int typ,int rtotal,int z)
	{
	                 int h=0;
	                 switch(typ)
                        {
                            case 1:wp+=50;h=50;break;
                            case 2:wp+=100;h=100;break;
                            case 3:wp+=150;h=150;break;
                        }
                     int cost=r*wp*stay;
                     int cost2=cost;
                     System.out.println("\nRoom Allocation Details");
                     System.out.println("-----------------------------");
                     switch(z)
                     {
                         case 2:System.out.println(r+"x suite room = "+cost);
                                s+=r+"x suite room = "+cost+"\n";
                                break;
                         case 4:System.out.println(r+"x cabana room = "+cost);
                                s+=r+"x cabana room = "+cost+"\n";
                                break;
                         case 6:System.out.println(r+"x luxury room = "+cost);
                                s+=r+"x luxury room = "+cost+"\n";
                                break;
                     }
                     if(rtotal<total)
                     {
                         int d=total-rtotal;
                         System.out.println("insufficient rooms are selected");
                         System.out.println("so extra rooms are selected (charges apply)");
	                      int k=d/4;
	                      if((d%4)!=0)
	                      {
	                          k=k+1; 
	                      }
	                      switch(z)
                         {
                           case 2:cost+=(k*(3000+h)*stay);
                                  System.out.println(k+"x suite room = "+(cost-cost2));
                                  s+=k+"x suite room = "+(cost-cost2)+"\n";
                                  break;
                           case 4:cost+=(k*(3500+h)*stay);
                                  System.out.println(k+"x cabana room = "+(cost-cost2));
                                  s+=k+"x cabana room = "+(cost-cost2)+"\n";
                                  break;
                           case 6:cost+=(k*(4000+h)*stay);
                                  System.out.println(k+"x luxury room = "+(cost-cost2));
                                  s+=k+"x luxury room = "+(cost-cost2)+"\n";
                                  break;
                         }
	                 }
	                    System.out.println("-----------------------------");
	                    System.out.println("Total cost = "+cost);
	                    s+="Total cost = "+cost;
	                    
	}
	int transaction()
	{
	    System.out.println("\nselect the option");
	    System.out.println("1.Make payment 2.cancel");
	    System.out.print(": ");
	    int m=valid();
	     while((m>2)||(m<1))
	     {
	        System.out.println("Error: invalid option selected");
            System.out.print(": ");
            m=valid(); 
	     }
	     if(m==1)
	     {
	         payment();
	         return 1;
	     }
	     else
	     {return 0;}
	}
	void payment()
	{
	    
	    System.out.println("\nenter your name");
	    System.out.print(": ");
	    String name=valid2();
	    s2+="Name= "+name;
	    
	    System.out.println("\nenter your phone number");
	    System.out.print(": ");
	    String phone=validPhone();
	    s2+="\nPhone Number= "+phone;
	    
	    System.out.println("\nenter your email");
	    System.out.print(": ");
	    String email=validEmail();
	    s2+="\nEmail= "+email;
	    
	    System.out.println("\nselect payment type");
	    System.out.println("1.UPI 2.Credit/Depit Card 3.Netbanking");
	    System.out.print(": ");
	    int p=valid();
	    while((p>3)||(p<1))
	     {
	        System.out.println("Error: invalid option selected");
            System.out.print(": ");
            p=valid(); 
	     }
	     switch(p)
	     {
	         case 1:s2+="\nPayment type= UpI";break;
	         case 2:s2+="\nPayment type= Credit/Depit Card";break;
	         case 3:s2+="\nPayment type= Netbanking";break;
	     }
	    System.out.println("\n:::::::::Payment Success::::::::::");
	    
	}
  int rooms(int a2,int c2,int r2)
  {
      int t=(a2+c2)-r2*4;
        if(t>0)
        { 
            int k=r2+(t/4);
            if(t%4!=0)
            {
                k=k+1;
            }
            return k;
        }
        else
        {
            return r2;
        }
   }
}
class LogBook 
{
  BufferedWriter writer;
  int adults;
  int typ;
  int n;
  LogBook(int a,int typ,int n)
  {
     try  
     {
         this.typ=typ;
         adults=a;
         this.n=n;
         writer = new BufferedWriter(new FileWriter("hotelrecord.txt",true));
     }
     catch (IOException e) {
        System.out.println("file not found");
         }
  }
  void writeIntoFile(String s0,String s10,String s20)
  {
    try {
    writer.write(s20);
    writer.write("\nNo of adults= "+adults);
    writer.write(s10);
    writeroomtype(typ);
    writer.write("\nNo of days stayed= "+n+"\n");
    writer.write(s0);
    writer.write("\n");
    writer.flush();
    writer.close();
    }
    catch (IOException e) {
        System.out.println("error in writing to file");
         }
  }
  void writeIntoFile(String s0,String s20)
  {  
    try {
    writer.write(s20);
    writer.write("\nNo of adults= "+adults);
    writeroomtype(typ);
    writer.write("\nNo of days stayed= "+n+"\n");
    writer.write(s0);
    writer.write("\n");
    writer.flush();
    writer.close();
    }
    catch (IOException e) {
        System.out.println("error in writing to file");
         }
  }
  void writeroomtype(int typ)
  {
    try {
      switch(typ)
      {
          case 1:writer.write("\nRoom type= Silver");break;
          case 2:writer.write("\nRoom type= Gold");break;
          case 3:writer.write("\nRoom type= Platinum");break;
      }
    }
    catch (IOException e) {
        System.out.println("error in writing to file");
         }
  }
}
class HotelBooking
{
    public static void main(String[] args)
    {
        System.out.println("\n*****************************");
        System.out.println("WELCOME TO HOTEL BBOKING SITE");
        System.out.println("*****************************");
        
        int e;
        do 
        {
        System.out.print("\n1.Enter 2. Help 3.Exit ");
        System.out.print("\nenter choice = ");
        e=Book.valid();
        switch(e)
        {
            case 1: Book b=new Book();
                    b.s="";
                    b.s1="";
                    b.s2="";
                    b.select();
                    break;
            case 2: new Info();
                    break;
            case 3: System.out.println("\nTHANK YOU FOR VISITING");
                    System.out.println("***************************************");
                    break;
            default: System.out.println("please enter the correct choice");
        }
        }while(e!=3);

    }
}