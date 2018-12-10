
public class EmployeeFactory {
	
	public static Employee createemployeewithType(String dutyType) {
		
		Employee employee = new Employee();
		
		if("manager".equals(dutyType) || "director".equals(dutyType)) {
			
			employee.setId(1);
			employee.setName("Aydýn");
			employee.setDutyType(dutyType);
			
			return employee;
			
		}else {
			throw new IllegalArgumentException();
		}
		
		
	}

}
