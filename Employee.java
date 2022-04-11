class Employee
{
  String Name;
  int Year;
  String Address;
  Main(String nam,int years, String addr)
  {
    Name=nam;
    Year=years; 
    Address=addr;
  }
  void raj()
  {
    System.out.println(Name+ "        " +Year + "         "     +Address);                                          
  }
  void shay()
  {
    System.out.println(Name+ "     " +Year + "            "     +Address);                                          
  }
  void anu()
  {
    System.out.println(Name+ "    "+Year + "       "     +Address);                                          
  }
}
class EmployeeDetails
{
  public static void main(String args[])
  {
    System.out.println("Name" +   "  Year of Joining     " + "Address" );
    Employee emp=new Employee("Raj", 2000, "68D-WallsStreet");
    emp.raj();
    Employee emp1=new Employee("Shay", 1994, "64C-WallsStreet");
    emp1.shay();
    Employee emp2=new Employee("Anu", 2002, "70F-WallsStreet");
    emp2.anu()
  }

}
