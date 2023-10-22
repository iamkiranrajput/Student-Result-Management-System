import java.text.DecimalFormat;
import java.util.*;

class StudentRagistration{  
    Scanner s=new Scanner(System.in); 
    static DecimalFormat df = new DecimalFormat("0.00");
    double avg;
    int totalCredits=0,total=0;
    int year;
    String examSem;

    String name,branch,semester,result;
    String []subName=new String [5];
    int enrollmentNo,st,st1,n1;
    int [] mark=new int [5];
    int [] classTestMarks=new int [5];
    int [] manualMarks=new int [5];
    int [] practicalMarks=new int [5];   
    int [] ad=new int [5];
    int [] aad=new int [5];
    int [] credits=new int[5];
                                             
    void register(){        
        System.out.println("\tEnter Your Name:");
        name=s.nextLine();
        name=name.toUpperCase();
        System.out.println("\tEnter Your Enrollement no:");
        enrollmentNo=s.nextInt();
        System.out.println("\tEnter Your Seat No:");
        st=s.nextInt();
        System.out.println("\tsemister year In Followig List FIRST,SECOUND,THIRD,FOURTH,FIFTH,SIXTH");
        semester=s.next();
        semester=semester.toUpperCase();
        
        System.out.println("\tEnter Your Course name in following short form CO,CE,EJ,EL:");
        branch=s.next();
        System.out.println("Year of Exam:");
        year=s.nextInt();
        System.out.println("WINTER/SUMMER: ");
        examSem=s.next();
        examSem=examSem.toUpperCase();
        System.out.println("\tEnter Your 5 Subject name:");
        for(int i=0;i<=4;i++){
            subName[i]=s.next();
            subName[i]=subName[i].toUpperCase();
        }
        
        System.out.println("\tEnter Your Subject Mark & practical Mark:");

        for(int i=0;i<=4;i++){
        System.out.println("\tMark of "+subName[i]);
        mark[i]=s.nextInt();
        System.out.println("\tClass test Mark of: "+subName[i]);
        classTestMarks[i]=s.nextInt();
        System.out.println("\tPractical Manual Mark of: "+subName[i]);
        manualMarks[i]=s.nextInt();
        System.out.println("\tPractical Mark of : "+subName[i]);
        practicalMarks[i]=s.nextInt();
        System.out.println("\tSubject Credits: "+subName[i]);
        credits[i]=s.nextInt();

        }
                                             
    }

    void showData(){
        
        System.out.println("\n\t Want See Your Details...... Press 1");
        n1=s.nextInt(); 
        if(n1==1){
            marksCalculate(credits,mark,classTestMarks,manualMarks,practicalMarks);
            printUserData(totalCredits,total,branch,name,result,semester,enrollmentNo,st,credits,mark,classTestMarks,manualMarks,practicalMarks,subName,ad,aad);
                   
        }
        else
        {
            System.out.println("Invalid No.");    
        }
    }
        
   
 //                 <<<<<<<<<<<< Print user Data >>>>>>>>>>>> 
   
