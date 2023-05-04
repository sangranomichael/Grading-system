import java.util.*;
public class Main {
    public static void main(String[] args) {
  
        String username = "josh";
        String password = "gwapoko";
        
        System.out.println("COGON ELEMENTARY SCHOOL");
        System.out.println("Zone 3, Cogon, El Salvador City \n");
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Login");
            System.out.print("Username: ");
            String input_username = input.nextLine();
            System.out.print("Password: ");
            String input_password = input.nextLine();
            if (!input_username.equals(username) || !input_password.equals(password)){
                System.out.println("Incorrect Username or Password Try Again!");
            }else{
                System.out.println("\nWelcome");
                break;
            }
        }
        
        String[] students = {"Abang, Max", "Bongcag, Yolj",
                        "Bonggo, Niel", "Bulagao, Khent", 
                        "Buna, Nyl"};
        
        double[] grades = {0.0, 0.0, 0.0, 0.0, 0.0};
        double[] pt_scores = {0.0, 0.0, 0.0, 0.0, 0.0};
        double[] qa_scores = {0.0, 0.0, 0.0, 0.0, 0.0};
        double[] ww_scores = {0.0, 0.0, 0.0, 0.0, 0.0};
        String[] statuses = {"PASSED", "PASSED", "PASSED", "PASSED", "PASSED"};
        int student_count = students.length;
        
        
        double perfect_pt_score = 0.0;
        double perfect_qa_score = 0.0;
        double perfect_ww_score = 0.0;
        
        int pt_input_counter = 0;
        int ww_input_counter = 0;
        int qa_input_counter = 0;

