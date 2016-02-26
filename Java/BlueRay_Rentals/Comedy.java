public class Comedy extends Film{
        //constructor ,calling super class
        public Comedy(int Idnumber,String Title, String Classification){
                super(Idnumber, Title, Classification);
        }
        //Override the calculateLateFee method
        public double calculateLateFee(int days_late){
                return (days_late*5); 
      
        }
        //Overide the toString method
        @Override
        public String toString(){
                return "Idnumber: "+getIdnumber()+" Title: "+getTitle()+" Classicfication: "+getClassification();
        }
}
 

