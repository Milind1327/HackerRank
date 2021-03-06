class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores ){
        super(firstName,lastName,id);
        testScores=scores;
    }

    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int sum=0;
        float avg=0.0f;
        for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];
        }
        avg=sum/testScores.length;
        
        if(avg>=90 & avg<=100){
            return 'O';
        }   else if(avg>=80 & avg<90){
                return 'E';}
                else if(avg>=70 & avg<80){
                    return 'A';}
                    else if(avg>=55 & avg<70){
                        return 'P';}
                            else if(avg>=40 & avg<55){
                                return 'D';}
        else
            return 'T';
    }
                                
 }