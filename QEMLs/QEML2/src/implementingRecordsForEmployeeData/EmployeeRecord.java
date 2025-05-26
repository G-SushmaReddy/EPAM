package implementingRecordsForEmployeeData;

record EmployeeRecord(String name,double salary)
{
    public EmployeeRecord{
        if(name==null || name.isEmpty() || salary<0)
        {
            throw new IllegalArgumentException("Name cannot be null,salary cannot be negative");
        }
    }
}
