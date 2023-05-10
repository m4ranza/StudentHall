package com.mycompany.student_halls;


import java.util.ArrayList;

/** Collection class to hold a list of students */

public class StudentHall  
{
    private ArrayList<Student> StudentsHome;
    public final int MAX;
    public String hallName;
        
    /** Constructor initialises the empty students list and sets the maximum list size 
     *  @param   maxIn The maximum number of students in the list
     */
    public StudentHall(String theHallName, int maxIn)
    {
        StudentsHome = new ArrayList<>();
        MAX = maxIn;
        hallName = theHallName;
    }
	
    /** Adds a new Student to the list
     *  @param  resident The student to add
     *  @return Returns true if the student was added successfully and false otherwise
     */
    
    //you should be able to make similar code to delete students, search for students etc
    public boolean addStudent(Student resident)
    {
        if(!isMax())
        {
            StudentsHome.add(resident);
            return true;
        }
        else
        {
            return false;
        }
    }
     
        


   /** Reports on whether or not the list is empty
     *  @return Returns true if the list is empty and false otherwise
     */
    public boolean isEmpty()
    {
        return StudentsHome.isEmpty();
    }
	
    /** Reports on whether or not the list is full
     *  @return Returns true if the list is full and false otherwise
     */	
    public boolean isMax()
    {
        return StudentsHome.size()== MAX;
    }
        
    /** Gets the total number of students 
     *  @return Returns the total number of students currently in the list 
     */
    public int getTotal()
    {       
        return StudentsHome.size();
    }
      
     /** Reads the student at the given position in the list
     *  @param      positionIn The position of the student in the list
     *  @return     Returns the student at the  position in the list
     *              or null if no student at that logical position
     */
    public Student getStudent(int positionIn)
    {
        if (positionIn < 0 || positionIn >= getTotal()) // check for valid position
        {
            return null; // no object found at given position
        }
        else
        {
            // remove one from logical poition to get ArrayList position
            return StudentsHome.get(positionIn);
        }
    }
    
     /** Outputs all the students in the list
     *  @return     Returns all the students and owners in the list in an easy to read format
     */
    
    public String displayStudents()
    {
      String output = "\n";  
      output += "Students in the " + hallName + "\n";
      for (int counter = 0; counter < StudentsHome.size(); counter++) { 
          output += "Student ID: " + StudentsHome.get(counter).getId() + "\n";
          output += "Student Name: " + StudentsHome.get(counter).getName()+ "\t" + StudentsHome.get(counter).getSurname();
          output += "\nGender: " +StudentsHome.get(counter).getGender();
          output += "\nDate of Birth: " + StudentsHome.get(counter).getDob();	
          output += "\n\n";
      } 
        return output;
  
    }
}