    private void printUserData(int totalCredits,int total,String branch,String name,String result,String semester,int enrollmentNo,int st,int credits[],int mark[],int classTestMarks[],int manualMarks[],int practicalMarks[],String subName[],int ad[],int aad[]) {

                System.out.println("\t\t\t\tWELCOME MR/MS "+name+"\n\n\t\tYour Details..........................");  
        System.out.println("\n___________________________________________________________________________________________________________________________________________________________");      
        System.out.println("\n\n\n\tMR./MS. "+name.toUpperCase());
        System.out.println("\n\tENROLLEMENT NO. "+enrollmentNo+"\tEXAMINATION: '"+examSem+" "+year+"'\tSEAT NO. "+st+"\t\t"+semester+" SEMISTER");  
        switch(branch){
               case "co":
               case "CO": System.out.println("\n\tCOURSE:  'DIPLOMA IN COMPUTER ENGINEERING'");
                          System.out.println("\n\tHEAD OF DEPARTMENT: 'NAGRIK SIR'");
                    break;
                   
               case "ce":
               case "CE": System.out.println("\n\tCOURSE:  'DIPLOMA IN CIVIL ENGINEERING'");
                          System.out.println("\n\tHEAD OF DEPARTMENT: 'PATHAK SIR'");
                    break;

               case "el":
               case "EL": System.out.println("\n\tCOURSE:  'DIPLOMA IN ELECTRICAL ENGINEERING'");
                          System.out.println("\n\tHEAD OF DEPARTMENT: 'JADHAV SIR'");
                    break;

               case "me":
               case "ME": System.out.println("\n\tCOURSE:  'DIPLOMA IN MECHANICAL ENGNEERING'");
                          System.out.println("\n\tHEAD OF DEPARTMENT: 'BHISE SIR'");
                   break;

               default:System.out.println(" YOU ENTERED 'COURSE NAME' IS INVALID");
                    break;
        }

        System.out.println("\n___________________________________________________________________________________________________________________________________________________________");      
        System.out.println("\n\t\t\tTITLE OF COURSE\t\t TH/ \t\t COURSE\t\t\tMARKS\t\t\t TOTAL MARKS\t\tCREDITS"); 
        System.out.println("\n\t\t\t\t\t\t PR\t\t HEAD\t\tMAX.\tMIN.\tOBT.\t\t MAX \t OBT"); 
        System.out.println("\n___________________________________________________________________________________________________________________________________________________________");      
                
                                       // <<<<<<<<<<<  SECTION  >>>>>>>>>>>>
                            // <<<<<<<<<<<<<<    PRINTING SUBJECT MARK     >>>>>>>>>>

        for(int i=0; i<=4; i++){
            System.out.println("\n\n\t"+subName[i]+"\t\t\t\t\t TH\t\t ESE\t\t070\t028\t"+mark[i]+"\t\t 100\t"+ad[i]+"\t\t "+credits[i]);  
            System.out.println("\t\t\t\t\t\t\t\t PA\t\t030\t000\t"+classTestMarks[i]);
            System.out.println("\t\t\t\t\t\t PR\t\t ESE\t\t025\t010\t"+manualMarks[i]+"\t\t 050 \t" +aad[i]); 
            System.out.println("\t\t\t\t\t\t\t\t PA\t\t025\t010\t"+practicalMarks[i]);
        }             
       if((mark[0]>=28)&&(mark[1]>=28)&&(mark[2]>=28)&&(mark[3]>=28)&&(mark[4]>=28)){
           result="CONGRAGULATION YOU ARE 'PASS'";
           
       }
       else if((mark[0]>=18)&&(mark[1]>=28)&&(mark[2]>=28)&&(mark[3]>=28)&&(mark[4]>=28)){
            result="CONGRAGULATION YOU ARE 'PASS'";
            
        }        
        else if((mark[0]>=28)&&(mark[1]>=18)&&(mark[2]>=28)&&(mark[3]>=28)&&(mark[4]>=28)){
            result="CONGRAGULATION YOU ARE 'PASS'";
            
        }
        else if((mark[0]>=28)&&(mark[1]>=28)&&(mark[2]>=18)&&(mark[3]>=28)&&(mark[4]>=28)){
            result="CONGRAGULATION YOU ARE 'PASS'";

        }
        else if((mark[0]>=28)&&(mark[1]>=28)&&(mark[2]>=28)&&(mark[3]>=18)&&(mark[4]>=28)){ 
            result="CONGRAGULATION YOU ARE 'PASS'";
        } 
        else if((mark[0]>=28)&&(mark[1]>=28)&&(mark[2]>=28)&&(mark[3]>=28)&&(mark[4]>=18)){
            result="CONGRAGULATION YOU ARE 'PASS'";
            
        }
        else{
            result="FAIL.";
        }
                           //<<<<<<<<<<<<<<<<FOOTER>>>>>>>>>>>>

        System.out.println("\n\n\t\t\t\t\t\tTOTAL MAX.\t\tRESULT WITH\t\t\t\tTOTAL MARK\t\tTOTAL CREDIT");
        System.out.println("\t\t\t\t\t\t  MARK\t\t\t    %\t\t\t\t        OBTAINED");
        System.out.println("\n\t\t\t\t\t\t  750\t\t\t"+df.format(avg)+"%\t\t\t\t\t "+total+"\t\t\t   "+totalCredits);
        System.out.println("\n\t\t\t\t\t\t\t\t"+result);
        System.out.println();
        System.out.println("\n___________________________________________________________________________________________________________________________________________________________");      

    }

    void marksCalculate(int credits[],int mark[],int classTestMarks[],int manualMarks[],int practicalMarks[]){
        if((totalCredits!=0)&&(total!=0)){
        totalCredits=0;
        total=0;
        }
    for(int i:credits){               //calculating the credit
    totalCredits+=i;
    }    
    for(int i=0; i<=4;i++){             //     addition of class test mark and exam mark\\\\addition manual mark and practical mark
        ad[i]=classTestMarks[i]+mark[i];                       
        aad[i]=practicalMarks[i]+manualMarks[i];                             
    }                                                            
    for(int i=0; i<=4; i++){             //        addition of all subName. mark    <<<TOTAL>>>
        total+=ad[i]+aad[i];                                 
    }      
    avg = total/7.5; 
}

