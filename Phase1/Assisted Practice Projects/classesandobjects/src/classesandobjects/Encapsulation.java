package classesandobjects;

class Companyinfo{
    
    private int id;
    private String name;
    private static String company;
    
    public int getId() {
   	 return id;
    }
    public void setId(int id) {
   	 this.id = id;
    }
    public String getName() {
   	 return name;
    }
    public void setName(String name) {
   	 this.name = name;
    }
    public static String getCompany() {
   	 return company;
    }
    public static void setCompany(String company) {
   	 Companyinfo.company = company;
    }
    
    
   	 
}
public class Encapsulation{
    public static void main(String[] args) {
   	 Companyinfo info=new Companyinfo();
   	 info.setId(101);
   	 info.setName("karthik");
   	 System.out.println(info.getId());
    }
}


