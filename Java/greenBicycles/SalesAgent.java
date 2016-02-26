public class SalesAgent extends SalesEmployee{
        //constructor ,calling super class
        public SalesAgent(){
                super();
        }
        @Override
        public float calculateCommission(){
		commission = (sales * 0.1f);
                return commission;
        }
        @Override
        public String toString(){
                return "Ppsnumber:"+getPpsnumber()+" Sales:"+getSales()+" Commission:"+getCommission();
        }
}
 
