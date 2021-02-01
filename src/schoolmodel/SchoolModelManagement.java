/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmodel;



/**
 *
 * @author ro1
 * This class is a representation for every class in the model, each in array
 */
public class SchoolModelManagement {
  private Student student; //method get student, has a problem with return.... table and sClass too. 
   private Lecture[] arrayOfLectures;
  private int numberOfLectures;
   private Student [] arrayOfStudents;
   private int numberOfStudents; 
   private sClass[] arrayOfsClasses;
   private int numberOfSClasses;
   private sClass sc;
   private Book[] arrayOfBooks; 
   private int numberOfBooks; 
   private Table [] arrayOfTables; 
   private Table t;
   private int numberOfTables; 
 
   /**
    * default constructor that assigns default values for the attributes
    */
   public SchoolModelManagement(){
       arrayOfLectures = new Lecture[100];
       numberOfLectures =0; 
       arrayOfStudents = new Student[100];
       numberOfStudents = 0;
       arrayOfsClasses= new sClass[100];
       numberOfSClasses =0; 
       arrayOfBooks = new Book[100];
       numberOfBooks = 0;
       arrayOfTables = new Table[100]; 
       numberOfTables= 0; 
   }
 /**
  * 
  * @param lecture to add it for the array of lectures 
  */
    public void addLecture(Lecture lecture){ //add lectures 
     arrayOfLectures[numberOfLectures++] = lecture; 
     
    }
    /**
     * 
     * @param id to be the id of the lecture i want to find its duration 
     * @return the duration period of a lecture in the array
     */
    public long getDurationOfLecture( long id){ // x is the lecture's number
        for(int i=0; i<numberOfLectures; i++){
            if(arrayOfLectures[i].getId()== id)
                return arrayOfLectures[i].getPeriod().toMinutes();
        }
   return 0; }
    
    public String getNameOLecture( long id){ // x is the lecture's number
        for(int i=0; i<numberOfLectures; i++){
            if(arrayOfLectures[i].getId()== id)
                return arrayOfLectures[i].getName();}
    return "";}
    
    /**
     * 
     * @return number of lectures in the array of lectures
     */
    public int getNumberOfLectures(){
        return numberOfLectures;
    }
    //Students array
    /**
     * 
     * @param student to add to the array of students
     */
    public void addStudent(Student student){
        arrayOfStudents[numberOfStudents++] = student;
    }
    /**
     * 
     * @param id to be the id of the student i want to find his\hers name
     * @return the name of the students
     */
    public String getStudentName(long id){
        for(int i=0; i<numberOfStudents; i++){
            if(arrayOfStudents[i].getId()== id)
                return arrayOfStudents[i].getName();
        }
       return "Not Found"; 
    }
    /**
     * 
     * @param id to be the id of the student i want to search for
     * @return student if found. 
     */
    public Student getStudent(long id){
        
     for(int i=0; i<numberOfStudents; i++){
            if(arrayOfStudents[i].getId()== id)
                student= (arrayOfStudents[i]);
    }
     return student ; 
    }
    /**
     *  
     * @return string representing a list of all students in the array
     */
    public String getStudents(){  //print all students
        String s = "";
        for(int i=0; i<numberOfStudents;i++ ){
          s+= arrayOfStudents[i] +"\n";
        }
      return s; 
    }
    /**
     *  
     * @param student to be the student wanted to be deleted
     */
    public void deletStudent(Student student){
       
     for(int i=0; i<numberOfStudents; i++){
            if(arrayOfStudents[i].equals(student)){
             for(int j= i+1 ; j< numberOfStudents; j++) 
                 arrayOfStudents[j-1] = arrayOfStudents[j]; 
            }
    
    } 
   numberOfStudents--; 
}
    /**
     * 
     * @return number of students in the list
     */
    public int getNumberOfStudents(){
        return numberOfStudents; 
    }
  /**
   * representation for sClass
   */
    /**
     * 
     * @param sc to add to the array of school classes
     */
    public void addsClass(sClass sc){
        arrayOfsClasses[numberOfSClasses++] = sc;
    }
    /**
     * 
     * @param id to be the id of the school class i want to search for
     * @return the sClass with this id number
     */
    public sClass getsClass(long id){
         
        for (int i=0; i<numberOfSClasses; i++){
            
            if(arrayOfsClasses[i].getId()==id)
                this.sc= arrayOfsClasses[i] ;
    }
        return this.sc;
    }
    /**
     * 
     * @return list of all sClasses in the array of the sClasses 
     */
    public String getclasses(){
        String s= "";
        for (int i=0; i<numberOfSClasses; i++)
            s+= arrayOfsClasses + "\n";
   return s ;
    }
    /**
     * 
     * @return number of sClasses added to the list
     */
    public int getNumberOfClasses(){
        return numberOfSClasses; 
    }
    /**
     * 
     * @param book to be the book to be added
     */
    public void addBook(Book book){
        arrayOfBooks[numberOfBooks++]= book;
    }
    /**
     * 
     * @param yearOfRelease to be the identifier to search upon
     * @return the book with this year of release, if more than one, return them all
     */
    public String getBook(int yearOfRelease){
        String s= "";
        for(int i= 0; i<numberOfBooks; i++){
            if(arrayOfBooks[i].getYearOfRelease()== yearOfRelease)
                s+= arrayOfBooks[i] +"\n"; 
        }
   return s;  }
    /**
     * 
     * @return list of all the books in the list
     */
    public String GetAllBooks(){
        String s=" ";
        for(int i =0 ;i< numberOfBooks; i++)
            s+= arrayOfBooks[i]+ "\n";    
    return s;}
    
  /**
   * 
   * @param table to be added to the array of tables
   */
    public void addTable(Table table){
      arrayOfTables[numberOfTables++]= table;  
    }
    /**
     * 
     * @param table to be deleted
     * @return 
     */
      public Table deleteTable(Table table){
          Table t = table;
        for(int i=0; i< numberOfTables; i++){
            if(arrayOfTables[i].equals(table)){
              //  t = new Table (table.getId(), table.getLectures(), table.getSchoolClass());
                for(int j= i+1; j< numberOfTables; j++){
                    arrayOfTables[j-1] = arrayOfTables[j];
                }
            }
        }  
       return t;}
      /**
       * 
       * @param t to be a table in the list to view its lecture
       * @return lecture assigned to this table
       */
      public Lecture getlectureFromTable(Table t){ //all tables are in the array, i must search for this specific table
        for(int i=0; i < numberOfTables ; i++) {
            if(arrayOfTables[i].equals(t))
              this.t = arrayOfTables[i];           
        }
       return this.t.getLectures();
       
      }
      /**
       * 
       * @param t to be  table in the list to view its sClass
       * @return sClass of this table
       */
      public sClass getSClassFromTable(Table t){
             for(int i=0; i < numberOfTables ; i++) {
            if(arrayOfTables[i].equals(t))
              this.t = arrayOfTables[i];           
        }
       return this.t.getSchoolClass();
          
      }
}
