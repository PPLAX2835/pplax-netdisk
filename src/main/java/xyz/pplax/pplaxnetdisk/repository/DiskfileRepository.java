package xyz.pplax.pplaxnetdisk.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import xyz.pplax.pplaxnetdisk.entity.Diskfile;

public interface DiskfileRepository extends JpaRepository<Diskfile, String> {

//	@Query(value = "select * from diskfile where appid = ?1", nativeQuery = true)
//	@Modifying
//	@Transactional
	Page<Diskfile> findByAppid(int appid, Pageable pageable);

}