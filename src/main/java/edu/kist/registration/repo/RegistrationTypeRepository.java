package edu.kist.registration.repo;

import edu.kist.registration.entity.RegistrationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegistrationTypeRepository extends JpaRepository<RegistrationType, Integer>, JpaSpecificationExecutor<RegistrationType> {

}