    void student1(){
     
    name="THORAT RAHUL H.";
    result="FAIL.";
    semester="THIRD";
    branch="co";
    examSem="WINTER";
    year=2019;
    // int enrollmentNo,st;
    enrollmentNo=1907770066;
    st=424891;
                            //subject name
    subName[0]="OOP";
    subName[1]="DSU";
    subName[2]="CGR";
    subName[3]="DBMS";
    subName[4]="DTE";
                            //subject marks End Term marks,class test,practical & manual marks

    mark[0]=20;                //marks[]={20,30,40,50,60};
    classTestMarks[0]=15;                   //classTestMarks[]={15,12,23,12};
    manualMarks[0]=19;
    practicalMarks[0]=16;
        
    mark[1]=20;
    classTestMarks[1]=12;
    manualMarks[1]=16;
    practicalMarks[1]=18;
        
    mark[2]=9;
    classTestMarks[2]=21;
    manualMarks[2]=18;
    practicalMarks[2]=19;
        
    mark[3]=29;
    classTestMarks[3]=23;
    manualMarks[3]=18;
    practicalMarks[3]=20;
        
    mark[4]=16;
    classTestMarks[4]=12;
    manualMarks[4]=15;
    practicalMarks[4]=22;
                            //subjects credits
    credits[0]=0;
    credits[3]=8;
    credits[1]=0;
    credits[2]=0;
    credits[4]=0;

    marksCalculate(credits,mark,classTestMarks,manualMarks,practicalMarks);
    printUserData(totalCredits,total,branch,name,result,semester,enrollmentNo,st,credits,mark,classTestMarks,manualMarks,practicalMarks,subName,ad,aad);
}

    void student2(){
     
    name="rajput kiran g.";
    result="FAIL.";
    semester="THIRD";
    branch="co";
    examSem="WINTER";
    year=2019;
    // int enrollmentNo,st;
    enrollmentNo=1907770066;
    st=424891;
                            //subject name
    subName[0]="OOP";
    subName[1]="DSU";
    subName[2]="CGR";
    subName[3]="DBMS";
    subName[4]="DTE";
                            //subject marks End Term marks,class test,practical & manual marks

    mark[0]=65;                //marks[]={20,30,40,50,60};
    classTestMarks[0]=20;                   //classTestMarks[]={15,12,23,12};
    manualMarks[0]=19;
    practicalMarks[0]=16;
        
    mark[1]=63;
    classTestMarks[1]=25;
    manualMarks[1]=16;
    practicalMarks[1]=18;
        
    mark[2]=61;
    classTestMarks[2]=23;
    manualMarks[2]=18;
    practicalMarks[2]=19;
        
    mark[3]=58;
    classTestMarks[3]=26;
    manualMarks[3]=18;
    practicalMarks[3]=20;
        
    mark[4]=68;
    classTestMarks[4]=23;
    manualMarks[4]=15;
    practicalMarks[4]=22;
                            //subjects credits
    credits[0]=7;
    credits[3]=5;
    credits[1]=5;
    credits[2]=8;
    credits[4]=6;

    marksCalculate(credits,mark,classTestMarks,manualMarks,practicalMarks);
    printUserData(totalCredits,total,branch,name,result,semester,enrollmentNo,st,credits,mark,classTestMarks,manualMarks,practicalMarks,subName,ad,aad);
}
       
}
public class StudentRecord{
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String args[])
    {  
        StudentRagistration sr=new StudentRagistration();
        int no,se;
        Scanner s=new Scanner(System.in);

        while(true){
        System.out.println("\n\n\t\t\t\tFor Ragistration press:   1");
        System.out.println("\t\t\t\tAlerady Registered press: 2\n"); 
        no=s.nextInt();

        if(no==1){
         sr.register();
         sr.showData();
        }
        else if(no==2){
            System.out.println("\t\t\t\tEnter Seat No OR Enrollement no:"); 
            se=s.nextInt();
            switch (se){
                case 424891:
                case 1907770066: sr.student1();
                break;
                case 424892:
                case 1907770167: sr.student2();
                break;
                default:System.out.println("INVALID SEAT NO OR ENROLLEMENT NO");
                break;
            }     
        }
    
        System.out.println("Want to Exit (Y/N) :");
        char input=s.next().charAt(0);
        if((input=='y')||(input=='Y')){
        System.out.println("Thank you, Have a Nice Day...\n");
        break;
        }
    }
        s.close();
    }
 
}