package xyz.pplax.pplaxnetdisk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import xyz.pplax.pplaxnetdisk.entity.App;

public interface AppRepository extends CrudRepository<App, Integer> {

    @Query(value = "select * from app where code=?1 ", nativeQuery = true)
    @Modifying
    @Transactional
	public List<App> findbyCode(String code);

    @Query(value = "select * from app where code=?1 and name=?2", nativeQuery = true)
    @Modifying
    @Transactional
	public List<App> findByCodeAndName(String code,String name);
	
	@Query(value = "delete from app where code=?1 ", nativeQuery = true)
    @Modifying
    @Transactional
    public void deleteAppByCode(String code);
	
	@Query(value = "update app set name=?1 where id=?2 ", nativeQuery = true)
    @Modifying
    @Transactional
    public Integer updateAppName(String name,int id);

}
