package in.uday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.uday.entity.Address;
import in.uday.entity.Employee;
import in.uday.repo.AddrRepo;
import in.uday.repo.EmpRepo;

@Service
public class EmpService {
  @Autowired
  private EmpRepo erepo;
  @Autowired
  private AddrRepo arepo;
  public void saveemp() {
	  Employee e =new Employee();
	  e.setName("perry");
	  e.setSalary(1000.00);
	  
	  Employee s = erepo.save(e);
	  System.out.println("saved emp...");
	  Address a=new Address();
	  a.setCity("hyd");
	  a.setState("tg");
	  a.setCountry("india");
	  a.setEid(s.getEid());
	  arepo.save(a);
  }
}
