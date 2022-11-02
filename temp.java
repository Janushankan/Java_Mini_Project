
import java.util.Arrays;
import java.util.Scanner;

public class temp {
    public static float percentage(float[] per){//1
        float x=0;
        for(int i=0;i<8;i++){//2
            if(per[i]>0 && per[i]<=100){
                x=x+per[i];
            }//3

        }//2
        return x;
    }//1

    public static void Output(float[] gpa,String[] op, int total, String[] enrolment_number){
        System.out.println("\n\nUva Wellassa University of Sri Lanka");
        System.out.println("\t\tResults\n\n");

        System.out.print("Enrolment number  ");
        System.out.print("GPA      ");
        System.out.println("Selected Discipline");

        for(int i=0;i<total;i++){
            System.out.printf(enrolment_number[i]);
            System.out.print("   ");
            System.out.print(gpa[i]);
            System.out.print("   ");
            System.out.printf(op[i]);
            System.out.printf("\n");
        }

    }

    public static String[] Process(float[] a, float[] b, int c, int[][] cor, String[] eng_types, int[] number){//4    //temp returning float array
        int j=0;
        int[] d= new int[8];
        //d[0]=d[1]=d[2]=d[3]=d[4]=d[5]=d[6]=d[7]=1;
        String[] output = new String [c];

        for(int i=0;i<c;i++){//1
            int  l=0;
            for(j=0;j<c;j++){
                if(a[i]==b[j]){    //this will give the index of input
                    int e=cor[j][l];

                    for(int element: number){
                        System.out.print(element);
                    }

                    System.out.print(j);
                    System.out.print(l);
                    System.out.print("dsdd");

                    switch(e) {

                        case 1:{
                            if(d[0]<=number[0]){
                                output[i]=eng_types[0];
                                d[0]++;
                                System.out.print("dsdddd");
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                            break;
                        }

                        case 2:{
                            int d2=1;
                            if(d[1]<=number[1]){
                                output[i]=eng_types[1];
                                d[1]++;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                            break;
                        }

                        case 3:{
                            if(d[2]<=number[2]){
                                output[i]=eng_types[2];
                                d[2]++;
                                break;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                        }

                        case 4:{
                            if(d[3]<=number[3]){
                                output[i]=eng_types[3];
                                d[3]++;
                                break;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                        }

                        case 5:{
                            if(d[4]<=number[4]){
                                output[i]=eng_types[4];
                                d[4]++;
                                break;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                        }

                        case 6:{
                            if(d[5]<=number[5]){
                                output[i]=eng_types[5];
                                d[5]++;
                                break;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                        }

                        case 7:{
                            if(d[6]<=number[6]){
                                output[i]=eng_types[6];
                                d[6]++;
                                break;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                        }

                        case 8:{
                            if(d[7]<=number[7]){
                                output[i]=eng_types[7];
                                d[7]++;
                                break;
                            }
                            else{
                                l++;
                                continue LOOP;
                            }
                        }

                    }

                }

            }

        }
        return output;
    }

    public static void main(String args[]) {

        int i=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Uva Wellassa University of Sri Lanka");
        System.out.println("Enter the the percentage of intake for each disciplines");

        String c[]={"1.Biomedical_Engineering","2.Electrical_Engineering","3.Chemical_&_Process_Engineering",
                "4.Electronic and Telecommunication Engineering","5.Civil Engineering","6.Mechanical Engineering",
                "7.Computer Science & Engineering","8.Materials Science & Engineering"};

        float[] percent = new float[8];

        for(int p=0;p<8;p++){
            System.out.printf(c[p]+":");
            percent[p]=scan.nextFloat();
        }

        float validity_of_percentage=percentage(percent);

        if(validity_of_percentage==100){

            int y;

            System.out.println("Uva Wellassa University of Sri Lanka");
            System.out.print("Enter the number of students you\'re going to process:");

            y=scan.nextInt();

            int[] num = new int[8];

            for(i=0;i<8;i++){//1    num=no of people we've gonna intake
                num[i]= y*(int)percent[i]/100;
            }//1

            float gpa[] = new float[y];
            float[] newgpa = new float[y];
            int course[][]= new int[y][];
            String en_num[] = new String[y];

            for(int r=0;r<y;r++){//2

                System.out.printf("\nEnter the enrolment number of the student %d:",r+1);
                scan.nextLine();
                en_num[r]=scan.nextLine();

                System.out.printf("\nEnter the GPA of the student %d:",r+1);

                gpa[r]=scan.nextFloat();

                //check validity of gpa must be included here

                System.out.printf("\nEnter the number of courses student %d likes to apply:",r+1);

                int num1=scan.nextInt();

                System.out.printf("\n");

                for(int j=0;j<8;j++){//3
                    System.out.printf(c[j]+"\n");
                }//3

                course[r]= new int[num1];

                for(int l=0;l<num1;l++){//4
                    System.out.printf("\nEnter the selection %d of student %d:",r+1,r+1);
                    course[r][l]=scan.nextInt();
                }//4

            }//2

            newgpa=gpa;
            Arrays.sort(gpa);

            System.out.println(newgpa);
            System.out.println(gpa);

            String[] op=Process(newgpa,gpa,y,course,c,num);


            Output(newgpa,op,y,en_num);


        }
        else
            System.out.println("Input was incorrect");
    }
}


