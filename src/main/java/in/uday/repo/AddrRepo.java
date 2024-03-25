package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Address;

public interface AddrRepo extends JpaRepository<Address, Integer>{

}
