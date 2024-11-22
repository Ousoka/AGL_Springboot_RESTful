package uam.dsti.sb_online_shop.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "owners")
public interface CarOwnerRepository extends JpaRepository<CarOwner, Long> {
    // Any custom query methods can be added here if needed
}
