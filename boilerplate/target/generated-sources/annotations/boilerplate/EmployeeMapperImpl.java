package boilerplate;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-12T19:43:07+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.3.1300.v20210419-1022, environment: Java 16.0.2 (Oracle Corporation)"
)
*/
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO employeetoEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmployeeName( employee.getEmpName() );
        employeeDTO.setDept( employee.getDept() );
        employeeDTO.setEmail( employee.getEmail() );

        return employeeDTO;
    }
}
