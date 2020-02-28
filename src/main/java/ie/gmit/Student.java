package ie.gmit;

class Student {

    private String name;
    private String email;


    public Student(){
        this.name = null;
        this.email = null;
    }


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
