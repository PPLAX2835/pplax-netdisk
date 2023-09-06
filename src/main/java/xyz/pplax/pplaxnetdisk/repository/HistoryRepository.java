package xyz.pplax.pplaxnetdisk.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.pplax.pplaxnetdisk.entity.History;

public interface HistoryRepository extends PagingAndSortingRepository<History, Long> {

}