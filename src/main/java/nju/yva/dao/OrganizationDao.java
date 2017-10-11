package nju.yva.dao;

import nju.yva.model.OrganizationData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Water on 2017/8/19.
 */
public interface OrganizationDao extends JpaRepository<OrganizationData, Long> {
    OrganizationData findOneById(long id);
}
