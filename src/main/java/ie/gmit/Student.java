package ie.gmit;
/*
 Student class - stores student details

 Renan Moraes
 G00353112
 21/02/2020
 */
class Student {

    private String name;
    private String email;

    /*@brief: Default constructor initializes with null values*/
    public Student(){
        this.name = null;
        this.email = null;
    }

    /*@brief: 2-arg constructor with check for empty parameters
     @param: name - student's name
     @param: email - student's email
     */
    public Student(String name, String email){
        if(name.isEmpty() || email.isEmpty())
            throw new NullPointerException("Name or email is empty!");
        else{
            this.name = name;
            this.email =email;
        }
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


}