        while(true){
            int action_ID = viewNavigation();
      
            if(action_ID > 3){
                System.out.println("Invalid Selection");
            }
            
            if (action_ID == 1){
                System.out.println("View Students\n");
            
                System.out.println("Student Name\t\tPT score\tQA score\tWW score\tFinal Grade: ");
        
                for(int i =0;i< student_count;i++){
                    System.out.println(students[i] + "\t\t" + pt_scores[i] + "\t\t" + qa_scores[i] + "\t\t" + 
                    ww_scores[i] + "\t\t" + grades[i]);
                }
            
            }else if (action_ID == 2){
                System.out.println("Grade Students");
                
                int input_score_type_ID = 0;
                
                while(true){ 
                    input_score_type_ID = viewScoreTypes();
                    if(input_score_type_ID > 3){
                        System.out.print("Invalid Score Type Selection\n");
                    }else{
                        break;
                    }
                }
                
                
                if(input_score_type_ID == 1){
                    System.out.println("Performance Task");
        
                    for(int i =0;i< student_count;i++){
                        System.out.println((i+1) + " --- " + students[i]);
                    }
                
                    System.out.print("Please input student ID: ");
                    int student_id = input.nextInt();
                    
                    if(student_id > 0 && student_id <= student_count){
                        String selected_student = students[student_id - 1];
                        System.out.println("You selected student " + selected_student + "\n");
                        
                        if(perfect_pt_score == 0){
                            System.out.print("Please input Performance Task perfect score: ");
                            perfect_pt_score = input.nextDouble();
                        }
                        double pt_score = 0.0; 
                        while(true){
                            System.out.print("Please enter Performance Task total score:  ");
                            pt_score = input.nextDouble();
                            if (pt_score > perfect_pt_score){
                                System.out.println("Invalid Score, Please Input Again");
                            }else{
                                double pt_partial = ((pt_score / perfect_pt_score) * 100);
                                System.out.println("Performance Task partial score is " + pt_partial);
                                pt_scores[student_id - 1] = pt_score;
                                pt_input_counter++;
                                break;
                            }
                        } 
                    }else{
                        System.out.print("Student Not Found!");
                    }
                    
                }else if (input_score_type_ID == 2){
                    System.out.println("Written Works");
        
                    for(int i =0;i< student_count;i++){
                        System.out.println((i+1) + " --- " + students[i]);
                    }
                
                    System.out.print("Please input student ID: ");
                    int student_id = input.nextInt();
                    
                    if(student_id > 0 && student_id <= student_count){
                        String selected_student = students[student_id - 1];
                        System.out.println("You selected student " + selected_student + "\n");
                        
                        if(perfect_ww_score == 0){
                            System.out.print("Please input Written Works perfect score: ");
                            perfect_ww_score = input.nextDouble();
                        }
                        double ww_score = 0.0; 
                        while(true){
                            System.out.print("Please enter Written Works total score:  ");
                            ww_score = input.nextDouble();
                            if (ww_score > perfect_ww_score){
                                System.out.println("Invalid Score, Please Input Again");
                            }else{
                                double ww_partial = ((ww_score / perfect_ww_score) * 100);
                                System.out.println("Written Works partial score is " + ww_partial);
                                ww_scores[student_id - 1] = ww_score;
                                ww_input_counter++;
                                break;
                            }
                        } 
                    }else{
                        System.out.print("Student Not Found!");
                    }
                    
                }else if (input_score_type_ID == 3){
                    System.out.println("Quarterly Assessment");
        
                    for(int i =0;i< student_count;i++){
                        System.out.println((i+1) + " --- " + students[i]);
                    }
                
                    System.out.print("Please input student ID: ");
                    int student_id = input.nextInt();
                    
                    if(student_id > 0 && student_id <= student_count){
                        String selected_student = students[student_id - 1];
                        System.out.println("You selected student " + selected_student + "\n");
                        
                        if(perfect_qa_score == 0){
                            System.out.print("Please input Quarterly Assessment perfect score: ");
                            perfect_qa_score = input.nextDouble();
                        }
                        double qa_score = 0.0; 
                        while(true){
                            System.out.print("Please enter Quarterly Assessment total score:  ");
                            qa_score = input.nextDouble();
                            if (qa_score > perfect_qa_score){
                                System.out.println("Invalid Score, Please Input Again");
                            }else{
                                double qa_partial = ((qa_score / perfect_qa_score) * 100);
                                System.out.println("Quarterly Assessment partial score is " + qa_partial);
                                qa_scores[student_id - 1] = qa_score;
                                qa_input_counter++;
                                break;
                            }
                        } 
                    }else{
                        System.out.print("Student Not Found!");
                    }
                }
                
                if(pt_input_counter >= 5 && ww_input_counter >= 5 && qa_input_counter >= 5){
                    for(int i =0;i< student_count; i++){
                        double pt_score = pt_scores[i];
                        double ww_score = ww_scores[i];
                        double qa_score = qa_scores[i];
                        double pt_total = ((pt_score / perfect_pt_score) * 100)* 0.40;
                        double qa_total = ((qa_score / perfect_qa_score) * 100)* 0.20;
                        double ww_total = ((ww_score / perfect_ww_score) * 100)* 0.40;
                        double final_total = pt_total + qa_total + ww_total;
                        
                        grades[i] = final_total;
                        pt_scores[i] = pt_score;
                        qa_scores[i] = qa_score;
                        ww_scores[i] = ww_score;
                    
                        if(final_total < 75){
                            statuses[i] = "Failed";
                        }
                    }
                    System.out.println("SUMMARY");
        
                    System.out.println("Student Name \t PT score \t QA score \t WW score \t Final Grade: ");
        
                    for(int i =0;i< student_count;i++){
                        System.out.println(students[i] + "\t" + pt_scores[i] + "\t" + qa_scores[i] + "\t" + ww_scores[i] + "\t" + grades[i] +
                        "("+ statuses[i] + ")");
                    }
                    System.out.println("\n--THANK YOU FOR USING--");
                    break;
                }
                     
            }
            else if (action_ID == 3){
                System.out.print("Logout: Thank you for using ");
                break;
            }
        }    
    }
    
    private static int viewNavigation(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect Action");
        String[] navigation = {"View Students", "Grade Students", "Logout"};
        int nav_count = navigation.length;
    
        for(int i =0;i< nav_count;i++){
            System.out.println((i+1) + " - " + navigation[i]);
        }
         System.out.print("Select Action ID: ");
         int input_action_ID = input.nextInt();
         return input_action_ID;
    }
    
    private static int viewScoreTypes(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect Score Type");
        String[] score_types = {"Performance Task", "Written Works", "Quarterly Assessment"};
        int score_type_count = score_types.length;
    
        for(int i =0;i< score_type_count;i++){
            System.out.println((i+1) + " - " + score_types[i]);
        }
        System.out.print("Select Score Type ID: ");
        int input_score_type_ID = input.nextInt();
        return input_score_type_ID;
    }
    
}
